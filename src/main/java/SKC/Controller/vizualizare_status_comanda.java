package SKC.Controller;

import SKC.Model.Produs;
import SKC.Services.CartServices;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class vizualizare_status_comanda{
    @FXML
    private TableView<Produs> tabelproduse;
    @FXML
    private TableColumn<Produs, String> nume;
    @FXML
    private TableColumn<Produs, String> pret;
    @FXML
    private TableColumn<Produs, String> tippiele;
    @FXML
    private Button status_comanda;

    public void initialize() {
        nume.setCellValueFactory(new PropertyValueFactory<>("nume"));
        pret.setCellValueFactory(new PropertyValueFactory<>("pret"));
        tippiele.setCellValueFactory(new PropertyValueFactory<>("tippiele"));
        tabelproduse.setItems(produse);
    }

    ObservableList<Produs> produse = FXCollections.observableArrayList(CartServices.getProduse());




    public void handleButonInapoi() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("client_main_page.fxml"));
        Stage stage = (Stage) tabelproduse.getScene().getWindow();
        stage.setScene(new Scene(root));

    }
}
