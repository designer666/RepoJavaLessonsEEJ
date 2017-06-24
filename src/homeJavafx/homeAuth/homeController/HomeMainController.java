package homeJavafx.homeAuth.homeController;

import homeJavafx.homeAuth.homeModel.HomeInterfaceModel;
import homeJavafx.homeAuth.homeModel.HomeMainModelInt;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by kyojin on 03.06.17.
 */
public class HomeMainController implements Initializable {

    HomeInterfaceModel CalcInt ;

    @FXML
    TextField fldDisplay;

    public void onNumAction0(MouseEvent mouseEvent) {
        if (fldDisplay.getText().equals("0")) {
            fldDisplay.setText("0");
        } else {
            fldDisplay.setText(fldDisplay.getText() + "0");
        }
    }

    public void onNumAction1(MouseEvent mouseEvent) {
        if (fldDisplay.getText().equals("0")) {
            fldDisplay.setText("1");
        } else {
            fldDisplay.setText(fldDisplay.getText() + "1");
        }
    }

    public void onNumAction2(MouseEvent mouseEvent) {
        if (fldDisplay.getText().equals("0")) {
            fldDisplay.setText("2");
        } else {
            fldDisplay.setText(fldDisplay.getText() + "2");
        }
    }

    public void onNumAction3(MouseEvent mouseEvent) {
        if (fldDisplay.getText().equals("0")) {
            fldDisplay.setText("3");
        } else {
            fldDisplay.setText(fldDisplay.getText() + "3");
        }
    }

    public void onNumAction4(MouseEvent mouseEvent) {
        if (fldDisplay.getText().equals("0")) {
            fldDisplay.setText("4");
        } else {
            fldDisplay.setText(fldDisplay.getText() + "4");
        }
    }

    public void onNumAction5(MouseEvent mouseEvent) {
        if (fldDisplay.getText().equals("0")) {
            fldDisplay.setText("5");
        } else {
            fldDisplay.setText(fldDisplay.getText() + "5");
        }
    }

    public void onNumAction6(MouseEvent mouseEvent) {
        if (fldDisplay.getText().equals("0")) {
            fldDisplay.setText("6");
        } else {
            fldDisplay.setText(fldDisplay.getText() + "6");
        }
    }

    public void onNumAction7(MouseEvent mouseEvent) {
        if (fldDisplay.getText().equals("0")) {
            fldDisplay.setText("7");
        } else {
            fldDisplay.setText(fldDisplay.getText() + "7");
        }
    }

    public void onNumAction8(MouseEvent mouseEvent) {
        if (fldDisplay.getText().equals("0")) {
            fldDisplay.setText("8");
        } else {
            fldDisplay.setText(fldDisplay.getText() + "8");
        }
    }

    public void onNumAction9(MouseEvent mouseEvent) {
        if (fldDisplay.getText().equals("0")) {
            fldDisplay.setText("9");
        } else {
            fldDisplay.setText(fldDisplay.getText() + "9");
        }
        //CalcInt.add();
    }

    public void onNumAdd(MouseEvent mouseEvent) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CalcInt = new HomeMainModelInt();
    }

    public void operator(ActionEvent event) {
    }
}
