package lesson32WrapperClass;

public record RecordClass(String name, String soyad, int yas) {
    public boolean checkYas(){
        if (yas < 18) {
            return false;
        } else {
            return true;
        }
    }
}
