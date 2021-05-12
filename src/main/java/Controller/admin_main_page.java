package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import Model.User;
import Services.UserService;

import java.io.IOException;


public class admin_main_page {
    @FXML
    private Button butonAdaugareProduseSiPreturi;
    @FXML
    private Button butonVizualizareComenziInAsteptare;
    @FXML
    private Button AcceptareRespingereComanda;
    @FXML
    private Button butonDeconectare;
    @FXML
    private User user;
    @FXML
    private Button buttonCreate;
    @FXML
    private Text registrationMessage;



    private  String userName;
    public  void setUser(User user){
        this.user=user;
    }



    public void handleProduseSiPreturi() throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("adaugareserviciisipreturi.fxml"));
            Stage stage = (Stage) (butonAdaugareProduseSiPreturi.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println("eroare");
        }
    }
    public void handleVizualizareListaComenziInAsteptare() throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("vizualizarelistaclientiinasteptare.fxml"));
            Stage stage = (Stage) (butonVizualizareComenziInAsteptare.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println("eroare");
        }
    }
    public void handleAcceptareRespingereComanda() throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("acceptarerespingereprogramare.fxml"));
            Stage stage = (Stage) (AcceptareRespingereComanda.getScene().getWindow());
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
}
