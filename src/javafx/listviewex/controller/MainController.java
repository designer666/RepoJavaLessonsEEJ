package javafx.listviewex.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.listviewex.entity.User;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


/**
 * Created by kyojin on 07.06.17.
 */
public class MainController {

    private ObservableList<User> users;

    @FXML private TextField fldNewData;
    @FXML private ListView<User> lstWorkspace;

    @FXML
    private void initialize() {
        // Специализированная коллекция, которая обновляет графический интерфейс в случае изменения
        //элементов в коллекции CRUD (Create-Read-Update-Delete)
        users = FXCollections.observableArrayList();
        lstWorkspace.setItems(users);
        lstWorkspace.addEventHandler(EventType.ROOT, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                User user = lstWorkspace.getSelectionModel().getSelectedItem();
                fldNewData.setText(user.getLogin());
            }
        });
    }

    @FXML
    private void onClickNewDataButton(){
        users.add(new User(fldNewData.getText(), "qwerty123"));
        fldNewData.clear();
    }

    @FXML
    private void onClickDeleteDataButton() {
        users.remove(lstWorkspace.getSelectionModel().getSelectedItem());
    }

}
