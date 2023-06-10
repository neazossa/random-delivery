package com.company.delivery.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditMerchantRequest {

  private String merchantName;

  private String merchantAddr1;

  private String merchantAddr2;

  private String merchantCity;

  private String merchantRegion;

  private String merchantCountry;

  private String merchantMapLocation;

  private String merchantContact;

  private boolean isActive;

}
