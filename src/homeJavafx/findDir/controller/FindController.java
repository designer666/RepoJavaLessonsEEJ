package homeJavafx.findDir.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.File;
import java.util.Scanner;

/**
 * Created by kyojin on 10.06.17.
 */
public class FindController {

    @FXML private TextField txtFind;

    private String findName() {

        File path = new File("/home/kyojin");

        Scanner name = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fileNameFind = name.nextLine();

        if (path.equals(fileNameFind)) {
            System.out.println(fileNameFind);
        } else {
            System.out.println("File not exist");
        }
        return fileNameFind;
    }

    private void onClickFind() {

    }

}
