package com.company.delivery.controller;

import com.company.delivery.models.ApiPath;
import com.company.delivery.models.BaseResponse;
import com.company.delivery.models.request.AddWarehouseRequest;
import com.company.delivery.models.request.EditWarehouseRequest;
import com.company.delivery.services.WarehouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(ApiPath.WAREHOUSE)
public class WarehouseController extends BaseController {

  @Autowired
  private WarehouseService warehouseService;

  @PostMapping(value = ApiPath.ADD, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> addWarehouse(@RequestBody AddWarehouseRequest request) {
    log.info("/warehouse/add start WarehouseController.addWarehouse()");
    return createSuccessResponse(warehouseService.addWarehouse(request));
  }

  @PatchMapping(value = "/{warehouseId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> editWarehouse(@PathVariable("warehouseId") String warehouseId, @RequestBody EditWarehouseRequest request) {
    log.info("/warehouse start WarehouseController.editWarehouse()");
    return createSuccessResponse(warehouseService.editWarehouse(warehouseId, request));
  }

  @DeleteMapping(value = "/{warehouseId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> deleteWarehouse(@PathVariable("warehouseId") String warehouseId) {
    log.info("/warehouse start WarehouseController.deleteWarehouse()");
    return createSuccessResponse(warehouseService.deleteWarehouse(warehouseId));
  }

}
