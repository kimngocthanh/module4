package com.example.repository;

import com.example.model.Password;
import com.example.model.Users;

import java.util.List;

public interface IUsersRepository {
    Users checkLogin(Password password);
    Users displayUsers(String password);
}
