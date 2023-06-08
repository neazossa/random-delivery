package com.company.delivery.repository;

import com.company.delivery.entity.PackagingItemDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackagingItemDetailRepository extends JpaRepository<PackagingItemDetail, String> {
}
