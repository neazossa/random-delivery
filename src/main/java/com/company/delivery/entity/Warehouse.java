package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "warehouse")
@Entity
public class Warehouse extends BaseEntity{

  @Id
  private String warehouseId;

  private String warehouseName;

  private String warehouseAddr1;

  private String warehouseAddr2;

  private String warehouseCity;

  private String warehouseRegion;

  private String warehouseCountry;

  private String warehouseMapLocation;

  private String warehouseContact;

  private boolean isActive;

}
