package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {
        List<Book>books = getBooks();

        //Find the average rating of all books.
        OptionalDouble averageRating = books.stream()
                .mapToDouble(Book::getRating)
                .average();
        System.out.println("Average rating: " + averageRating);

        //Filter and display books published after a specific year.
        List<Book> booksPublishedAfterSpecificYear = books.stream()
                .filter(book -> book.getYear() > 1950)
                .toList();
        booksPublishedAfterSpecificYear.forEach(System.out::println);

        //Sort books by rating in descending order.
        List<Book> ratingDescendingOrder = books.stream()
                        .sorted(Comparator.comparingDouble(Book::getRating).reversed())
                                .toList();
        ratingDescendingOrder.forEach(System.out::println);

        //Find and display the title of the book with the highest rating.
        Book bookWithHighestRating = books.stream()
                        .max(Comparator.comparing(Book::getRating)).orElse(null);
        String result = bookWithHighestRating != null ? "The book with the highest rating is: " + bookWithHighestRating.getTitle() : "There is no book available";
        System.out.println(result);

        //Group books by author and calculate the average rating for each author’s books.
        Map<String, Double> authorAndRatingList = books.stream()
                        .collect(Collectors.groupingBy(
                                book ->book.getAuthor() != null ? book.getAuthor() :"Unknown author",
                                Collectors.averagingDouble(Book::getRating)
                        ));
        System.out.println(authorAndRatingList);


        //Calculate the total number of pages for all books (assuming each book has a fixed number of pages).
        books.stream()
                .mapToInt(Book::getPages)
                .sum();




    }

    private static List<Book> getBooks() {
        return List.of(
                new Book("The Grapes of Wrath", "John Steinbeck", 1939, 464, 4.5),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180, 4.8),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281, 4.9),
                new Book("1984", "George Orwell", 1949, 328, 4.7),
                new Book("Animal Farm", "George Orwell", 1945, 112, 4.3)
        );
    }


}
