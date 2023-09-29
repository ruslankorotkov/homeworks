package pro.sky.java.course1.lesson1;

import java.util.Objects;

public class Author {
    private String name;
    private String famely;

    public Author(String name, String famely) {
        this.name = name;
        this.famely = famely;
    }

    public String getName() {
        return this.name;
    }

    public String getFamely() {
        return this.famely;
    }

    @Override

    public String toString() {
        return name + "  " + famely;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(famely, author.famely);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, famely);
    }
}
