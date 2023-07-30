package com.example.ss7_baitap1.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.time.Period;

public class UserDto implements Validator {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String date;
    @Email
    private String email;

    public UserDto() {
    }

    public UserDto(int id, String firstName, String lastName, String phoneNumber, String date, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        if (userDto.getFirstName().equals("")){
            errors.rejectValue("firstName",null,"first name not empty");
        } else if (!userDto.getFirstName().matches("^[a-zA-z]{3,45}")) {
            errors.rejectValue("firstName",null,"first name not Match regex");
        }

        if (userDto.getLastName().equals("")){
            errors.rejectValue("lastName",null,"last name not empty");
        } else if (!userDto.getLastName().matches("^[a-zA-z]{3,45}")) {
            errors.rejectValue("lastName",null,"last name not Match regex");
        }

        if (!userDto.getPhoneNumber().matches("^0[0-9]{9}$")) {
            errors.rejectValue("phoneNumber", "", "invalid phone number");
        }
        try {
            LocalDate localDate = LocalDate.parse(userDto.date);
            LocalDate localDateNow = LocalDate.now();
            if (Period.between(localDate, localDateNow).getYears() < 18){
                errors.rejectValue("date",null, "not old enough");
            }
        } catch (Exception e) {
            errors.rejectValue("date",null, "not format date");
        }

    }
}
