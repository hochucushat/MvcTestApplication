package ru.picma.mtapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.picma.mtapp.model.User;

import java.util.Optional;

/**
 * Interface {@code UserRepo} to access User in Database.
 *
 * @author  pic
 * @since   0.0.1
 */
public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);

}
