package lesson15switch;

public class Main4 {
    public static void main(String[] args) {
        int a = 5;

        int result=switch (a){
            case 5->{
                a*=10;
                yield a;
            }
            case 10->{
                a*=100;
                yield a;
            }
            default -> 0;
        };
        System.out.println(result);
    }
}
