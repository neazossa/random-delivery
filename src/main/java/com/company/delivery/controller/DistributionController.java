package com.company.delivery.controller;

import com.company.delivery.models.request.AddDistributionRequest;
import com.company.delivery.models.ApiPath;
import com.company.delivery.models.BaseResponse;
import com.company.delivery.services.DistributionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(ApiPath.DELIVERY)
public class DistributionController extends BaseController {

  @Autowired
  private DistributionService distributionService;

  @PostMapping(value = ApiPath.ADD, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> addDelivery(@RequestBody AddDistributionRequest request) {
    log.info("/distribution/add start DistributionController.addDistribution()");
    return createSuccessResponse(distributionService.addDistribution(request));
  }

}
