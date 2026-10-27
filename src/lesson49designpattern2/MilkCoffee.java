package lesson49designpattern2;

public class MilkCoffee implements Coffee{
    private Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public int getPrice() {
        return coffee.getPrice() + 2;
    }
}
