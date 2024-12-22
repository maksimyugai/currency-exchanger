package net.yugai.model;

import java.time.LocalDateTime;

public record User(Long id, String username, String email, LocalDateTime registeredDate) {

}
