package com.company.delivery.controller;

import com.company.delivery.controller.BaseController;
import com.company.delivery.models.ApiPath;
import com.company.delivery.models.BaseResponse;
import com.company.delivery.models.request.AddDeliveryRequest;
import com.company.delivery.services.DeliveryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(ApiPath.DELIVERY)
public class DeliveryController extends BaseController {

  @Autowired
  private DeliveryService deliveryService;

  @PostMapping(value = ApiPath.ADD, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> addDelivery(@RequestBody AddDeliveryRequest request) {
    log.info("/delivery/add start DeliveryController.addDelivery()");
    return createSuccessResponse(deliveryService.addDelivery(request));
  }

  @PostMapping(value = ApiPath.RECEIVE + "/{transactionId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> receiveDelivery(@PathVariable("transactionId") String transactionId) {
    log.info("/delivery/add start DeliveryController.receiveDelivery()");
    return createSuccessResponse(deliveryService.receiveDelivery(transactionId));
  }

}
