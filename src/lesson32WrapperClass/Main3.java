package lesson32WrapperClass;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        Size size=Size.SMALL;
        switch (size){
            case SMALL:
                System.out.println("Small size");
                break;
            case MEDIUM:
                System.out.println("Medium size");
                break;
            case LARGE:
                System.out.println("Large size");
                break;
            case EXTRA_LARGE:
                System.out.println("Extra large size");
                break;
        }

        Size[] sizes=Size.values();

        System.out.println(Arrays.toString(sizes));

        System.out.println(Size.valueOf("SMALL"));
        System.out.println(Size.SMALL.name());
        System.out.println(Size.SMALL.ordinal());
    }
}
