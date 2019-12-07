package mvcapp.AppV1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mvcapp.AppV1.services.CountryService;

/**
 * CountryController
 */
@Controller
@RequestMapping("/country")
public class CountryController {

  @Autowired
  CountryService countryService;

  @GetMapping("/")
  public String showCountry(Model model) {
    model.addAttribute("countries", countryService.getCountry());
    return "pages/country";
  }
}