package com.company.delivery.services.impl;

import com.company.delivery.entity.Merchant;
import com.company.delivery.exception.BusinessException;
import com.company.delivery.models.constant.GlobalMessage;
import com.company.delivery.models.constant.Operation;
import com.company.delivery.models.request.AddMerchantRequest;
import com.company.delivery.models.request.EditMerchantRequest;
import com.company.delivery.repository.MerchantRepository;
import com.company.delivery.services.MerchantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class MerchantServiceImpl implements MerchantService {

  @Autowired
  private MerchantRepository merchantRepository;

  @Override
  public Merchant addMerchant(AddMerchantRequest request) {
    Merchant merchant = Merchant.builder()
        .merchantName(request.getMerchantName())
        .merchantAddr1(request.getMerchantAddr1())
        .merchantAddr2(request.getMerchantAddr2())
        .merchantCity(request.getMerchantCity())
        .merchantRegion(request.getMerchantRegion())
        .merchantCountry(request.getMerchantCountry())
        .merchantMapLocation(request.getMerchantMapLocation())
        .merchantContact(request.getMerchantContact())
        .merchantId(UUID.randomUUID().toString().replace("-",""))
        .isActive(true)
        .createdId("1").createTime(LocalDateTime.now())
        .modifiedId("1").modifiedTime(LocalDateTime.now())
        .build();
    return merchantRepository.save(merchant);
  }

  @Override
  public Merchant editMerchant(String merchantId, EditMerchantRequest request) {
    Optional<Merchant> merchant = merchantRepository.findById(merchantId);
    if(merchant.isPresent()){
      Merchant merchants = merchant.get();
      merchants.setMerchantName(request.getMerchantName());
      merchants.setMerchantAddr1(request.getMerchantAddr1());
      merchants.setMerchantAddr2(request.getMerchantAddr2());
      merchants.setMerchantCity(request.getMerchantCity());
      merchants.setMerchantRegion(request.getMerchantRegion());
      merchants.setMerchantCountry(request.getMerchantCountry());
      merchants.setMerchantMapLocation(request.getMerchantMapLocation());
      merchants.setMerchantContact(request.getMerchantContact());
      merchants.setModifiedTime(LocalDateTime.now());
      merchants.setModifiedId("1");
      return merchantRepository.save(merchants);
    }
    throw new BusinessException(GlobalMessage.DATA_NOT_FOUND);
  }

  @Override
  public Operation deleteMerchant(String merchantId) {
    Optional<Merchant> merchant = merchantRepository.findById(merchantId);
    if(merchant.isPresent()){
      Merchant merchants = merchant.get();
      merchants.setActive(false);
      merchants.setModifiedTime(LocalDateTime.now());
      merchants.setModifiedId("1");
      merchantRepository.save(merchants);
      return Operation.EXECUTED;
    }
    throw new BusinessException(GlobalMessage.DATA_NOT_FOUND);
  }
}
