package ru.golubev.lesson_1.seminar;

import java.util.ArrayList;
import java.util.List;

public class Library {
    /*
    Задача 1. Реализовать систему учета книг в библиотеке.
        У каждой книги есть название, автор и год издания.
        Необходимо создать список книг и выполнитьь следующие действия:

        1. Обычный способ:
            - Найти все книги, написанные определенным автором
            - Найти все книги изданные после определенного года
            - Найти все уникальные названия книг в библиотеке
        2. Использование лямбда-выражений:
            - те же самые задачи с использованием лямбда-выражений и Stream API
            для более компактной записи кода
     */

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Преступление и наакзание", "Фёдор Достоевский", 1866));
        books.add(new Book("Евгений Онегин", "Александр Пушкин", 1833));
        books.add(new Book("Война и мир", "Лев Толстой", 1869));
        books.add(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));

        // поиск книг по автору
        List<Book> findByAuthor = new ArrayList<>();
        for (Book book: books){
            if ("Лев Толстой".equals(book.getAuthor())){
                findByAuthor.add(book);
            }
        }
        System.out.println("Лев Толстой: " + findByAuthor);

        // поиск книг после определенного года
        List<Book> findAfteryear = new ArrayList<>();
        for (Book book: books){
            if (book.getYear() > 1866){
                findAfteryear.add(book);
            }
        }
        System.out.println("Книги после 1866: " + findAfteryear);

        // поиск уникальных книг
        List<String> findUniqueBooks = new ArrayList<>();
        for (Book book: books){
            if (!findUniqueBooks.contains(book.getTitle())){
                findUniqueBooks.add(book.getTitle());
            }
        }

        System.out.println("Список книг: " + findUniqueBooks);
    }
}
