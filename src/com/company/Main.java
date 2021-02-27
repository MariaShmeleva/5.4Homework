package com.company;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Ярмарка тщеславия", "Уильям Мейкпис Теккерей", 1, 256);
        books[1] = new Book("Евгений Онегин", " Александр Пушкин");
        books[2] = new Book("Мастер и Маргарита", "Михаил Булгаков", 410);
        books[3] = new Book("Гарри Поттер и философский камень", 1, 360);
        books[4] = new Book("Тестирование Дот Ком", 250);
        Reader reader = new Reader();
        reader.choiceBook(books);
        Book book = reader.choiceBook(books);
        reader.readBook(book);
        reader.evaluateBook(book);


    }
}
