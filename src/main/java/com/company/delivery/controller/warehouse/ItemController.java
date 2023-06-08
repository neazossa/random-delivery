package com.company.delivery.controller.warehouse;

import com.company.delivery.controller.BaseController;
import com.company.delivery.models.BaseResponse;
import com.company.delivery.models.request.AddItemRequest;
import com.company.delivery.services.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ItemController extends BaseController {

  @Autowired
  private ItemService itemService;

  @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<?> addItems(@RequestBody AddItemRequest request) {
    log.info("/item/add start ItemsController.addItems()");
    itemService.addItem(request);
    return createSuccessResponse("");
  }

}
