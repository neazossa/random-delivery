package com.company.delivery.services;

import com.company.delivery.entity.ItemCategory;
import com.company.delivery.models.constant.Operation;
import com.company.delivery.models.request.AddItemRequest;
import com.company.delivery.models.request.EditItemRequest;

public interface ItemService {

   ItemCategory addItem(AddItemRequest request);

   ItemCategory editItem(String itemId, EditItemRequest request);

   Operation deleteItem(String itemId);
}
