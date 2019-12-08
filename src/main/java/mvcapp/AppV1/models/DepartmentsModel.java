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
 * DepartmentsModel
 */
@Entity
@Table(name = DepartmentsModel.TABLE_NAME)
public class DepartmentsModel {
  public static final String TABLE_NAME = "departments";

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_id_seq")
  @SequenceGenerator(name = "department_id_seq", sequenceName = "departments_department_id_seq", initialValue = 11, allocationSize = 1)
  @Column(name = "department_id")
  private Long departmenId;

  @Column(name = "department_name", nullable = false)
  @Size(max = 30)
  private String departmentName;

  @Column(name = "location_id")
  private Integer locationId;

  public DepartmentsModel() {
  }

  public DepartmentsModel(Long departmenId, String departmentName, Integer locationId) {
    this.departmenId = departmenId;
    this.departmentName = departmentName;
    this.locationId = locationId;
  }

  public static String getTableName() {
    return TABLE_NAME;
  }

  public Long getDepartmenId() {
    return departmenId;
  }

  public void setDepartmenId(Long departmenId) {
    this.departmenId = departmenId;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

}