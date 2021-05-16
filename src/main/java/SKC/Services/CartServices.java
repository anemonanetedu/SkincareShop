package SKC.Services;

import SKC.Model.Produs;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;

import static SKC.Services.FileSystemService.getPathProdusToFile;
import SKC.Controller.vizualizare_status_comanda;
import java.util.ArrayList;
import java.util.List;

public class CartServices {
    public static ObjectRepository<Produs> cartRepository;

    public static void initProdusDatabase() {
        Nitrite database = Nitrite.builder()
                .filePath(getPathProdusToFile("Cart.db").toFile())
                .openOrCreate("admin", "admin1");

        cartRepository = database.getRepository(Produs.class);

    }

    public static void addCos(Produs p)
    {
        cartRepository.insert(p);
    }

    public static ArrayList<Produs> getProduse()
    {
        ArrayList<Produs> produse = new ArrayList<>();
        for(Produs produs : cartRepository.find()) {
            produse.add(produs);
        }
        return produse;
    }

    public static void close() {
        cartRepository.close();
    }

    public static List<Produs> getAllProdus() {
        return cartRepository.find().toList();
    }

}
