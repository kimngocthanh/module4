package com.example.service;

import com.example.model.Mail;
import com.example.repository.IMailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailService implements IMailService{
    @Autowired
    private IMailRepository mailRepository;
    @Override
    public List<Mail> displayMail() {
        return mailRepository.displayMail();
    }

    @Override
    public void updateMail(int id, Mail mail) {
        mailRepository.updateMail(id,mail);
    }

    @Override
    public Mail mail(int id) {
        return mailRepository.mail(id);
    }
}
