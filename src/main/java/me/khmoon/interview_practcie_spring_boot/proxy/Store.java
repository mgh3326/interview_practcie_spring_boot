package me.khmoon.interview_practcie_spring_boot.proxy;

public class Store {
  Payment payment;

  public Store(Payment payment) {
    this.payment = payment;
  }

  public void buySomething() {
    payment.pay(100);
  }
}
