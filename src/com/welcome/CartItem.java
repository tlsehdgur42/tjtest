package com.welcome;

public class CartItem {
    // private String[] itemBook = new String[7];

    private Book itemBook;
    private String bookID;
    private int quantity;
    private int totalPrice;

    public CartItem() {
        // *TODO Auto-generated constructor stub*
    }

//    public CartItem(String[] _book) {
//        itemBook = _book;
//        bookID = _book[0];
//        quantity = 1;
//        updateTotalPrice();
//    }

//    public String[] getItemBook() {
//        return itemBook;
//    }

//    public void setItemBook(String[] _itemBook) {
//        itemBook = _itemBook;
//    }


    public CartItem(Book booklist) {
        this.itemBook = booklist;
        this.bookID = booklist.getBookId();
        this.quantity = 1;
        updateTotalPrice();
    }

    public Book getItembook() {
        return itemBook;
    }

    public void setItemBook(Book itemBook) {
        this.itemBook = itemBook;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int _quantity) {
        quantity = _quantity;
        updateTotalPrice();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void updateTotalPrice() {
//        totalPrice = Integer.parseInt(itemBook[2]) * quantity;
        totalPrice = this.itemBook.getUnitPrice() * this.quantity;
    }


//     @Override
//     public int hashCode() {
//       final int prime = 31;
//       int result = 1;
//       result = prime * result + ((book == null) ? 0 : book.hashCode());
//       return result;
//     }
//
//     @Override
//     public boolean equals(Object obj) {
//       if(this == obj)
//         return true;
//       if(obj == null)
//         return false;
//       if(getClass() != obj.getClass())
//         return false;
//       CartItem other = (CartItem) obj;
//       if(book == null) {
//         if(other.book != null)
//           return false;
//       } else if(!book.equals(other.book))
//         return false;
//       return true;
//     }
}
