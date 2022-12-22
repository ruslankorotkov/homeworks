package pro.sky.java.course1.lesson1;

public class Book {
    private String bookName;
    private int publishingYear;

    public Book(Author author, String bookName, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;

    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;

    }
}




