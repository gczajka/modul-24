package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends LibPrototype<Library> {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowClone() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepClone() throws CloneNotSupportedException {
        Library library = (Library)super.clone();
        library.books = new HashSet<>();
        for(Book book : books) {
            library.getBooks().add(new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate()));
        }
        return library;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
