package net.yugai.service.impl;

import java.math.BigDecimal;
import java.util.Currency;
import net.yugai.enums.Rates;
import net.yugai.service.ExchangeService;

public class ExchangeServiceImpl implements ExchangeService {

  @Override
  public BigDecimal exchange(Currency from, Currency to, BigDecimal amount) {
    return BigDecimal.valueOf(Rates.getRate(from, to)).multiply(amount);
  }
}
