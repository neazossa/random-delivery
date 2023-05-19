package com.company.delivery.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@Builder
@Data
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T>{
  private String code;
  private String message;
  private List<String> errors;
  private T data;
  private String serverTime;
}
