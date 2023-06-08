package com.company.delivery.services.impl;

import com.company.delivery.entity.ItemCategory;
import com.company.delivery.exception.BusinessException;
import com.company.delivery.models.constant.GlobalMessage;
import com.company.delivery.models.constant.Operation;
import com.company.delivery.models.request.AddItemRequest;
import com.company.delivery.models.request.EditItemRequest;
import com.company.delivery.repository.ItemCategoryRepository;
import com.company.delivery.services.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService {

  @Autowired
  private ItemCategoryRepository categoryRepository;

  @Override
  public ItemCategory addItem(AddItemRequest request) {
    ItemCategory category = ItemCategory.builder()
        .description(request.getDescription())
        .nameType(request.getItemName())
        .price(request.getPrice())
        .length(request.getLength())
        .weight(request.getWeight())
        .isDelete(false)
        .itemTypeId(UUID.randomUUID().toString().replace("-",""))
        .createdId("1").createTime(LocalDateTime.now())
        .modifiedId("1").modifiedTime(LocalDateTime.now())
        .build();
    return categoryRepository.save(category);
  }

  @Override
  public ItemCategory editItem(String itemId, EditItemRequest request) {
    Optional<ItemCategory> item = categoryRepository.findById(itemId);
    if(item.isPresent()){
      ItemCategory itemCategory = item.get();
      itemCategory.setDescription(request.getDescription());
      itemCategory.setPrice(request.getPrice());
      itemCategory.setLength(request.getLength());
      itemCategory.setWeight(request.getWeight());
      itemCategory.setNameType(request.getItemName());
      itemCategory.setModifiedTime(LocalDateTime.now());
      itemCategory.setModifiedId("1");
      categoryRepository.save(itemCategory);
      return itemCategory;
    }
    throw new BusinessException(GlobalMessage.DATA_NOT_FOUND);
  }

  @Override
  public Operation deleteItem(String itemId) {
    Optional<ItemCategory> item = categoryRepository.findById(itemId);
    if(item.isPresent()){
      ItemCategory itemCategory = item.get();
      itemCategory.setModifiedTime(LocalDateTime.now());
      itemCategory.setModifiedId("1");
      itemCategory.setDelete(true);
      categoryRepository.save(itemCategory);
      return Operation.EXECUTED;
    }
    throw new BusinessException(GlobalMessage.DATA_NOT_FOUND);
  }

}
