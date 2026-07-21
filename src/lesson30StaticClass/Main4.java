package lesson30StaticClass;

public class Main4 {
    public static void main(String[] args) {
        StaticClass staticClass=new StaticClass();
        StaticClass staticClass1=new StaticClass();
        StaticClass staticClass2=new StaticClass();
        staticClass2.name="John";
        StaticClass.count=23;
    }
}
