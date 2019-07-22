package com.company.task87A5;

import java.util.ArrayList;
import java.util.List;

public class BookStarter {
    public static void main(String[] args) {
        String[] bookAuthors1 = {"Anna Burns"};
        Book book1 = new Book("A Novel", bookAuthors1, " Graywolf Press", 2018, 360, 16, "limp");

        String[] bookAuthors2 = {"Steve Coll"};
        Book book2 = new Book("Directorate S: The C.I.A. and America's Secret Wars in Afghanistan and Pakistan", bookAuthors2, "Penguin Books", 2019, 784, 11.26, "hard");

        String[] bookAuthors3 = {"Nora Krug"};
        Book book3 = new Book("Belonging: A German Reckons with History and Home", bookAuthors3, "Scribner", 2018, 288, 16.44, "limp");

        Book[] books = {book1, book2, book3};

        System.out.print("Book by Nora Krug: " + booksByAuthor("Nora Krug", books));
        System.out.println("Book by Penguin Books: " + booksByPublisher("Penguin Books", books));
        System.out.printf("Book after 2018: " + booksAfterYear(2018, books));
    }

    public static List<Book> booksByAuthor(String author, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            for (String bookAuthor : book.getAuthors()) {
                if (author.equals(bookAuthor)) {
                    result.add(book);
                }
            }
        }
        return result;
    }

    public static List<Book> booksByPublisher(String publisher, Book[] books){
        List<Book> result = new ArrayList<>();

        for (Book book : books){
            if (publisher.equals(book.getPublisher())){
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> booksAfterYear(int yearOfPublish, Book[] books){
        List<Book> result = new ArrayList<>();

        for (Book book : books){
            if (yearOfPublish < book.getYearOfPublish());
            result.add(book);
        }
        return result;
    }

}
