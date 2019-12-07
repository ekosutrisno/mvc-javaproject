package mvcapp.AppV1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * CountryModel
 */

@Entity
@Table(name = CountryModel.TABLE_NAME)
public class CountryModel {
  static final String TABLE_NAME = "countries";

  @Id
  @Column(name = "country_id")
  @Size(max = 2)
  private String countryId;

  @Column(name = "country_name")
  @Size(max = 40)
  private String countryName;

  @ManyToOne
  @JoinColumn(name = "region_id")
  private RegionsModel regionsModel;

  public CountryModel() {
  }

  public CountryModel(String countryId, @Size(max = 40) String countryName) {
    this.countryId = countryId;
    this.countryName = countryName;
  }

  public static String getTableName() {
    return TABLE_NAME;
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

  public RegionsModel getRegionsModel() {
    return regionsModel;
  }

  public void setRegionsModel(RegionsModel regionsModel) {
    this.regionsModel = regionsModel;
  }

  public CountryModel(String countryId, @Size(max = 40) String countryName, RegionsModel regionsModel) {
    this.countryId = countryId;
    this.countryName = countryName;
    this.regionsModel = regionsModel;
  }
}
