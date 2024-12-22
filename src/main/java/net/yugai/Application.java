package net.yugai;

import java.util.Currency;
import net.yugai.service.impl.AccountServiceImpl;
import net.yugai.service.impl.ExchangeServiceImpl;

public class Application {

  public static void main(String[] args) {

    var accountService = new AccountServiceImpl();
    var accountOne = accountService.getById(1);
    var accountTwo = accountService.getById(2);

    var exchangeService = new ExchangeServiceImpl();
    var usd = Currency.getInstance("USD");
    var kgs = Currency.getInstance("KGS");
    var usdCash = accountOne.balances().get(usd);
    var exchanged = exchangeService.exchange(usd, kgs, usdCash);

    System.out.printf("Exchanged: %s of %s%s in account %s%n", exchanged, usdCash, usd, accountOne.id());
  }
}
