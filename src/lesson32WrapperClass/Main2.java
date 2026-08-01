package lesson32WrapperClass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main2 {
    public static void main(String[] args) {
        long a=3243423423424234234L;
        BigInteger eded=new BigInteger("323423423423452345234523452345");
        BigInteger eded2=new BigInteger("3435683523423451341787944234");
        System.out.println(eded);

        BigInteger cem=eded.add(eded2);
        BigInteger cixma=eded.subtract(eded2);
        BigInteger vurma=eded.multiply(eded2);
        BigInteger bolme=eded.divide(eded2);
        System.out.println("Cem: " + cem);
        System.out.println("Cixma: " + cixma);
        System.out.println("Vurma: " + vurma);
        System.out.println("bolme: " + bolme);

        System.out.println("-------------------------------");

        BigDecimal eded3=new BigDecimal("323423423423452345234523452345.234234234234234234");
        BigDecimal eded4=new BigDecimal("945213252131234.35425724");

        BigDecimal cem2=eded3.add(eded4);
        BigDecimal cixma2=eded3.subtract(eded4);
        BigDecimal vurma2=eded3.multiply(eded4);
        BigDecimal bolme2=eded3.divide(eded4, 25, BigDecimal.ROUND_HALF_UP);
        System.out.println("Cem: " + cem2);
        System.out.println("Cixma: " + cixma2);
        System.out.println("Vurma: " + vurma2);
        System.out.println("bolme: " + bolme2);
        BigInteger eded5=eded4.toBigInteger();

        System.out.println(0.1+0.2);

        System.out.println("--------------------------------");

        if(eded.compareTo(eded2)==0){
            System.out.println("eded ve eded2 beraberdir");
        }else {
            System.out.println(eded.compareTo(eded2));
            System.out.println("eded ve eded2 beraberdir deyil");
        }


    }
}
