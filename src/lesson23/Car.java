package lesson23;

public class Car{
    String brand;

    public Car(String brand){
        this.brand = brand;
    }
    @Override
    public String toString(){
        return "Car obj Brand: "+this.brand;
    }
}
