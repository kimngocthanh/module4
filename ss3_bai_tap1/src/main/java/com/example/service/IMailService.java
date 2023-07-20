package com.example.service;

import com.example.model.Mail;

import java.util.List;

public interface IMailService {
    List<Mail> displayMail();
    void updateMail(int id, Mail mail);
    Mail mail(int id);
}
