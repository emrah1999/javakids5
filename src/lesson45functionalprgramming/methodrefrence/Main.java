package lesson45functionalprgramming.methodrefrence;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,Integer> function= Calc::square;

        CalcInterface calcInterface = Calc::square;
        int g = Calc.square(3);

        System.out.println(calcInterface.square(5));
    }
}
