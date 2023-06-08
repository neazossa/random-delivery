package com.company.delivery.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddMerchantRequest {

  private String merchantName;

  private String merchantAddr1;

  private String merchantAddr2;

  private String merchantCity;

  private String merchantRegion;

  private String merchantCountry;

  private String merchantMapLocation;

  private String merchantContact;

}
