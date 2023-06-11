package com.company.delivery.services;

import com.company.delivery.models.request.AddDeliveryRequest;
import com.company.delivery.models.response.DeliveryResponse;

public interface DeliveryService {

  DeliveryResponse addDelivery(AddDeliveryRequest request);

  Object receiveDelivery(String transactionId);
}
