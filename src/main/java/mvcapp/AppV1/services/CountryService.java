package mvcapp.AppV1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvcapp.AppV1.models.CountryModel;
import mvcapp.AppV1.repositories.CountryRepository;

/**
 * CountryService
 */
@Service
public class CountryService {
  @Autowired
  private CountryRepository countryRepository;

  public Iterable<CountryModel> getCountry() {
    return countryRepository.findAll();
  }

}