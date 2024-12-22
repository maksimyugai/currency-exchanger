package net.yugai.util;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import net.yugai.model.Account;
import org.junit.jupiter.api.Test;

class FileUtilsTest {

  @Test
  void readAccounts() {
    List<Account> accounts = FileUtils.readAccounts();

    assertAll(
        () -> assertNotNull(accounts),
        () -> assertFalse(accounts.isEmpty())
    );
  }
}