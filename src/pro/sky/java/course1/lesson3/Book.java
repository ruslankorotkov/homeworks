package pro.sky.java.course1.lesson3;
public class Book {
    public static void main(String[] args) {
        Author tarasBulba= new Author(" Николай Гоголь "," Тарас Бульба ",1842);
        Author sudbaCheloveka = new Author(" Михаил Шолохов "," Судьба человека ",1957);
        System.out.println("Автор - " + tarasBulba.publisherName);
        System.out.println("Год издания " + tarasBulba.publishingYear);
        System.out.println("Книга " + tarasBulba.bookName);
    }
}




