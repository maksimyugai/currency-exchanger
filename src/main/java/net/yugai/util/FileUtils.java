package net.yugai.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import net.yugai.model.Account;

public final class FileUtils {

  public static List<Account> readAccounts() {
    var reader = new ObjectMapper().readerFor(new TypeReference<Account>() {});
    var accounts = new ArrayList<Account>();
    var dir = Paths.get("resources/models/");

    try(Stream<Path> files = Files.list(dir)) {
      files.forEach(file -> {
        if (Files.isRegularFile(file)) {
          try {
            accounts.add(reader.readValue(Files.readString(file)));
          } catch (IOException e) {
            throw new RuntimeException(e);
          }
        }
      });
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return accounts;
  }
}
