package net.yugai.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.Map;

public record Account(Long id, User user, Map<Currency, BigDecimal> balances,
                      LocalDateTime createdAt, boolean active) {

}
