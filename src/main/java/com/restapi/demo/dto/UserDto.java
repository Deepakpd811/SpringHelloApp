package com.restapi.demo.dto;

public class UserDto {

    private String firstname;
    private String lastname;

    public UserDto(){};

    public UserDto(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
