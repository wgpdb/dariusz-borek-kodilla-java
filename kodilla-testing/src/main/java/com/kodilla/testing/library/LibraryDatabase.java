package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    //list books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //list books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //try to rent a book for libraryUser
    //returns true when success
    //and returns false when book is unavailable for rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    //return all books borrowed by libraryUser to the library
    //returns number of books returned
    int returnBooks(LibraryUser libraryUser);
}