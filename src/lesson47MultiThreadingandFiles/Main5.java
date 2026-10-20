package lesson47MultiThreadingandFiles;

import java.io.File;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Emrah\\Desktop\\Java Ders\\javakids5");
        List<File> files=List.of(file.listFiles());
        findFiles(files);
    }

    public static void findFiles(List<File> files){
        for(File file:files){
            if(file.isDirectory()){
                findFiles(List.of(file.listFiles()));
            }else{
                System.out.println(file.getName());
                System.out.println(file.getPath());
                System.out.println(file.length()/1024D+" kb");
            }
        }
    }
}
