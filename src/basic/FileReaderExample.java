package basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by kyojin on 18.06.17.
 */
public class FileReaderExample {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr = new FileReader("test.txt");

        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
}
