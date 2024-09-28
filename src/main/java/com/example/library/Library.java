package com.example.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс библиотеки
 */
public class Library implements LibraryManagement {
    /**
     * Коллекция книг
     */
    private List<Book> books;

    /**
     * Конструктор библиотеки.
     * Инициализирует коллекцию книг.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Добавляет книгу в библиотеку.
     * @param book книга, которую нужно добавить
     */
    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга \"" + book.getTitle() + "\" добавлена в библиотеку.");
    }

    /**
     * Удаляет книгу из библиотеки.
     * Если книга не найдена, выводит сообщение об этом.
     * @param book книга, которую нужно удалить
     */
    @Override
    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Книга \"" + book.getTitle() + "\" удалена из библиотеки.");
        } else {
            System.out.println("Книга \"" + book.getTitle() + "\" не найдена.");
        }
    }

    /**
     * Находит книгу по названию.
     * Если книга найдена, возвращает её, иначе выводит сообщение об отсутствии.
     * @param title название книги
     * @return книга, найденная по названию, или null, если книга не найдена
     */
    @Override
    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("Книга \"" + title + "\" не найдена.");
        return null;
    }

    /**
     * Выдает книгу пользователю.
     * Если книга доступна, отмечает её как выданную.
     * @param book книга, которую нужно выдать
     */
    @Override
    public void borrowBook(Book book) {
        if (book != null) {
            book.borrowBook();
        }
    }

    /**
     * Принимает книгу обратно в библиотеку.
     * Если книга была выдана, отмечает её как доступную.
     * @param book книга, которую нужно вернуть
     */
    @Override
    public void returnBook(Book book) {
        if (book != null) {
            book.returnBook();
        }
    }
}
