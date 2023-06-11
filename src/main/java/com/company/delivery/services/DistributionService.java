package com.company.delivery.services;

import com.company.delivery.models.request.AddDistributionRequest;

public interface DistributionService {

  Object addDistribution(AddDistributionRequest request);

  Object receiveDistribution(String request);

}
