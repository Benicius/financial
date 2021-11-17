package com.bdsystems.financial.helper;

import com.bdsystems.financial.domains.FinancialRelease;
import com.bdsystems.financial.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class ReleaseHelper {

  @Autowired private ReleaseRepository releaseRepository;

  public FinancialRelease calculationOfPaymentValue(
      BigDecimal paymentValue, LocalDate paymentDate) {
    FinancialRelease release = new FinancialRelease();
    release.setPaymentValue(paymentValue);
    release.setPaymentDate(paymentDate);
    return releaseRepository.save(release);
  }

  public FinancialRelease calculationOfUnpaidValue(BigDecimal unpaidValue, LocalDate paymentDate) {
    FinancialRelease release = new FinancialRelease();
    release.setUnpaidBills(unpaidValue);
    release.setPaymentDate(paymentDate);
    return releaseRepository.save(release);
  }

  public FinancialRelease calculationOfReceiveValue(
      BigDecimal receiveValue, LocalDate receiveDate) {
    FinancialRelease release = new FinancialRelease();
    release.setReceiveValue(receiveValue);
    release.setReceiveDate(receiveDate);
    return releaseRepository.save(release);
  }

  public FinancialRelease calculationOfUnreceivedValue(
      BigDecimal unreceived, LocalDate receiveDate) {
    FinancialRelease release = new FinancialRelease();
    release.setUnreceivedBills(unreceived);
    release.setReceiveDate(receiveDate);
    return releaseRepository.save(release);
  }
}
