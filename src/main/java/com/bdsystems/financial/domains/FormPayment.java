package com.bdsystems.financial.domains;

public enum FormPayment {

  CREDIT_CARD,
  DEBT_CARD,
  MONEY,
  PIX;

  public String getStatus() {
    return this.name();
  }
}
