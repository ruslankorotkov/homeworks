package pro.sky.java.course1.lesson5;


public class Book {
    public static void main(String[] args) {
        Author tarasBulba = new Author(" Николай Гоголь ", " Тарас Бульба ", 1842);
        Author sudbaCheloveka = new Author(" Михаил Шолохов ", " Судьба человека ", 1957);
        System.out.println("Автор - " + tarasBulba.getPublisherName());
        System.out.println("Год издания - " + tarasBulba.getPublishingYear());
        System.out.println("Книга - " + tarasBulba.getBookName());
        tarasBulba.setPublishingYear(2022);
        System.out.println("Год издания - " + tarasBulba.getPublishingYear());
    }
}




