package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        Book tarasBulba = new Book(" Николай "+"Гоголь ", " Тарас Бульба ", 1842);
        Book sudbaCheloveka = new Book(" Михаил"+" Шолохов ", " Судьба человека ", 1957);
        System.out.println("Автор - " + tarasBulba.Author;
        System.out.println("Год издания - " + tarasBulba.getPublishingYear());
        System.out.println("Книга - " + tarasBulba.getBookName());
        tarasBulba.setPublishingYear(2022);
        System.out.println("Год издания - " + tarasBulba.getPublishingYear());

    }
}
