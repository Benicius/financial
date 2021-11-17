package com.bdsystems.financial.repository;

import com.bdsystems.financial.domains.BillsPayment;
import com.bdsystems.financial.domains.FinancialRelease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BillsPaymentRepository extends JpaRepository<BillsPayment, Long> {
  /*@Query(
      "SELECT new FinancialRelease(sum(f.paymentValue), sum(f.receiveValue), "
          + "sum(f.unpaidBills), sum(f.unreceivedBills)) "
          + "FROM FinancialRelease f ")
  FinancialRelease findBySumReleaseFinancial();*/
}
