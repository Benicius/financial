package com.bdsystems.financial.service;

import com.bdsystems.financial.domains.FinancialRelease;
import com.bdsystems.financial.repository.FinancialReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialReleaseService {

  @Autowired
  private FinancialReleaseRepository financialReleaseRepository;

  public List<FinancialRelease> getAllFinancialRelease() {
    return financialReleaseRepository.findAll();
  }

public FinancialRelease findSumReleaseFinancial() {
    return null;
  }

}
