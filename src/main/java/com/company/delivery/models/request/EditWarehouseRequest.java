package com.company.delivery.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditWarehouseRequest {

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