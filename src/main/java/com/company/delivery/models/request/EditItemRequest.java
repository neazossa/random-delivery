package com.company.delivery.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditItemRequest {

    private String itemName;
    private String description;
    private Double weight;
    private Double length;
    private Long price;

}
