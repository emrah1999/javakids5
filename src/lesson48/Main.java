package lesson48;

public class Main {
    public static void main(String[] args) {
        String pattern = "\\d{3}-\\d{2}-\\d{4}";
        String pattern2 = "[ssd]{3}";
        String pattern4 = "[0-9a-z]{3}";
        String input = "123-45-6789";
        String input2 = "123-45-w33";
        if(input.matches(pattern)){
            System.out.println("Input matches the pattern.");
        } else {
            System.out.println("Input does not match the pattern.");
        }
        if (input2.matches(pattern)){
            System.out.println("Input2 matches the pattern.");
        } else {
            System.out.println("Input2 does not match the pattern.");
        }
    }
}
