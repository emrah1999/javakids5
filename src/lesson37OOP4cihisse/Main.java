package lesson37OOP4cihisse;

public class Main {
    public static void main(String[] args) {
        Cihaz cihaz=new Computer();
        Cihaz cihaz2=new Planset();
        ComputerCal computerCal=new ComputerCal();
        computerCal.calculatePaid(cihaz);
        computerCal.calculatePaid(cihaz2);
    }
}
