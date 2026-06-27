package lesson23;

public class Main2 {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.sum("Salam", "sss", 5, 10);
        calculate.sum(5, 10, 45);
        calculate.sum(5, 10, 45, 457);
        calculate.sum(5, 10, 45, 457, 35, 45, 45, 3453, 345);
        calculate.sum();
        calculate.sum(4);

        int[] arr = {34, 34, 34, 346, 465, 34};
        calculate.sum2(arr);
    }
}
