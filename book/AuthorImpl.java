package com.mycompany.book;

public class AuthorImpl implements Author{
    private String name;
    private String email;
    private char gender;

    public AuthorImpl() {
    }

    public AuthorImpl(String name) {
        this.name = name;
    }

    public AuthorImpl(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public AuthorImpl(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public char getGender() {
        return gender;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.email + " " + this.name +" "+ this.gender;
    }
}
