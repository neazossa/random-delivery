package com.company.delivery.controller;

import com.company.delivery.controller.BaseController;
import com.company.delivery.models.ApiPath;
import com.company.delivery.models.BaseResponse;
import com.company.delivery.models.request.AddItemRequest;
import com.company.delivery.models.request.AddMerchantRequest;
import com.company.delivery.models.request.EditItemRequest;
import com.company.delivery.models.request.EditMerchantRequest;
import com.company.delivery.services.MerchantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(ApiPath.MERCHANT)
public class MerchantController extends BaseController {

  @Autowired
  private MerchantService merchantService;

  @PostMapping(value = ApiPath.ADD, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> addMerchant(@RequestBody AddMerchantRequest request) {
    log.info("/merchant/add start MerchantController.addMerchant()");
    return createSuccessResponse(merchantService.addMerchant(request));
  }

  @PatchMapping(value = "/{merchantId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> editMerchant(@PathVariable("merchantId") String merchantId, @RequestBody EditMerchantRequest request) {
    log.info("/merchant start MerchantController.editMerchant()");
    return createSuccessResponse(merchantService.editMerchant(merchantId, request));
  }

  @DeleteMapping(value = "/{merchantId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> deleteMerchant(@PathVariable("merchantId") String merchantId) {
    log.info("/merchant start MerchantController.deleteMerchant()");
    return createSuccessResponse(merchantService.deleteMerchant(merchantId));
  }

}
