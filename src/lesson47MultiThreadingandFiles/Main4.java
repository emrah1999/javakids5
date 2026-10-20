package lesson47MultiThreadingandFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) throws IOException {
        Path file= Paths.get("C:\\Users\\Emrah\\Desktop\\Java kids\\javakids5\\Screenshot 2026-06-02 195912.png");
        byte[] bytes= Files.readAllBytes(file);
        Files.write(file,bytes);
        System.out.println(Arrays.toString(bytes));
    }
}
