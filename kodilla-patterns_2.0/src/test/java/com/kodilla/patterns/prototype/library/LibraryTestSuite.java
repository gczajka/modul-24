package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("FirstLibrary");
        Book book1 = new Book("Title1", "Author1", LocalDate.of(2000, 12,12));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(2005, 10,10));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(2010, 11,11));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClone = null;
        try {
            shallowClone = library.shallowClone();
            shallowClone.setName("Shallow");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClone = null;
        try {
            deepClone = library.deepClone();
            deepClone.setName("Deep");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(shallowClone);
        System.out.println(deepClone);
        Assert.assertEquals(3, deepClone.getBooks().size());
        Assert.assertEquals(2, shallowClone.getBooks().size());
        Assert.assertEquals(2, library.getBooks().size());
    }
}
