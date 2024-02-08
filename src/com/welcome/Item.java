package com.welcome;

public abstract class Item {
    String bookId;
    String name;
    int unitPrice;

    public Item(String _bookId, String _name, int _unitPrice) {
        bookId = _bookId;
        name = _name;
        unitPrice = _unitPrice;
    }

    abstract String getBookId();
    abstract String getName();
    abstract int getUnitPrice();
    abstract void setBookId(String bookId);
    abstract void setName(String name);
    abstract void setUnitPrice(int unitPrice);
}
