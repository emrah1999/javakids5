package lesson32WrapperClass;

public class Main4 {
    public static void main(String[] args) {
        WeekDay day=WeekDay.Sunday;
        System.out.println(day.getInfo());

        if (day.isWeekend()){
            System.out.println(day.getInfo()+" is weekend");
        }else{
            System.out.println(day.getInfo()+" is gunudur");
        }
        System.out.println("-------------------");
        for (WeekDay d : WeekDay.values()){
            System.out.println(d.name()+" "+d.getInfo());
        }
    }
}
