package basic;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by kyojin on 18.06.17.
 */
public class FileWriterExample {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("test.txt");

        String str1 = "первая строка";
        String str2 = "вторая строка";
        String str3 = "третья строка";

        fw.write(str1 + "\n");
        fw.write(str2 + "\n");
        fw.write(str3 + "\n");

        fw.flush();  //запись в файл

        fw.close();
    }
}
