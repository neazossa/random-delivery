package com.company.delivery.controller;

import com.company.delivery.models.request.AddDistributionRequest;
import com.company.delivery.models.ApiPath;
import com.company.delivery.models.BaseResponse;
import com.company.delivery.services.DistributionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(ApiPath.DELIVERY)
public class DistributionController extends BaseController {

  @Autowired
  private DistributionService distributionService;

  @PostMapping(value = ApiPath.ADD, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> addDistribution(@RequestBody AddDistributionRequest request) {
    log.info("/distribution/add start DistributionController.addDistribution()");
    return createSuccessResponse(distributionService.addDistribution(request));
  }

  @PostMapping(value = ApiPath.RECEIVE + "/{transactionId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> receiveDistribution(@PathVariable("transactionId") String request) {
    log.info("/distribution/add start DistributionController.receiveDistribution()");
    return createSuccessResponse(distributionService.receiveDistribution(request));
  }

}
