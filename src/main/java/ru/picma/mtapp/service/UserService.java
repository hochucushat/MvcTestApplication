package ru.picma.mtapp.service;

import org.springframework.stereotype.Service;
import ru.picma.mtapp.repo.UserRepo;

@Service
public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }



}
