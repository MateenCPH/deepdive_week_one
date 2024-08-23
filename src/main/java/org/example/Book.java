package org.example;

public class Book {
    public String title;
    public String author;
    public int year;
    public int pages;
    public double rating;

    public Book(String title, String author, int year, int pages, double rating) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public double getRating() {
        return rating;
    }
}
