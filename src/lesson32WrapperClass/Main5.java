package lesson32WrapperClass;

public class Main5 {
    public static void main(String[] args) {
        RecordClass record = new RecordClass("John", "Doe", 30);
        System.out.println("Ad: " + record.name());
        System.out.println("Soyad: " + record.soyad());
        System.out.println("Yas: " + record.yas());

        RecordClass record2 = new RecordClass("Rafiq", "Doe", 30);

    }
}
