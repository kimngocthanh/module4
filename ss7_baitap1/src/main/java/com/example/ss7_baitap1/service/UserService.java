package com.example.ss7_baitap1.service;

import com.example.ss7_baitap1.model.User;
import com.example.ss7_baitap1.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
   private IUserRepository userRepository;

    @Override
    public void addUsers(User user) {
        userRepository.save(user);
    }


}
