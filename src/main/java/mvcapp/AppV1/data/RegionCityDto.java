package mvcapp.AppV1.data;

/**
 * RegionCityDto
 */
public class RegionCityDto {

  private Integer regionId;
  private String regionName;
  private String countryId;
  private String countryName;

  public RegionCityDto() {
  }

  public RegionCityDto(Integer regionId, String regionName, String countryId, String countryName) {
    this.regionId = regionId;
    this.regionName = regionName;
    this.countryId = countryId;
    this.countryName = countryName;
  }

  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

}