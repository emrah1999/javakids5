package lesson15switch;

public class Main {
    public static void main(String[] args) {
        String size="M";
        switch (size){
            case "S":{
                System.out.println("Small");
                break;
            }
            case "M":{
                System.out.println("Medium");
                break;
            }
            case "L":{
                System.out.println("Large");
                break;
            }
             default:{
                 System.out.println("Unknown size");
             }
        }
    }
}
