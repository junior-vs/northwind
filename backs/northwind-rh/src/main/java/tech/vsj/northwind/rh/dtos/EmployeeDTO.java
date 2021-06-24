package tech.vsj.northwind.rh.dtos;

import java.io.Serializable;
import javax.persistence.*;
import tech.vsj.northwind.rh.model.Employee;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer employeeId;

  private String address;

  private Date birthDate;

  private String city;

  private String country;

  private String extension;

  private String firstName;

  private Date hireDate;

  private String homePhone;

  @Column(name = "last_name", nullable = false, length = 20)
  private String lastName;
  private String notes;

  private byte[] photo;

  private String photoPath;

  private String postalCode;

  private String region;

  private String title;

  private String titleOfCourtesy;

  private EmployeeDTO reportsTo;

  private List<TerritoryDTO> territories;


  public EmployeeDTO(Employee employee) {
    super();
    this.employeeId = employee.getEmployeeId();
    this.address = employee.getAddress();
    this.birthDate = employee.getBirthDate();
    this.city = employee.getCity();
    this.country = employee.getCountry();
    this.extension = employee.getExtension();
    this.firstName = employee.getFirstName();
    this.hireDate = employee.getHireDate();
    this.homePhone = employee.getHomePhone();
    this.lastName = employee.getLastName();
    this.notes = employee.getNotes();
    this.photo = employee.getPhoto();
    this.photoPath = employee.getPhotoPath();
    this.postalCode = employee.getPostalCode();
    this.region = employee.getRegion();
    this.title = employee.getTitle();
    this.titleOfCourtesy = employee.getTitleOfCourtesy();
    
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public Integer getEmployeeId() {
    return employeeId;
  }

  public String getAddress() {
    return address;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public String getCity() {
    return city;
  }

  public String getCountry() {
    return country;
  }

  public String getExtension() {
    return extension;
  }

  public String getFirstName() {
    return firstName;
  }

  public Date getHireDate() {
    return hireDate;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNotes() {
    return notes;
  }

  public byte[] getPhoto() {
    return photo;
  }

  public String getPhotoPath() {
    return photoPath;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public String getRegion() {
    return region;
  }

  public String getTitle() {
    return title;
  }

  public String getTitleOfCourtesy() {
    return titleOfCourtesy;
  }



  public EmployeeDTO getReportsTo() {
    return reportsTo;
  }

  public List<TerritoryDTO> getTerritories() {
    return territories;
  }

  @Override
  public String toString() {
    return String
        .format(
            "EmployeeDTO [employeeId=%s, address=%s, birthDate=%s, city=%s, country=%s, extension=%s, firstName=%s, hireDate=%s, homePhone=%s, lastName=%s, notes=%s, photo=%s, photoPath=%s, postalCode=%s, region=%s, title=%s, titleOfCourtesy=%s, reportsTo=%s, territories=%s]",
            employeeId, address, birthDate, city, country, extension, firstName, hireDate,
            homePhone, lastName, notes, Arrays.toString(photo), photoPath, postalCode, region,
            title, titleOfCourtesy, reportsTo, territories);
  }



}
