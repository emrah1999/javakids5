package lesson47MultiThreadingandFiles;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Emrah\\Desktop\\Java kids\\javakids5\\exapmle.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("File length : " + file.length());
        FileWriter writer=new FileWriter(file);
        writer.write("Hello salam  Rafiq");
        writer.close();
        System.out.println("File length : " + file.length());

        FileReader reader=new FileReader(file);
        int data;
        while ((data=reader.read())!=-1){
            System.out.print((char)data);
        }
        reader.close();
        System.out.println("*************");



        try(BufferedReader bufferedReader2=new BufferedReader(new FileReader(file))) {
            String line2;
            while ((line2 = bufferedReader2.readLine()) != null) {
                System.out.println(line2);
            }
        }
    }
}
