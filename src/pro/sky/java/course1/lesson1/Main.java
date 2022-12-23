package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author gogol = new Author(" Николай ", " Гоголь ");
        Author sholohov = new Author(" Михаил ", " Шолохов ");
        Book tarasBulba = new Book(gogol, " Тарас Бульба ", 1842);
        Book sudbaCheloveka = new Book(sholohov, " Судьба человека ", 1957);
        System.out.println("Автор - " + gogol.getName() + gogol.getFamely());
        System.out.println("Автор - " + tarasBulba.getAuthor());
        System.out.println("Год издания - " + tarasBulba.getPublishedYear());
        System.out.println("Книга - " + tarasBulba.getBookName());
        System.out.println("Автор - " + sholohov.getName() + sholohov.getFamely());
        System.out.println("Автор - " + sudbaCheloveka.getAuthor());
        System.out.println("Год издания - " + sudbaCheloveka.getPublishedYear());
        System.out.println("Книга - " + sudbaCheloveka.getBookName());
        System.out.println(" Сравнение авторов " + gogol.equals(sholohov));
        System.out.println(" Хешкод - " + gogol.hashCode());
        System.out.println(" Хешкод - " + sholohov.hashCode());
        sudbaCheloveka.setPublishedYear(2022);
        System.out.println(" Год переиздания  - " + sudbaCheloveka.getPublishedYear());
        tarasBulba.setPublishedYear(2022);
        System.out.println(" Год переиздания  - " + tarasBulba.getPublishedYear());
    }
}
