package com.example.repository;

import com.example.model.Mail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepository implements IMailRepository{
    private static List<Mail> mailList = new ArrayList<>();
    static {
        mailList.add(new Mail(0,"English",5,true,"King"));
        mailList.add(new Mail(1,"Vietnamese",10,true,"King"));
        mailList.add(new Mail(2,"Japanese",15,false,"King"));
        mailList.add(new Mail(3,"Chinese",25,false,"King"));
    }
    @Override
    public List<Mail> displayMail() {
        return mailList;
    }

    @Override
    public void updateMail(int id, Mail mail) {
        for (int i = 0; i < mailList.size(); i++) {
            if(id==mailList.get(i).getId()){
                mailList.set(id,mail);
            }
        }

    }

    @Override
    public Mail mail(int id) {
        return mailList.get(id);
    }

}
