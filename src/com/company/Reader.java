package com.company;

import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] books) {
        Random random = new Random();
        int randomNumber = random.nextInt(books.length);
        return books[randomNumber];
    }

    public void readBook(Book book) {
        System.out.println(book);
    }

    public void evaluateBook(Book book) {
        Random random = new Random();
        int randomNumeral = random.nextInt(100);
        int result = 0;
        if (book.getBookName() == null) {
            result -= randomNumeral;
        } else {
            result += book.getBookName().length();
        }
        if (book.getBookAuthor() == null) {
            result -= randomNumeral;
        } else {
            result += book.getBookAuthor().length();
        }
        if (book.getBookNumber() == 0) {
            result -= randomNumeral;
        } else {
            result -= book.getBookNumber();
        }
        if (book.getBookPage() == 0) {
            result -= randomNumeral;
        } else {
            result += book.getBookPage();
        }
        System.out.println(result);

    }
}
