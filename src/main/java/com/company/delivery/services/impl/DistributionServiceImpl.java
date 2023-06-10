package com.company.delivery.services.impl;

import com.company.delivery.models.request.AddDistributionRequest;
import com.company.delivery.repository.PackagingItemDetailRepository;
import com.company.delivery.repository.PackagingItemRepository;
import com.company.delivery.services.DistributionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DistributionServiceImpl implements DistributionService {

  @Autowired
  private PackagingItemRepository packagingItemHeaderRepository;

  @Autowired
  private PackagingItemDetailRepository packagingItemDetailRepository;

  @Override
  public Object addDistribution(AddDistributionRequest request) {
    return null;
  }
}
