package SKC.Services;

import SKC.Exception.NoUpperCaseException;
import SKC.Exception.UncompletedFieldsException;
import SKC.Exception.UsernameAlreadyExistException;
import SKC.Model.Produs;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;

import static SKC.Services.FileSystemService.getPathProdusToFile;

public class ProduseService {
    public static ObjectRepository<Produs> produsRepository;


    public static void initProdusDatabase() {
        Nitrite database = Nitrite.builder()
                .filePath(getPathProdusToFile("Produse.db").toFile())
                .openOrCreate("admin", "admin1");

        produsRepository = database.getRepository(Produs.class);
    }



    public static void addProduse(String nume, String pret, String tippiele)
    {

     Produs produs = new Produs(nume,pret,tippiele);
        produsRepository.insert(produs);

    }

}


