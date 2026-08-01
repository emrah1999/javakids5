package lesson32WrapperClass;

public enum WeekDay {
    Monday("Bazar ertesi"),
    Tuesday("Çərşənbə axşamı"),
    Wednesday("Çərşənbə"),
    Thursday("Cümə axşamı"),
    Friday("Cümə"),
    Saturday("Şənbə"),
    Sunday("Bazar");

    private String info;

    WeekDay(String s) {
        this.info = s;
    }

    public String getInfo() {
        return info;
    }
    public boolean isWeekend(){
        return this==Saturday || this==Sunday;
    }
}
