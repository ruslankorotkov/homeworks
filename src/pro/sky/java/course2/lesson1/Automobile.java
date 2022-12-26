package pro.sky.java.course2.lesson1;

public class Automobile {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    @Override
    public String toString() {
        return "Automobile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    Automobile(String brand, String model, String productionCountry, double engineVolume, int productionYear, String color){
        this.brand = brand;
        this.model = model;
        this.productionCountry = productionCountry;
        this.productionYear = productionYear;
        this.color = color;
        this.engineVolume = engineVolume;
    }

}
