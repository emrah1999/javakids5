package lesson41.list;

import lesson23.Car;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("Rafiq");
        str.add("Eli");
        str.add("Ibrahim");
        str.add("Emil");
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);
        Collections.sort(str,Collections.reverseOrder());
        System.out.println(str);;


        Car car=new Car("Bmw");
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(car);
        cars.add(new Car("Mercedes"));
        System.out.println(cars);

    }
}
