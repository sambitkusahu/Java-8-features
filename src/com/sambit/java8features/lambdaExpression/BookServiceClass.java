package com.sambit.java8features.lambdaExpression;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookServiceClass {
    public List<Book> getBooksInSorting(){
        List<Book> books = new BookDAO().getBooks();
        //we can implement in two ways, either we can write a separate class and implement the comparator interface
        //or Using lambda expression also we can achieve in concise way, below are two examples.
       // Collections.sort(books, new MyComparator());
         Collections.sort(books, (o1, o2)-> o1.getName().compareTo(o2.getName()));
         return books;
    }

    public static void main(String[] args) {
        List<Book> sortedBooks = new BookServiceClass().getBooksInSorting();
        System.out.println(sortedBooks);
    }
}

class MyComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
