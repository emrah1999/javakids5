package lesson17;

public class Main {
    public static void main(String[] args) {
        int[] arrays={2,45,3,4,2,23};

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println("***************");

        for (int array : arrays){
            System.out.println(array);
        }

        String[] names={"Rafiq","Ali","Emil","Emin","Ibrahim"};
        for (String name : names){
            System.out.println(name);
        }

    }
}
