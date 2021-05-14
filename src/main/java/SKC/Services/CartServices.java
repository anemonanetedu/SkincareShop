package SKC.Services;

import SKC.Model.Produs;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;
import SKC.Controller.client_afisare_produse;

import static SKC.Services.FileSystemService.getPathProdusToFile;
import SKC.Controller.client_afisare_produse;

import java.util.ArrayList;

public class CartServices {
    public static ObjectRepository<Produs> cartRepository;


    public static void initProdusDatabase() {
        Nitrite database = Nitrite.builder()
                .filePath(getPathProdusToFile("Cart.db").toFile())
                .openOrCreate("admin", "admin1");

        cartRepository = database.getRepository(Produs.class);

    }

    public static void add(Produs produs)
    {

        cartRepository.insert(produs);
    }

    public static ArrayList<Produs> getProduse()
    {
        ArrayList<Produs> produse = new ArrayList<>();
        for(Produs produs : cartRepository.find())
            produse.add(produs);
        return produse;
    }



}
