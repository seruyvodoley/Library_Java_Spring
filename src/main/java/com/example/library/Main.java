package com.example.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Загружаем контекст Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получаем бины из контекста
        Library library = (Library) context.getBean("library");
        LibraryUser user = (LibraryUser) context.getBean("libraryUser");

        // Добавляем книги в библиотеку
        Book book = (Book) context.getBean("book");

        library.addBook(book);

        // Пробуем найти книгу
        String searchTitle = "1984";
        Book foundBook = library.findBook(searchTitle);
        if (foundBook != null) {
            System.out.println("Найдена книга: " + foundBook.getTitle() + " автор: " + foundBook.getAuthor());
        }

        // Пользователь берет книгу
        user.borrowBook(searchTitle);

        // Возвращаем книгу
        user.returnBook(searchTitle);

        // Проверяем доступность книги
        System.out.println("Книга доступна: " + foundBook.isAvailable());
    }
}
