package com.company.delivery.services;

import com.company.delivery.entity.ItemCategory;
import com.company.delivery.entity.Merchant;
import com.company.delivery.models.constant.Operation;
import com.company.delivery.models.request.AddItemRequest;
import com.company.delivery.models.request.AddMerchantRequest;
import com.company.delivery.models.request.EditItemRequest;
import com.company.delivery.models.request.EditMerchantRequest;

public interface MerchantService {

   Merchant addMerchant(AddMerchantRequest request);

   Merchant editMerchant(String merchantId, EditMerchantRequest request);

   Operation deleteMerchant(String merchantId);
}
