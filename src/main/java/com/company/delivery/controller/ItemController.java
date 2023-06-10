package com.company.delivery.controller;

import com.company.delivery.controller.BaseController;
import com.company.delivery.models.ApiPath;
import com.company.delivery.models.BaseResponse;
import com.company.delivery.models.request.AddItemRequest;
import com.company.delivery.models.request.EditItemRequest;
import com.company.delivery.repository.ItemCategoryRepository;
import com.company.delivery.services.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(ApiPath.ITEM)
public class ItemController extends BaseController {

  @Autowired
  private ItemService itemService;

  @PostMapping(value = ApiPath.ADD, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> addItems(@RequestBody AddItemRequest request) {
    log.info("/item/add start ItemsController.addItems()");
    return createSuccessResponse(itemService.addItem(request));
  }

  @PatchMapping(value = "/{itemId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> editItems(@PathVariable("itemId") String itemId, @RequestBody EditItemRequest request) {
    log.info("/item start ItemsController.editItems()");
    return createSuccessResponse(itemService.editItem(itemId, request));
  }

  @DeleteMapping(value = "/{itemId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> editItems(@PathVariable("itemId") String itemId) {
    log.info("/item start ItemsController.deleteItems()");
    return createSuccessResponse(itemService.deleteItem(itemId));
  }

}
