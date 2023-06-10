package com.company.delivery.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeliveryResponse {

  private String distributionId;
  private List<DistributionDetail> distributionDetailList;
  private String deliveryDate;
  private String status;

}
