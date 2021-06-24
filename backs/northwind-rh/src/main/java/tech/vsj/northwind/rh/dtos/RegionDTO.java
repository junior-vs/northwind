package tech.vsj.northwind.rh.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import tech.vsj.northwind.rh.model.Region;

public class RegionDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer regionId;

  private String regionDescription;

  private List<TerritoryDTO> territories;

  public RegionDTO(Region region) {
    super();
    this.regionId = region.getRegionId();
    this.regionDescription = region.getRegionDescription();
    this.territories =
        region.getTerritories().stream().map(TerritoryDTO::new).collect(Collectors.toList());
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public Integer getRegionId() {
    return regionId;
  }

  public String getRegionDescription() {
    return regionDescription;
  }

  public List<TerritoryDTO> getTerritories() {
    return territories;
  }

  @Override
  public String toString() {
    return String
        .format("RegionDTO [regionId=%s, regionDescription=%s, territories=%s]", regionId,
            regionDescription, territories);
  }



}
