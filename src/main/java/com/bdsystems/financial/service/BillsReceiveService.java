package com.bdsystems.financial.service;

import com.bdsystems.financial.domains.BillsReceive;
import com.bdsystems.financial.domains.FinancialRelease;
import com.bdsystems.financial.helper.ReleaseHelper;
import com.bdsystems.financial.repository.BillsReceiveRepository;
//import com.bdsystems.financial.repository.FinancialReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class BillsReceiveService {

  private BillsReceiveRepository billsReceiveRepository;
  private ReleaseHelper releaseHelper;
  /*private FinancialReleaseRepository releaseRepository;*/

  @Autowired
  public BillsReceiveService(final BillsReceiveRepository billsReceiveRepository, final ReleaseHelper releaseHelper/*, final FinancialReleaseRepository releaseRepository*/) {
    this.billsReceiveRepository = billsReceiveRepository;
    this.releaseHelper = releaseHelper;
    /*this.releaseRepository = releaseRepository;*/
  }

  public Iterable<BillsReceive> allBillsReceive(){
    return billsReceiveRepository.findAll();
  }

  public Optional<BillsReceive> onlyBillsReceive(Long id){
    return billsReceiveRepository.findById(id);
  }

  public BillsReceive saveBillsReceive(BillsReceive billsReceive){
    if(billsReceive.isStatus()){
      releaseHelper.calculationOfReceiveValue(billsReceive.getPaymentAmount(), billsReceive.getDeliveryDate());
    } else {
      releaseHelper.calculationOfUnreceivedValue(billsReceive.getPaymentAmount(), billsReceive.getDeliveryDate());
    }
    return billsReceiveRepository.save(billsReceive);
  }

  public BillsReceive updateBillsReceive(BillsReceive billsReceive){
    /*try {
      if (billsReceive.getId() != null) {
        FinancialRelease financialRelease = releaseRepository.getById(billsReceive.getId());
        if (billsReceive.isStatus()) {
          financialRelease.setUnpaidBills(BigDecimal.ZERO);
          financialRelease.setPaymentValue(billsReceive.getPaymentAmount());
        } else {
          financialRelease.setPaymentValue(BigDecimal.ZERO);
          financialRelease.setUnpaidBills(billsReceive.getPaymentAmount());
        }
        releaseRepository.save(financialRelease);
        return billsReceiveRepository.save(billsReceive);
      }
      return billsReceiveRepository.save(billsReceive);
    } catch (Exception ex) {
      ex.printStackTrace();
    }*/
    return null;
  }
}
