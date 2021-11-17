package com.bdsystems.financial.repository;


import com.bdsystems.financial.domains.FinancialRelease;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface FinancialReleaseRepository extends JpaRepository<FinancialRelease, Long> {

  @Query("SELECT new FinancialRelease(sum(f.paymentValue), sum(f.receiveValue), " +
      "sum(f.unpaidBills), sum(f.unreceivedBills)) " +
      "FROM FinancialRelease f ")
  FinancialRelease findBySumReleaseFinancial();
}
