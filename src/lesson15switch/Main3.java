package lesson15switch;

public class Main3 {
    public static void main(String[] args) {
        int day = 3;
        switch (3) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            default: {
                System.out.println("Unknown day");
            }
        }

        String week = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown day";
        };
        System.out.println(week);

        int month = 12;
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Unknown month";
        };
        System.out.println(season);
    }
}
