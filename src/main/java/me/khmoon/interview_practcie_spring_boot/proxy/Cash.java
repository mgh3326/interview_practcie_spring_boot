package me.khmoon.interview_practcie_spring_boot.proxy;

public class Cash implements Payment {

  @Override
  public void pay(int amount) {
    System.out.println(amount + " 현금 결제");
  }
}
