package lesson41.genercis;

public class Main {
    public static void main(String[] args) {
        AdiClass adiClass=new AdiClass();
        adiClass.name="asas";

        GenericsClass<String> obj=new GenericsClass<>();
        obj.name="Strasad";

        GenericsClass<Integer> obj1=new GenericsClass<>();
        obj1.name=123123;

        GenericsClass<AdiClass> obj2=new GenericsClass<>();
        obj1.print("Salam");
        obj1.print(23);


        obj2.name=new AdiClass();

        DoubleGen<String,Integer> object=new DoubleGen<>();
        DoubleGen<Integer,Integer> object1=new DoubleGen<>();
        DoubleGen<String,String> object3=new DoubleGen<>();
        DoubleGen<Double,Double> object4=new DoubleGen<>();
    }
}
