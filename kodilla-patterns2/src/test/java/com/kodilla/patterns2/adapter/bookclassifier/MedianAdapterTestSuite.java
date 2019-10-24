package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import org.junit.Test;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        Book book1 = new Book("author1", "title1", 2001, "1");
        Book book2 = new Book("author2", "title2", 2002, "2");
        Book book3 = new Book("author3", "title3", 2003, "3");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        MedianAdapter adapter = new MedianAdapter();
        //When
        int median = adapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2002, median);
    }
}
