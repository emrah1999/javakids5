package lesson42Collesctions2.comparable;

public class Student implements Comparable<Student>{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student other=(Student) obj;
            return this.name.equals(other.name) && this.age==other.age;
        }else{
            return false;
        }
    }
    @Override
    public int hashCode() {
        return name.hashCode()+age;
    }
}
