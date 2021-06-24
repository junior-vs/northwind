package tech.vsj.northwind.rh.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import tech.vsj.northwind.rh.model.Territory;

public class TerritoryDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private String territoryId;

  private String territoryDescription;

  private List<EmployeeDTO> employees;

  private RegionDTO region;

  public TerritoryDTO(Territory territory) {
    super();
    this.territoryId = territory.getTerritoryId();
    this.territoryDescription = territory.getTerritoryDescription();
    this.employees =
        territory.getEmployees().stream().map(EmployeeDTO::new).collect(Collectors.toList());
    this.region = new RegionDTO(territory.getRegion());
  }

  public String getTerritoryId() {
    return territoryId;
  }

  public String getTerritoryDescription() {
    return territoryDescription;
  }

  public List<EmployeeDTO> getEmployees() {
    return employees;
  }

  public RegionDTO getRegion() {
    return region;
  }

  @Override
  public String toString() {
    return String
        .format("TerritoryDTO [territoryId=%s, territoryDescription=%s, employees=%s, region=%s]",
            territoryId, territoryDescription, employees, region);
  }
}
