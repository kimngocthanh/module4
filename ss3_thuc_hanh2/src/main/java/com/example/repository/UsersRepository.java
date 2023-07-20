package com.example.repository;

import com.example.model.Password;
import com.example.model.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepository implements IUsersRepository {
    private static List<Users> usersList = new ArrayList<>();

    static {
        usersList.add(new Users("abc", "123", "Kim Ngoc Thanh", "abc@gmail.com", 22));
        usersList.add(new Users("xyz", "123", "Huỳnh Lê Tấn Cường", "xyz@gmail.com", 26));
        usersList.add(new Users("qwe", "123", "Nguyễn Phúc Quý", "qwe@gmail.com", 25));
        usersList.add(new Users("asd", "123", "Ngô Hữu Hoàng Nhật", "asd@gmail.com", 24));
        usersList.add(new Users("zxc", "123", "Hoàng Thị Quyên", "zxc@gmail.com", 23));
    }

    @Override
    public Users checkLogin(Password password) {
        for (Users u : usersList) {
            if (password.getPassword().equals(u.getPassword()) && password.getAccount().equals(u.getAccount())) {
                return u;
            }
        }
        return null;
    }

    @Override
    public Users displayUsers(String password) {
        for (Users u: usersList) {
            if(password.equals(u.getPassword())){
                return u;
            }
        }return null;
    }

}
