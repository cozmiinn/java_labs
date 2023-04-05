import Features.Abstract.IEchipament;
import Features.Concrete.Copiator;
import Features.Concrete.Imprimanta;
import Features.Enums.ModulDeTiparire;
import Features.Enums.Zona_mag;
import Features.FileReader.ReadFile;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFile rd = new ReadFile("Echipamente.txt");

        List<IEchipament> echipaments = rd.getEchipaments();
        /*
        for (var ech: echipaments)
        {
         System.out.println(ech);
        }

        for (var ech: echipaments)
        {
            if(ech instanceof Imprimanta)
            System.out.println(ech);
        }
*/
        for (var ech: echipaments)
        {
            if(ech.getClass() == Copiator.class)
                System.out.println(ech);
        }

    }
}