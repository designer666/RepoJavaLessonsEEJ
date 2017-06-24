package homeJavafx.notepad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by kyojin on 08.06.17.
 */
public class Notepad extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Notepad");
        Parent root = FXMLLoader.load(getClass().getResource("/homeJavafx/notepad/notepad.fxml"));
        Scene main = new Scene(root);
        primaryStage.setScene(main);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
