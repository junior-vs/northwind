package tech.vsj.northwind.rh.dtos;

import java.io.Serializable;
import javax.persistence.*;
import tech.vsj.northwind.rh.model.UsState;

public class UsStateDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer stateId;

  private String stateAbbr;

  private String stateName;

  private String stateRegion;

  public UsStateDTO(UsState state) {
    super();
    this.stateId = state.getStateId();
    this.stateAbbr = state.getStateAbbr();
    this.stateName = state.getStateName();
    this.stateRegion = state.getStateRegion();
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public Integer getStateId() {
    return stateId;
  }

  public String getStateAbbr() {
    return stateAbbr;
  }

  public String getStateName() {
    return stateName;
  }

  public String getStateRegion() {
    return stateRegion;
  }

  @Override
  public String toString() {
    return String
        .format("UsStateDTO [stateId=%s, stateAbbr=%s, stateName=%s, stateRegion=%s]", stateId,
            stateAbbr, stateName, stateRegion);
  }

}
