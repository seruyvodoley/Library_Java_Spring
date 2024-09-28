package com.example.library;

public class Book {
    /**
     * Название книги
     */
    private String title;

    /**
     * Автор книги
     */
    private String author;

    /**
     * Доступна ли книга в библиотеке
     */
    private boolean isAvailable;

    /**
     * Конструктор без параметров
     */
    public Book() {
        this.isAvailable = true; // по умолчанию книга доступна
    }

    /**
     * Конструктор книги
     * @param title название книги
     * @param author автор книги
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // по умолчанию книга доступна
    }

    // Сеттер для title
    public void setTitle(String title) {
        this.title = title;
    }

    // Сеттер для author
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Получает название книги
     * @return название книги
     */
    public String getTitle() {
        return title;
    }

    /**
     * Получает автора книги
     * @return автор книги
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Проверяет, доступна ли книга
     * @return true, если книга доступна, иначе false
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Отмечает книгу как выданную
     */
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Книга \"" + title + "\" выдана.");
        } else {
            System.out.println("Книга \"" + title + "\" недоступна.");
        }
    }

    /**
     * Возвращает книгу в библиотеку
     */
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Книга \"" + title + "\" возвращена.");
        } else {
            System.out.println("Книга \"" + title + "\" уже была в наличии.");
        }
    }
}
