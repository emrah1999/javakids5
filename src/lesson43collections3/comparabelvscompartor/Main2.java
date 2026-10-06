package lesson43collections3.comparabelvscompartor;

public class Main2 {
    public static void main(String[] args) {
        Doable d=new Doable() {
            @Override
            public void doit() {
                System.out.println("doit");
            }
        };

        d.doit();

        Doable d2 =new Doable() {
            @Override
            public void doit() {
                System.out.println("doit2");
            }
        };
        d2.doit();

    }
}
