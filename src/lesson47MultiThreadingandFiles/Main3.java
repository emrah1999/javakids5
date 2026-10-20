package lesson47MultiThreadingandFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main3 {
    public static void main(String[] args) throws IOException {
        Path path2= Paths.get("C:\\Users\\Emrah\\Desktop\\Java kids\\javakids5\\exapmle2.txt");
        if(!Files.exists(path2)){
            Files.createFile(path2);
        }

        Path path = Paths.get("C:\\Users\\Emrah\\Desktop\\Java kids\\javakids5\\exapmle.txt");
        System.out.println("File name: " + path.getFileName());

        String fileContent= Files.readString(path);


        Files.writeString(path,"Hello salam  Rafiq");

        Path path3= Paths.get("C:\\Users\\Emrah\\Desktop\\Java kids\\javakids5\\exapmle2.txt");

        Files.copy(path,path3,java.nio.file.StandardCopyOption.REPLACE_EXISTING);

        Files.lines(path).filter(n->n.contains("Rafiq")).map(n->n.toUpperCase()).forEach(System.out::println);

    }
}
