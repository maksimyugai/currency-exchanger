package net.yugai.repository;

import java.util.Objects;
import net.yugai.exception.AccountNotFoundException;
import net.yugai.model.Account;
import net.yugai.util.FileUtils;

public class AccountRepository {

  public Account getById(Long id) {
    var users = FileUtils.readAccounts();
    return Objects.requireNonNull(users).stream().filter(u -> Objects.equals(id, u.id()))
        .findFirst().orElseThrow(AccountNotFoundException::new);
  }
}
