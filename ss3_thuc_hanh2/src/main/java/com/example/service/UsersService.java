package com.example.service;

import com.example.model.Password;
import com.example.model.Users;
import com.example.repository.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService implements IUsersService{
    @Autowired
    private IUsersRepository usersRepository;
    @Override
    public Users checkLogin(Password password) {
        return usersRepository.checkLogin(password);
    }

    @Override
    public Users displayUsers(String password) {
        return usersRepository.displayUsers(password);
    }

}
