package com.company.task87A5;

import java.util.Arrays;

public class Book {
    private static int idNum = 1;
    private int id = idNum++;
    private String name;
    private String[] authors;
    private String publisher;
    private int yearOfPublish;
    private int pages;
    private double price;
    private String typeOfBinding;

    public Book(String name, String[] authors, String publisher, int yearOfPublish, int pages, double price, String typeOfBinding) {
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.yearOfPublish = yearOfPublish;
        this.pages = pages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher='" + publisher + '\'' +
                ", year=" + yearOfPublish +
                ", pages=" + pages +
                ", price=" + price +
                ", bindingType='" + typeOfBinding + '\'' +
                '}';
    }
}
