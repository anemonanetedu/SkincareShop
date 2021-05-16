import SKC.Controller.client_afisare_produse;
import SKC.Services.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import SKC.Controller.acceptare_respingere_comanda;
import SKC.Controller.client_afisare_produse;
public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            initDirectory();
            CartServices.initProdusDatabase();
            ProduseService.initProdusDatabase();
            UserService.initDatabase();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("Login.fxml")));
            primaryStage.setTitle("Welcome");
            primaryStage.setScene(new Scene(root, 725, 490));
            primaryStage.show();
        }

        private void initDirectory() {

            Path applicationHomePath = FileSystemService.APPLICATION_HOME_PATH;
            if (!Files.exists(applicationHomePath))
                applicationHomePath.toFile().mkdirs();
        }


        public static void main(String[] args) {
            launch(args);
        }
    }



