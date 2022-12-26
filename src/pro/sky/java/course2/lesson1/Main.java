package pro.sky.java.course2.lesson1;

public class Main {

    public static void main(String[] args){
        Automobile lada = new  Automobile("Lada ","Granta","сборка в России",1.7,2015,"желтого цвета");
        Automobile audi = new  Automobile("Audi","A8 50 L TDI quattro","сборка в Германии", 3.0,2020,"черный цвет кузова" );
        Automobile bmv = new  Automobile("BMW","Z8","сборка в Германии",3.0,2021," черный цвет кузова");
        Automobile kia = new  Automobile("Kia","Sportage 4-го поколения","сборка в Южной Корее",2.4,2018,"цвет кузова — красный");
        Automobile Hyundai = new  Automobile("Hyundai","Avante","сборка в Южной Корее",1.6,2016,"цвет кузова — оранжевый");
        System.out.println(lada);
        System.out.println(audi );
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(Hyundai);
    }
}
