package mvcapp.AppV1.data;

import java.util.ArrayList;

import mvcapp.AppV1.models.CountryModel;

/**
 * RegionDto
 */

public class RegionDto {

  private String regionName;
  private ArrayList<CountryModel> countries;

  public RegionDto(String regionName, ArrayList<CountryModel> countries) {
    this.regionName = regionName;
    this.countries = countries;
  }

  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  // Mengecek jika array tidak ada
  public ArrayList<CountryModel> getCountries() {
    if (this.countries == null) {
      this.countries = new ArrayList<CountryModel>();
    }
    return countries;
  }

  public void setCountries(ArrayList<CountryModel> countries) {
    this.countries = countries;
  }

}