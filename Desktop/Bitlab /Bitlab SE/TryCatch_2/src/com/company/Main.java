package com.company;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library("Central library", " Astana");
        System.out.println(lib.getName() + lib.getCity());
        Book b = null;
        lib.addBook(b);
        lib.addBook(new Book(2, "book2", "author2"));
        lib.addBook(new Book(3, "book3", "author2"));
        lib.addBook(new Book(4, "book4", "author2"));
        lib.addBook(new Book(5, "book5", "author2"));
        lib.addBook(new Book(6, "book6", "author2"));
        lib.printBook();
    }
}

