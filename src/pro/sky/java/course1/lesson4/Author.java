package pro.sky.java.course1.lesson4;

public class Author {
    private String publisherName;
    private String bookName;
    private int publishingYear;

    public Author(String authorName, String bookName, int publishingYear) {
        this.publisherName = publisherName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getPublisherName(){
        return this.publisherName;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
}
