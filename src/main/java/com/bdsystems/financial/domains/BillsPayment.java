package com.bdsystems.financial.domains;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorColumn(name = "bills_pay")
public class BillsPayment extends Account{

  private LocalDate paymentDate;

  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(final LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }
}

