package com.bdsystems.financial.service;

import com.bdsystems.financial.domains.BillsPayment;
import com.bdsystems.financial.domains.FinancialRelease;
import com.bdsystems.financial.helper.ReleaseHelper;
import com.bdsystems.financial.repository.BillsPaymentRepository;
//import com.bdsystems.financial.repository.FinancialReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class BillsPaymentService {

  private BillsPaymentRepository billsPaymentRepository;
  private ReleaseHelper releaseHelper;
  //private FinancialReleaseRepository releaseRepository;

  @Autowired
  public BillsPaymentService(final BillsPaymentRepository billsPaymentRepository, final ReleaseHelper releaseHelper/*, final FinancialReleaseRepository releaseRepository*/) {
    this.billsPaymentRepository = billsPaymentRepository;
    this.releaseHelper = releaseHelper;
    /*this.releaseRepository = releaseRepository;*/
  }

  public Iterable<BillsPayment> listBillsPayment(){
    return billsPaymentRepository.findAll();
  }

  public Optional<BillsPayment> onlyBillsPayment(Long id){
    return billsPaymentRepository.findById(id);
  }

  public BillsPayment saveBillsPayment(BillsPayment billsPayment){

    if (billsPayment.isStatus()) {
      releaseHelper.calculationOfPaymentValue(
          billsPayment.getPaymentAmount(), billsPayment.getPaymentDate());
    } else {
      releaseHelper.calculationOfUnpaidValue(
          billsPayment.getPaymentAmount(), billsPayment.getPaymentDate());
    }
    return billsPaymentRepository.save(billsPayment);
  }

  public BillsPayment updateBillsPayment(BillsPayment billsPayment){
    /*try {
      if (billsPayment.getId() != null) {
        //FinancialRelease financialRelease = releaseRepository.getById(billsPayment.getId());
        if (billsPayment.isStatus()) {
          financialRelease.setUnpaidBills(BigDecimal.ZERO);
          financialRelease.setPaymentValue(billsPayment.getPaymentAmount());
        } else {
          releaseHelper.calculationOfUnpaidValue(billsPayment.getPaymentAmount(), billsPayment.getPaymentDate());
          financialRelease.setPaymentValue(BigDecimal.ZERO);
          financialRelease.setUnpaidBills(billsPayment.getPaymentAmount());
        }
        releaseRepository.save(financialRelease);
        return billsPaymentRepository.save(billsPayment);
      }
      return billsPaymentRepository.save(billsPayment);
    } catch (Exception ex) {
      ex.printStackTrace();
    }*/

    return null;
  }
}
