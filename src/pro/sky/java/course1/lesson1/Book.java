package pro.sky.java.course1.lesson1;

import java.util.Objects;

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
    @Override

    public String toString() {
        return "Book{" +
                " author ='" + author + '\'' +
                ", bookname ='" + bookName + '\'' +
                ", publishedYear ='" + publishedYear + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName) && Objects.equals(publishedYear, book.publishedYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author,bookName, publishedYear);
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

}




