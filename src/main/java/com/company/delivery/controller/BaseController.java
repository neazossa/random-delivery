package com.company.delivery.controller;

import com.company.delivery.models.BaseResponse;
import com.company.delivery.models.constant.GlobalMessage;
import com.company.delivery.utils.Datetimes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class BaseController {

  public static BaseResponse<?> createSuccessResponse(Object data){
    return BaseResponse.builder()
        .code(GlobalMessage.SUCCESS.code)
        .message(GlobalMessage.SUCCESS.message)
        .data(data)
        .errors(new ArrayList<>())
        .serverTime(Datetimes.toStringAllDatetime(new Date()))
        .build();
  }

  public static BaseResponse<?> createResponse(GlobalMessage message, List<String> err, Object data){
    return BaseResponse.builder()
        .code(message.code)
        .message(message.message)
        .data(data)
        .errors(err)
        .serverTime(Datetimes.toStringAllDatetime(new Date()))
        .build();
  }

}
