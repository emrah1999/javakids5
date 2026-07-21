package lesson30StaticClass;

public class StaticClass {
    String name;
    public static int count=0;
    public StaticClass() {
        System.out.println("Constructor executed");
    }
    static {
        System.out.println("Static block executed");
    }
    static {
        System.out.println("Static block 2 executed");
    }
    static {
        System.out.println("Static block 3 executed");
    }

    {
       System.out.println("Instance block executed");
    }


}
