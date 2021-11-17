package com.bdsystems.financial.domains;


import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "financial_release")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinancialRelease implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private BigDecimal paymentValue;
  private BigDecimal unpaidBills;
  private BigDecimal receiveValue;
  private BigDecimal unreceivedBills;

  private LocalDate paymentDate;
  private LocalDate receiveDate;

  public FinancialRelease() {
  }

  public FinancialRelease(final Long id, final BigDecimal paymentValue, final BigDecimal unpaidBills, final BigDecimal receiveValue, final BigDecimal unreceivedBills, final LocalDate paymentDate, final LocalDate receiveDate) {
    this.id = id;
    this.paymentValue = paymentValue;
    this.unpaidBills = unpaidBills;
    this.receiveValue = receiveValue;
    this.unreceivedBills = unreceivedBills;
    this.paymentDate = paymentDate;
    this.receiveDate = receiveDate;
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public BigDecimal getPaymentValue() {
    return paymentValue;
  }

  public void setPaymentValue(final BigDecimal paymentValue) {
    this.paymentValue = paymentValue;
  }

  public BigDecimal getUnpaidBills() {
    return unpaidBills;
  }

  public void setUnpaidBills(final BigDecimal unpaidBills) {
    this.unpaidBills = unpaidBills;
  }

  public BigDecimal getReceiveValue() {
    return receiveValue;
  }

  public void setReceiveValue(final BigDecimal receiveValue) {
    this.receiveValue = receiveValue;
  }

  public BigDecimal getUnreceivedBills() {
    return unreceivedBills;
  }

  public void setUnreceivedBills(final BigDecimal unreceivedBills) {
    this.unreceivedBills = unreceivedBills;
  }

  public LocalDate getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(final LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }

  public LocalDate getReceiveDate() {
    return receiveDate;
  }

  public void setReceiveDate(final LocalDate receiveDate) {
    this.receiveDate = receiveDate;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final FinancialRelease that = (FinancialRelease) o;
    return Objects.equals(id, that.id) && Objects.equals(paymentValue, that.paymentValue) && Objects.equals(unpaidBills, that.unpaidBills) && Objects.equals(receiveValue, that.receiveValue) && Objects.equals(unreceivedBills, that.unreceivedBills) && Objects.equals(paymentDate, that.paymentDate) && Objects.equals(receiveDate, that.receiveDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentValue, unpaidBills, receiveValue, unreceivedBills, paymentDate, receiveDate);
  }

  @Override
  public String toString() {
    return "FinancialRelease{" +
        "id=" + id +
        ", paymentValue=" + paymentValue +
        ", unpaidBills=" + unpaidBills +
        ", receiveValue=" + receiveValue +
        ", unreceivedBills=" + unreceivedBills +
        ", paymentDate=" + paymentDate +
        ", receiveDate=" + receiveDate +
        '}';
  }
}
