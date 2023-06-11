package com.company.delivery.services.impl;

import com.company.delivery.models.request.AddDeliveryRequest;
import com.company.delivery.models.response.DeliveryResponse;
import com.company.delivery.repository.PackagingItemDetailRepository;
import com.company.delivery.repository.PackagingItemRepository;
import com.company.delivery.services.DeliveryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeliveryServiceImpl implements DeliveryService {

  @Autowired
  private PackagingItemRepository packagingItemHeaderRepository;

  @Autowired
  private PackagingItemDetailRepository packagingItemDetailRepository;

  @Override
  public DeliveryResponse addDelivery(AddDeliveryRequest request) {
    return null;
  }

  @Override
  public Object receiveDelivery(String transactionId) {
    return null;
  }

}
