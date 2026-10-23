package com.pluralsight;

public class Book {
    private String title;
    private String isbn;
    private String checkedOutTo;
    private boolean isCheckedOut;
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book(String title, String isbn, String checkedOutTo, boolean isCheckedOut, int id) {
        this.title = title;
        this.isbn = isbn;
        this.checkedOutTo = checkedOutTo;
        this.isCheckedOut = isCheckedOut;
        this.id = id;


    }
    public void checkOut(String name) {
        checkedOutTo = name;
        isCheckedOut = true;

    }
    public void checkIn(){
        checkedOutTo = "";
        isCheckedOut = true;
    }

}
