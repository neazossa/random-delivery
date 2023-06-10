package com.company.delivery.repository;

import com.company.delivery.entity.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryRepository extends JpaRepository<ItemCategory, String> {
}
