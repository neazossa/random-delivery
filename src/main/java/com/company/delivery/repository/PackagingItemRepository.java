package com.company.delivery.repository;

import com.company.delivery.entity.PackagingItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackagingItemRepository extends JpaRepository<PackagingItem, String> {
}
