package com.company.delivery.models.request;

import com.company.delivery.entity.PackagingItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DistributionRequest {

  private String warehouseIdOrigin;
  private String warehouseIdDestination;
  private List<PackagingItem> packagingItemList;
  private String deliveryDate;

}
