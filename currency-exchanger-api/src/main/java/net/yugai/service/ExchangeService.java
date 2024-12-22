package net.yugai.service;

import java.math.BigDecimal;
import java.util.Currency;

public interface ExchangeService {

  BigDecimal exchange(Currency from, Currency to, BigDecimal amount);
}
