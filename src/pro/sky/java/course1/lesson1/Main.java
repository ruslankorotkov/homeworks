package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Book tarasBulba = new Book(" Николай Гоголь ", " Тарас Бульба ", 1842);
        Book sudbaCheloveka = new Book(" Михаил Шолохов ", " Судьба человека ", 1957);
        Author Bulba = new Author(" Тарас ", "Бульба ");
        Author sudba = new Author(" Михаил ", "Шолохов ");
        System.out.println("Автор - " + tarasBulba.getPublisherName());
        System.out.println("Год издания - " + tarasBulba.getPublishingYear());
        System.out.println("Книга - " + tarasBulba.getBookName());
        tarasBulba.setPublishingYear(2022);
        System.out.println("Год издания - " + tarasBulba.getPublishingYear());


    }

}
