package pro.sky.java.course1.lesson1;

public class Book {
    private String bookName;
    private int publishedYear;
    private Author author;

    public Book(Author author, String bookName, int publishedYear) {
        this.bookName = bookName;
        this.publishedYear = publishedYear;
        this.author = author;

    }

    public Author getAuthor() {
        return author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;

    }
}




