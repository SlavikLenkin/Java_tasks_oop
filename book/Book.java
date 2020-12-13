package com.mycompany.book;

public interface Book {
    String getName();

    AuthorImpl[] getAuthors();

    double getPrice();

    void setPrice(double price);

    int getQty();

    void setQty(int qty);

    String getAuthorNames();

}
