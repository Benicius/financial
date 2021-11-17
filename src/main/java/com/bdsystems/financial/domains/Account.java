package com.bdsystems.financial.domains;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "account")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private LocalDate dueDate;
  private FormPayment formPayment;

  private BigDecimal paymentAmount;

  private boolean status;

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(final LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public FormPayment getFormPayment() {
    return formPayment;
  }

  public void setFormPayment(final FormPayment formPayment) {
    this.formPayment = formPayment;
  }

  public BigDecimal getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(final BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(final boolean status) {
    this.status = status;
  }
}
