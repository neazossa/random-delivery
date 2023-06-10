package com.company.delivery.services;

import com.company.delivery.entity.Warehouse;
import com.company.delivery.models.constant.Operation;
import com.company.delivery.models.request.AddWarehouseRequest;
import com.company.delivery.models.request.EditWarehouseRequest;

public interface WarehouseService {

  Warehouse addWarehouse(AddWarehouseRequest request);

  Warehouse editWarehouse(String warehouseId, EditWarehouseRequest request);

  Operation deleteWarehouse(String warehouseId);
}
