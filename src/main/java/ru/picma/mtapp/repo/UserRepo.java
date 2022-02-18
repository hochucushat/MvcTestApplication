package ru.picma.mtapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.picma.mtapp.model.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);

}
