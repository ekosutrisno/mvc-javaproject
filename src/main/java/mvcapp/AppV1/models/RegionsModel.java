package mvcapp.AppV1.models;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.*;
import javax.validation.constraints.Size;

import mvcapp.AppV1.data.RegionCityDto;

@SqlResultSetMapping(name = "regionMapping", classes = {
    @ConstructorResult(targetClass = RegionCityDto.class, columns = {
        @ColumnResult(name = "region_id", type = Integer.class),
        @ColumnResult(name = "region_name", type = String.class),
        @ColumnResult(name = "country_id", type = String.class),
        @ColumnResult(name = "country_name", type = String.class) }) })
@NamedNativeQuery(name = "RegionsModel.getRegionCountries", resultSetMapping = "regionMapping", query = "select a.region_id,a.region_name,b.country_id,b.country_name "
    + " from regions a  join countries b on a.region_id=b.region_id order by a.region_id")

/**
 * RegionsModel
 */
@Entity
@Table(name = "regions")
public class RegionsModel {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "region_id_seq")
  @SequenceGenerator(name = "region_id_seq", sequenceName = "regions_region_id_seq", initialValue = 4, allocationSize = 1)
  @Column(name = "region_id")
  private Integer regionId;

  @Column(name = "region_name")
  @Size(max = 25)
  private String regionName;

  @OneToMany(mappedBy = "regionsModel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<CountryModel> countries;

  // Constructor
  RegionsModel() {
  }

  public RegionsModel(String regionName) {
    this.regionName = regionName;
  }

  public RegionsModel(Integer regionId, String regionName) {
    this.regionId = regionId;
    this.regionName = regionName;
  }

  // untuk objek one-to-many
  public RegionsModel(String regionName, CountryModel... countries) {
    this.regionName = regionName;
    this.countries = Stream.of(countries).collect(Collectors.toSet());
    this.countries.forEach(x -> x.setRegionsModel(this));
  }

  // getter dan settes
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

  public Set<CountryModel> getCountries() {
    return countries;
  }

  public void setCountries(Set<CountryModel> countries) {
    this.countries = countries;
  }
}