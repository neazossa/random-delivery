package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "packaging_item_detail")
public class PackagingItemDetail extends BaseEntity{

  @Id
  private String detailId;

  @OneToOne(cascade = CascadeType.ALL, optional = false)
  @JoinColumn(name = "typeId")
  private ItemCategory itemId;

  private boolean isDefect;

  @ManyToOne
  @JoinColumn(name = "package_id")
  private PackagingItem packagingId;

}
