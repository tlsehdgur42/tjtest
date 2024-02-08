package com.welcome;

public class Book extends Item {
    private String author;
    private String description;
    private String category;
    private String releaseDate;

    public Book(String _bookId, String _name, int _unitPrice) {
        super(_bookId, _name, _unitPrice);
    }

    public Book(String _bookId, String _name, int _unitPrice, String _author, String _description, String _category, String _releaseDate) {
        super(_bookId, _name, _unitPrice);
        author = _author;
        description = _description;
        category = _category;
        releaseDate = _releaseDate;
    }

    @Override
    String getBookId() {
        return bookId;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getUnitPrice() {
        return unitPrice;
    }

    @Override
    void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    void setName(String name) {
        this.name = name;
    }

    @Override
    void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
