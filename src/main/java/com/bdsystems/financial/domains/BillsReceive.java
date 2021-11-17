package com.bdsystems.financial.domains;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@DiscriminatorColumn(name = "bills_receive")
public class BillsReceive extends Account{

  private LocalDate deliveryDate;

  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(final LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }
}
