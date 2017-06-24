package javafx.contacts.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.contacts.entity.User;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Created by kyojin on 08.06.17.
 */
public class MainContactController {

    private ObservableList<User> users;

    @FXML private TextField fldNewData1;
    @FXML private TextField fldNewData2;
    @FXML private TextField fldNewData3;
    @FXML private TextField fldNewData4;
    @FXML private TextArea txtNewData;
    @FXML private ListView<User> lstWorkspace;

    @FXML
    private void initialize() {
        users = FXCollections.observableArrayList();
        lstWorkspace.setItems(users);
        lstWorkspace.addEventHandler(EventType.ROOT, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                User user = lstWorkspace.getSelectionModel().getSelectedItem();
                fldNewData1.setText(user.getName());
                fldNewData2.setText(user.getSurname());
                fldNewData3.setText(user.getPhone());
                fldNewData4.setText(user.getEmail());
                txtNewData.setText(user.getOther());
            }
        });
    }

    @FXML
    private void onClickNewDataButton() {
        users.add(new User(fldNewData1.getText(), fldNewData2.getText(), fldNewData3.getText(), fldNewData4.getText(), txtNewData.getText()));
        fldNewData1.clear();
        fldNewData2.clear();
        fldNewData3.clear();
        fldNewData4.clear();
        txtNewData.clear();
    }

    @FXML
    private void onClickDeleteDataButton() {
        users.remove(lstWorkspace.getSelectionModel().getSelectedItem());
    }

    @FXML
    private void onClickUpdateButton() {
        //users.
    }

    @FXML
    private void onClickExitButton() {
        System.exit(0);
    }

}
