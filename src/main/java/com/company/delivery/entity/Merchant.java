package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "merchant")
@Entity
public class Merchant extends BaseEntity{

  @Id
  private String merchantId;

  private String merchantName;

  private String merchantAddr1;

  private String merchantAddr2;

  private String merchantCity;

  private String merchantRegion;

  private String merchantCountry;

  private String merchantMapLocation;

  private String merchantContact;

  private boolean isActive;

  @OneToOne(cascade = CascadeType.ALL, optional = false)
  @JoinColumn(name = "packaging_id")
  private PackagingItem packagingItem;

}
