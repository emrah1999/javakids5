package lesson27Methods;

public class Mian2 {
    String name;
    public static void main(String[] args) {
        OneClass.age=20;
        OneClass.staticMethod();

        OneClass oneClass = new OneClass();
        OneClass oneClass2 = new OneClass();
        oneClass2.age=30;
        System.out.println(oneClass.age);
        System.out.println(oneClass2.age);
        System.out.println(OneClass.age);

        salam(10,20);

    }

    public static void salam(int a ,int b){
        System.out.println(a+b);
    }

    public void salam2(){
        this.name="salam";
        System.out.println("salam2");
    }
}
