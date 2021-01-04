package com.mycompany.book;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorImpl author = (AuthorImpl) o;
        return gender == author.gender &&
                Objects.equals(name, author.name) &&
                Objects.equals(email, author.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, gender);
    }
}
