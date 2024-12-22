package net.yugai.service.impl;

import com.google.inject.Inject;
import net.yugai.model.Account;
import net.yugai.repository.AccountRepository;
import net.yugai.service.AccountService;

public class AccountServiceImpl implements AccountService {

  @Inject
  private AccountRepository accountRepository;

  @Override
  public Account getById(long id) {
    return accountRepository.getById(id);
  }
}
