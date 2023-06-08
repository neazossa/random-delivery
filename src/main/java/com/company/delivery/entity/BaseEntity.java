package com.company.delivery.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseEntity {

  @Column(name = "create_time", nullable = false)
  private LocalDateTime createTime;

  @Column(name = "create_time", length = 3, nullable = false)
  private String createdId;

  @Column(name = "create_time", nullable = false)
  private LocalDateTime modifiedTime;

  @Column(name = "create_time", length = 3, nullable = false)
  private String modifiedId;

}
