package com.company;

public class Library {
    String name;
    String city;
    Book [] books = new Book[5];
    int index = 0;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void addBook(Book book) {

        try {
            books[index] = book;
            index++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The library is full");
        }
    }

    public void printBook() {
        for (int i = 0; i < books.length; i++) {
            try {
                books[i].getData();

            } catch (NullPointerException e) {
                System.out.println("the book is empty");
            }
        }
    }
}

