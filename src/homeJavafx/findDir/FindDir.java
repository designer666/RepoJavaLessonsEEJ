package homeJavafx.findDir;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by kyojin on 10.06.17.
 */
public class FindDir extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Find Directory");
        Parent root = FXMLLoader.load(getClass().getResource("/homeJavafx/findDir/main.fxml"));
        Scene main = new Scene(root);
        primaryStage.setScene(main);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
