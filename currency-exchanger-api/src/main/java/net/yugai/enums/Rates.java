package net.yugai.enums;

import java.util.Currency;

public enum Rates {

  USD_TO_EUR(0.85),
  USD_TO_JPY(110.0),
  USD_TO_CNY(6.5),
  USD_TO_KGZ(84.0),
  USD_TO_TRY(8.5),
  USD_TO_INR(75.0),
  USD_TO_AED(3.67),
  USD_TO_VND(23000.0),
  EUR_TO_USD(1.18),
  EUR_TO_JPY(130.0),
  EUR_TO_CNY(7.8),
  EUR_TO_KGZ(100.0),
  EUR_TO_TRY(10.0),
  EUR_TO_INR(85.0),
  EUR_TO_AED(4.1),
  EUR_TO_VND(26000.0),
  JPY_TO_USD(0.0091),
  JPY_TO_EUR(0.0077),
  JPY_TO_CNY(0.059),
  CNY_TO_USD(0.15),
  CNY_TO_EUR(0.13),
  CNY_TO_JPY(17.0),
  KGZ_TO_USD(0.012),
  KGZ_TO_EUR(0.01),
  KGZ_TO_JPY(0.0077),
  TRY_TO_USD(0.12),
  INR_TO_USD(0.013),
  AED_TO_USD(0.27);

  private final Double rate;

  Rates(Double to) {
    this.rate = to;
  }

  public Double getRate() {
    return rate;
  }

  public static Double getRate(Currency from, Currency to) {
    return Rates.valueOf(from + "_TO_" + to).getRate();
  }
}
