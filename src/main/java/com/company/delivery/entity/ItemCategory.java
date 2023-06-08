package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "item_category")
public class ItemCategory extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id", nullable = false)
  private UUID itemTypeId;

  @Column(name = "nameType")
  private String nameType;

  @Column(name = "description")
  private String description;

  @Column(name = "weight")
  private Double weight;

  @Column(name = "length")
  private Double length;

  @Column(name = "price")
  private Long price;

  @Column(name = "isDelete")
  private boolean isDelete;

}
