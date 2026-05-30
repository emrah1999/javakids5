package lesson15switch;

public class Main2 {
    public static void main(String[] args) {
        int month=12;

        switch (month){
            case 12: case 1: case 2:{
                System.out.println("Winter");
                break;
            }
            case 3: case 4: case 5:{
                System.out.println("Spring");
                break;
            }
            case 6: case 7: case 8:{
                System.out.println("Summer");
                break;
            }
            case 9: case 10: case 11:{
                System.out.println("Autumn");
                break;
            }
             default:{
                 System.out.println("Unknown month");
             }
        }


        switch (month){
            case 12,1,2:{
                System.out.println("Winter");
                break;
            }
            case 3,4,5:{
                System.out.println("Spring");
                break;
            }
            case 6,7,8:{
                System.out.println("Summer");
                break;
            }
            case 9,10,11:{
                System.out.println("Autumn");
                break;
            }
            default:{
                System.out.println("Unknown month");
            }
        }
    }
}
