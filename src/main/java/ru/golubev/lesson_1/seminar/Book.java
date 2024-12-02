package ru.golubev.lesson_1.seminar;

public class Book {

    //region конструкторы

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //endregion

    // region методы


    @Override
    public String toString() {
        return "Book{" +
                "Название='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Год издания=" + year +
                '}';
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

    // endregion

    // region Поля
    /**
     * название
     */
    private final String title;
    /**
     * автор
     */
    private final String author;
    /**
     * год издания
     */
    private final int year;

    // endregion
}
