package com.company.delivery.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "packaging_item")
public class PackagingItem extends BaseEntity{

  @Id
  private String packagingId;

  @OneToOne(mappedBy = "packagingItem", fetch = FetchType.EAGER)
  private Merchant merchant;

  private String remarks;

  private boolean isSend;

  @Column(length = 2)
  private String status;

  @ToString.Exclude
  @OneToMany(mappedBy = "packagingId", cascade = CascadeType.ALL)
  private List<PackagingItemDetail> itemDetailList = new ArrayList<>();
}
