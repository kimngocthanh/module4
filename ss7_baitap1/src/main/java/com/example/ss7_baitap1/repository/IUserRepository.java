package com.example.ss7_baitap1.repository;

import com.example.ss7_baitap1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
