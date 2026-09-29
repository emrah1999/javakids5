package lesson41.genercis;

public class GenericsClass <T>{
    T name;

    public GenericsClass(){

    }
    public GenericsClass(T name){
        this.name=name;
    }
    public void setName(T name){
        this.name=name;
    }
    public T getName(){
        return  name;
    }

    public <P> void print(P str){
        System.out.println(str);
    }
}
