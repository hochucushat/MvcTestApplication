package ru.picma.mtapp.service;

import org.springframework.stereotype.Service;
import ru.picma.mtapp.repo.UserRepo;

/**
 * Class {@code UserService} accepting {@code userRepo} and calling its methods to access Database.
 *
 * @author  pic
 * import ru.picma.mtapp.repo.UserRepo;
 * @since   0.0.1
 */
@Service
public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }



}
