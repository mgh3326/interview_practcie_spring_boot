package me.khmoon.interview_practcie_spring_boot.proxy;

import org.junit.Test;


public class StoreTest {

  @Test
  public void buySomething() {
    Payment cashPerf = new CashPerf();
    Store store = new Store(cashPerf);
    store.buySomething();
  }
}