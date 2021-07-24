package com.sambit.java8features.lambdaExpression;


import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(100,"Book One", 150));
        books.add(new Book(101,"Book Two", 200));
        books.add(new Book(102,"Book Three", 250));
        books.add(new Book(103,"Book Four", 300));
        return books;
    }
}
