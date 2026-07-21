package lesson30StaticClass;

public class User {
    public String name;

    public static int count=0;

    public final  static double PI=3.14;

    public final static int MAX_AGE=100;

    public User() {
        count++;
    }
    public User(String name) {
        this.name = name;
        count++;
    }

}
