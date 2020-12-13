package com.mycompany.book;

public class BookImpl implements Book {

    private String name;
    private AuthorImpl[] authors;
    private double price;
    private int qty = 0;

    public BookImpl(String name, AuthorImpl[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookImpl(String name, AuthorImpl[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public AuthorImpl[] getAuthors() {
        return authors;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getQty() {
        return qty;
    }

    @Override
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String getAuthorNames() {
        StringBuilder authorNames= new StringBuilder();

        authorNames.append(authors[0].getName());
        for(int i=1;i<authors.length;i++){
            authorNames.append(",").append(authors[i].getName());
        }
        return authorNames.toString();
    }
}
