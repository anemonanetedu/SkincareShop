package SKC.Controller;

import SKC.Services.ProduseService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.awt.*;

public class adauga_produse_page {
    @FXML
    public TextField numeprodus;

    @FXML
    private TextField pretprodus;
    @FXML
    private TextField tippiele;
    @FXML
    private Button add;

    public void handleAddAction(ActionEvent actionEvent) {
        ProduseService.addProduse(numeprodus.getText(),pretprodus.getText(),tippiele.getText());
    }
}
