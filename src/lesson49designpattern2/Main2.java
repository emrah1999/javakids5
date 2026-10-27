package lesson49designpattern2;

public class Main2 {
    public static void main(String[] args) {
        Coffee coffe=new SimpleCoffee();
        System.out.println("Price of simple coffee: "+coffe.getPrice());

        Coffee milkCoffe=new MilkCoffee(coffe);
        System.out.println("Price of milk coffee: "+milkCoffe.getPrice());

        ChocolateCoffe chocolateCoffe=new ChocolateCoffe(coffe);
        System.out.println("Price of chocolate coffee: "+chocolateCoffe.getPrice());
    }
}
