package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Recette;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableView<Recette> tab;

    @FXML
    private TableColumn<Recette, Long> id_c;

    @FXML
    private TableColumn<Recette, String> r_c;

    @FXML
    private TableColumn<Recette, String> d_c;

    @FXML
    private Button search;

    @FXML
    private TextField tField;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        id_c.setCellValueFactory(new PropertyValueFactory<Recette , Long>("id"));
        r_c.setCellValueFactory(new PropertyValueFactory<Recette , String>("recette"));
        d_c.setCellValueFactory(new PropertyValueFactory<Recette , String>("description"));


    }
}
