package mvcapp.AppV1.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import mvcapp.AppV1.data.RegionDto;
import mvcapp.AppV1.models.CountryModel;
import mvcapp.AppV1.models.RegionsModel;
import mvcapp.AppV1.services.RegionsService;

/**
 * RegionController
 */
@Controller
@RequestMapping("/region")
public class RegionController {
  @Autowired
  private RegionsService regionsService;

  @GetMapping("/")
  public String showRegion(Model model) {
    model.addAttribute("regions", regionsService.findAllRegions());
    return "pages/region";
  }

  @GetMapping("/add")
  public String addRegion(Model model, RegionDto regionDto) {

    for (int a = 0; a < 3; a++) {
      regionDto.getCountries().add(new CountryModel());
    }
    model.addAttribute("regionDto", regionDto);

    return "pages/addEditRegion";
  }

  @PostMapping("/save")
  public String saveRegion(@Valid RegionDto regionDto, BindingResult result) {
    List<CountryModel> listofCountries = regionDto.getCountries();

    regionsService.saveRegion(
        new RegionsModel(regionDto.getRegionName(), listofCountries.toArray(new CountryModel[listofCountries.size()])));

    return "redirect:/region/";
  }

}