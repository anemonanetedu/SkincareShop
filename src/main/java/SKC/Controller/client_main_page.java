package SKC.Controller;

//import com.sun.javafx.tk.quantum.PaintRenderJob;
import SKC.Model.Produs;
import SKC.Model.User;
import SKC.Services.CartServices;
import SKC.Services.ProduseService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

//import java.awt.event.ActionEvent;
import java.io.IOException;

public class client_main_page {
    @FXML
    private Button butonCreareCont;
    @FXML
    private Button butonAlegereAngajat;
    @FXML
    private Button butonDeconectare;
    @FXML
    private Button butonVizualizareListaServiciiSiPreturi;
    @FXML
    private Button AlegereOptiuneDorita;
    @FXML
    private Button buttonCreate;
    @FXML
    private Text registrationMessage;

    @FXML
    private User user;

    public void setUser(User user)
    {
        this.user=user;
    }


    public void handleCreareCont() throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("crearecont.fxml"));
            Stage stage = (Stage) (butonCreareCont.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println("eroare");
        }
    }
    public void handleAlegereAngajat() throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("clientAlegereAngajat.fxml"));
            Stage stage = (Stage) (butonAlegereAngajat.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println("eroare");
        }
    }

    public void handleVizualizareListaServiciiSiPreturi(){
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("client_afisare_produse.fxml"));
            Stage stage = (Stage) (butonAlegereAngajat.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println("eroare");
        }
    }
    @FXML
    ListView<String> list1=new ListView<String>();
    private ObservableList<String> items_list1 = FXCollections.observableArrayList();
    @FXML
    public void handleProduse()throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("client_afisare_produse.fxml"));
        Stage stage = (Stage) (butonAlegereAngajat.getScene().getWindow());
        stage.setScene(new Scene(root));
    }

    public void handleAlegereOptiuneDorita() throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("clientAlegereOptiune.fxml"));
            Stage stage = (Stage) (butonAlegereAngajat.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println("eroare");
        }
    }

    public void handleDeconectare() throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
            Stage stage = (Stage) (butonDeconectare.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println("eroare");
        }
    }
    @FXML
    public void handleRegisterAction() throws Exception{
        try{
            Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("register.fxml"));
            Stage stage = (Stage) (buttonCreate.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();

        } catch(IOException e){
            registrationMessage.setText("eroare!");
        }
    }

    public void handleCautare() throws IOException {
        try{
            Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("client_cautare_produse.fxml"));
            Stage stage = (Stage) (buttonCreate.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();

        } catch(IOException e){
            registrationMessage.setText("eroare!");
        }


    }


    public void handleVizualizareCos() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("client_afisare_cos.fxml"));
        Stage stage = (Stage) (butonAlegereAngajat.getScene().getWindow());
        stage.setScene(new Scene(root));

    }
}

