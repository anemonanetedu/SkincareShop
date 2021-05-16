package SKC.Controller;

import SKC.Model.Produs;
import SKC.Services.CartServices;
import SKC.Services.ProduseService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class acceptare_respingere_comanda {
    @FXML
    private Button afisare;
    @FXML
     private TableView<Produs> tabel_comenzi;
    @FXML
    private TableColumn<Produs, String> nume;
    @FXML
    private TableColumn<Produs, String> pret;
    @FXML
    private TableColumn<Produs, String> tippiele;

    public void initialize() {
        nume.setCellValueFactory(new PropertyValueFactory<>("nume"));
        pret.setCellValueFactory(new PropertyValueFactory<>("price"));
        tippiele.setCellValueFactory(new PropertyValueFactory<>("tippiele"));
        tabel_comenzi.setItems(prod);
    }

    ObservableList<Produs> prod = FXCollections.observableArrayList(CartServices.getProduse());




    public void handleButonInapoi() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("admin_main_page.fxml"));
        Stage stage = (Stage) tabel_comenzi.getScene().getWindow();
        stage.setScene(new Scene(root));

    }

    public void onAccAction() {
    }

    public void onResAction() {
    }

}
