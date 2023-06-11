package com.company.delivery.services.impl;

import com.company.delivery.entity.Warehouse;
import com.company.delivery.models.constant.Operation;
import com.company.delivery.models.request.AddWarehouseRequest;
import com.company.delivery.models.request.EditWarehouseRequest;
import com.company.delivery.models.response.WarehouseResponses;
import com.company.delivery.repository.WarehouseRepository;
import com.company.delivery.services.WarehouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WarehouseServiceImpl implements WarehouseService {

  @Autowired
  private WarehouseRepository warehouseRepository;

  @Override
  public Warehouse addWarehouse(AddWarehouseRequest request) {
    return null;
  }

  @Override
  public Warehouse editWarehouse(String warehouseId, EditWarehouseRequest request) {
    return null;
  }

  @Override
  public Operation deleteWarehouse(String warehouseId) {
    return null;
  }

  @Override
  public WarehouseResponses getDetailWarehouse(String warehouseId) {
    return null;
  }

}
