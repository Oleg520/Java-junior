package ru.golubev.lesson_1.seminar;

import java.util.ArrayList;
import java.util.List;

public class LibraryV2 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Преступление и наакзание", "Фёдор Достоевский", 1866));
        books.add(new Book("Евгений Онегин", "Александр Пушкин", 1833));
        books.add(new Book("Война и мир", "Лев Толстой", 1869));
        books.add(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));

        List<Book> findByAuthor = books.stream()
                .filter(book -> "Лев Толстой".equals(book.getAuthor())).toList();
        List<Book> findAfterYear = books.stream()
                .filter(book -> book.getYear() > 1867).toList();
        List<String> findUniqueBooks = books.stream().map(Book::getTitle).distinct().toList();

        System.out.println(findByAuthor);
        System.out.println(findAfterYear);
        System.out.println(findUniqueBooks);
    }
}
