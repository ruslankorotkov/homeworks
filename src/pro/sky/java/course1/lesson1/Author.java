package pro.sky.java.course1.lesson1;

public class Author {
    private String name;
    private String family;


    Author (String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return this.name;
    }

    public String getFamily() {
        return this.family;
    }
}
