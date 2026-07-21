package lesson30StaticClass;

public class MethodClass {
    String name;
    static int count;
    public static void method1(){
        System.out.println("Method 1");
        int deyer=method2();
    }
    public static int method2(){

        return count;
    }
    public void method3(){
        System.out.println("Method 3");
    }
}
