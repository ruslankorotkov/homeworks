package pro.sky.java.course1.lesson1;

public class Book {
    private String bookName;
    private String publisherName;
    private int publishingYear;

    public static void main(String[] args) {
        Author publisherName = new Author(String name, String family);
    }

    public Book(String publisherName, String bookName, int publishingYear) {
        this.publisherName = publisherName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getPublisherName() {
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




