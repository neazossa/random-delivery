package com.company.delivery.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddDeliveryRequest {

  private String merchantId;
  private List<DeliveryItemDetail> listItem;
  private String deliveryDate;

}