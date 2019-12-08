package mvcapp.AppV1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * locationsModel
 */

@Entity
@Table(name = locationsModel.TABLE_NAME)
public class locationsModel {

  public static final String TABLE_NAME = "locations";

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "location_id_seq")
  @SequenceGenerator(name = "location_id_seq", sequenceName = "locations_location_id_seq", initialValue = 7, allocationSize = 1)
  @Column(name = "location_id")
  private Integer locationId;

  @Column(name = "street_address")
  @Size(max = 40)
  private String streetAddress;

  @Column(name = "postal_code", insertable = false, updatable = false)
  @Size(max = 12)
  private String postalKode;

  @Column(name = "postal_code", nullable = false)
  @Size(max = 30)
  private String city;

  @Column(name = "country_id", nullable = false)
  @Size(max = 2)
  private String countryId;

  @Column(name = "state_province")
  @Size(max = 52)
  private String stateProvince;

  public locationsModel() {
  }

  public locationsModel(Integer locationId, @Size(max = 40) String streetAddress, @Size(max = 12) String postalKode,
      @Size(max = 30) String city, @Size(max = 2) String countryId, @Size(max = 52) String stateProvince) {
    this.locationId = locationId;
    this.streetAddress = streetAddress;
    this.postalKode = postalKode;
    this.city = city;
    this.countryId = countryId;
    this.stateProvince = stateProvince;
  }

  public static String getTableName() {
    return TABLE_NAME;
  }

  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getPostalKode() {
    return postalKode;
  }

  public void setPostalKode(String postalKode) {
    this.postalKode = postalKode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

}