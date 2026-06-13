package lesson19String;

public class Main4 {
    public static void main(String[] args) {
        String str1="Salam necesen";
        int index=str1.indexOf("e",7,10);
        System.out.println(index);
        int indeks=str1.indexOf("e");//7
        int count=0;
        while (indeks!=-1){
            indeks=str1.indexOf("e",indeks+1);
            //indeks=11
            count++;
        }
        System.out.println("Count: "+count);

        String s=new String("Salam necesen");

    }
}
