package com.example.library;

/**
 * Класс пользователя библиотеки
 */
public class LibraryUser {
    /**
     * Объект управления библиотекой
     */
    private final LibraryManagement library;

    /**
     * Конструктор пользователя библиотеки
     * @param library объект управления библиотекой
     */
    public LibraryUser(LibraryManagement library) {
        this.library = library;
    }

    /**
     * Берёт книгу из библиотеки
     * @param title название книги
     */
    public void borrowBook(String title) {
        Book book = library.findBook(title);
        library.borrowBook(book);
    }

    /**
     * Возвращает книгу в библиотеку
     * @param title название книги
     */
    public void returnBook(String title) {
        Book book = library.findBook(title);
        library.returnBook(book);
    }
}
