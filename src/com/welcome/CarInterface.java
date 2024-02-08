package com.welcome;

public interface CarInterface {
    void printBookList(Book[] p);
    boolean isCartInBook(String id);
    void insertBook(Book p);
    void removeCart(int numId);
    void deleteBook();
}
