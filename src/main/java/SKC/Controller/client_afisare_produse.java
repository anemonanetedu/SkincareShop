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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;

import static SKC.Services.FileSystemService.getPathProdusToFile;

public class client_afisare_produse {

    @FXML
    private TableView<Produs> tabelproduse;
    @FXML
    private TableColumn<Produs, String> nume;
    @FXML
    private TableColumn<Produs, String> pret;
    @FXML
    private TableColumn<Produs, String> tippiele;

    public void initialize() {
        nume.setCellValueFactory(new PropertyValueFactory<>("nume"));
        pret.setCellValueFactory(new PropertyValueFactory<>("pret"));
        tippiele.setCellValueFactory(new PropertyValueFactory<>("tippiele"));
        tabelproduse.setItems(produse);
    }


    ObservableList<Produs> produse = FXCollections.observableArrayList(ProduseService.getProduse());

    public void handleButonInapoi() throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("client_main_page.fxml"));
        Stage stage = (Stage) tabelproduse.getScene().getWindow();
        stage.setScene(new Scene(root));
    }





}
