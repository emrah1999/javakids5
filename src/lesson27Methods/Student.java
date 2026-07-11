package lesson27Methods;

public class Student {
    public String name;
    public int age;

    public void info(){
        System.out.println("Student "+this.name+" age "+this.age);
    }
    public String info2(){

        return "Student "+this.name+" age "+this.age;
    }

    public void setName(String name){
        this.name=name;
    }
    public OneClass oneMethod(){
        OneClass oneClass=new OneClass();
        return oneClass;
    }

    public void divide(int a,int b){
        if(b==0){
            System.out.println("Sifira bilmek olmaz");
            return;
        }
        System.out.println(a/b);
    }

}
