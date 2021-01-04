package com.mycompany.book;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookImpl book = (BookImpl) o;
        return Double.compare(book.price, price) == 0 &&
                qty == book.qty &&
                Objects.equals(name, book.name) &&
                Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, price, qty);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }
}
