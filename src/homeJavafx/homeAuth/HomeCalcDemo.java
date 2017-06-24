package homeJavafx.homeAuth;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by kyojin on 02.06.17.
 */

public class HomeCalcDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("CalculatorDemo");
        Parent root = FXMLLoader.load(getClass().getResource("/homeJavafx/homeAuth/homeView/homeMain.fxml"));
        Scene main = new Scene(root);
        primaryStage.setScene(main);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
