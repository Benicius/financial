package com.bdsystems.financial.repository;

import com.bdsystems.financial.domains.FinancialRelease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ReleaseRepository extends JpaRepository<FinancialRelease, Long> {
}
