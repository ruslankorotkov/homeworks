package pro.sky.java.course1.lesson1;

public class Book {
    private String bookName;
    private Author publisherName;
    private int publishingYear;

    public Book(Author publisherName, String bookName, int publishingYear) {
        this.publisherName = publisherName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }


    public Author getPublisherName() {
        return this.publisherName;
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




