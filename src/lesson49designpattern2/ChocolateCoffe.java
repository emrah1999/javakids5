package lesson49designpattern2;

public class ChocolateCoffe implements Coffee{
    private Coffee coffee;

    public ChocolateCoffe(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public int getPrice() {
        return coffee.getPrice() + 3;
    }
}
