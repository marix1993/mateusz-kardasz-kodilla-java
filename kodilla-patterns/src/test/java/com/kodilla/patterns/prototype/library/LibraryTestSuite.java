package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("My Library");
        Book book1 = new Book("Książka 1", "Andrzej1", LocalDate.of(2002, 2, 11));
        Book book2 = new Book("Książka 2", "Andrzej2", LocalDate.of(2003, 3, 12));
        Book book3 = new Book("Książka 3", "Andrzej3", LocalDate.of(2004, 4, 13));
        Book book4 = new Book("Książka 4", "Andrzej4", LocalDate.of(2005, 5, 14));
        Book book5 = new Book("Książka 5", "Andrzej5", LocalDate.of(2006, 6, 15));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library - shallow copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library - deep copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }

        //When
        library.removeBook(book5);

        //Then
        Assertions.assertEquals(4, library.getBooks().size());
        Assertions.assertEquals(4, clonedLibrary.getBooks().size());
        Assertions.assertEquals(5, deepClonedLibrary.getBooks().size());

    }
}


