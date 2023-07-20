package com.example.repository;

import com.example.model.Mail;

import java.util.List;

public interface IMailRepository {
    List<Mail> displayMail();
    void updateMail(int id, Mail mail);
    Mail mail(int id);
}
