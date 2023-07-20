package com.example.service;

import com.example.model.Password;
import com.example.model.Users;

import java.util.List;

public interface IUsersService {
    Users checkLogin(Password password);
    Users displayUsers(String password);
}
