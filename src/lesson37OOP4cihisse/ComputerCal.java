package lesson37OOP4cihisse;

public class ComputerCal {
    public void calculatePaid(Cihaz cihaz){
        if(cihaz instanceof Computer){
            System.out.println("Computerde klabyuranida da odenishe sal");
        }
        System.out.println("Cihaz odenishi edildi");
    }
}
