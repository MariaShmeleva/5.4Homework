package com.company;

public class Book {
    private String bookName;
    private String bookAuthor;
    private int bookNumber;
    private int bookPage;

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public int getBookPage() {
        return bookPage;
    }

    Book(String bookName, String bookAuthor, int bookNumber, int bookPage) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookNumber = bookNumber;
        this.bookPage = bookPage;
    }

    Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    Book(String bookName, String bookAuthor, int bookPage) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPage = bookPage;
    }

    Book(String bookName, int bookNumber, int bookPage) {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.bookPage = bookPage;
    }

    Book(String bookName, int bookPage) {
        this.bookName = bookName;
        this.bookPage = bookPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Название '" + bookName + '\'' +
                ", Автор '" + bookAuthor + '\'' +
                ", Порядковый номер в серии " + bookNumber +
                ", Количество страниц " + bookPage +
                '}';
    }
}
