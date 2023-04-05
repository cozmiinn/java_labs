package Features.FileReader;

import Features.Abstract.Echipament;
import Features.Abstract.IEchipament;
import Features.Concrete.Copiator;
import Features.Concrete.Imprimanta;
import Features.Concrete.SistemDeCalcul;
import Features.Enums.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    List<IEchipament> echipaments;
    private String PATH;
    public ReadFile(String denumireFisier)
    {
        echipaments = new ArrayList<>();
        PATH = "src/" + denumireFisier;

    }

    public List<IEchipament> getEchipaments()
    {
        BufferedReader flux_in;

        try
        {
            flux_in = new BufferedReader(new FileReader(PATH));

        }catch (Exception exception)
        {
            System.out.printf("file not found error " + exception.toString());
            return null;
        }

        Scanner scanner = new Scanner(flux_in);

        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[] params = line.split(";");

            String denumire = params[0];
            int nr_inv =  Integer.parseInt(params[1]);
            float pret = Float.parseFloat(params[2]);
            Zona_mag zona_mag = Zona_mag.valueOf(params[3]);
            StareEchipament stareEchipament = StareEchipament.valueOf(params[4]);

            switch (params[5])
            {
                case "imprimanta" :
                {

                    var imp = new Imprimanta(
                            denumire,
                            nr_inv,
                            pret,
                            zona_mag,
                            stareEchipament,
                            params[7],
                            Integer.parseInt(params[6]),
                            ModulDeTiparire.valueOf(params[9]),
                            Integer.parseInt(params[8])
                    );

                    echipaments.add(imp);
                    break;
                }
                case "copiator" :
                {
                    var cop = new Copiator(
                        denumire,
                        nr_inv,
                        pret,
                        zona_mag,
                        stareEchipament,
                        Integer.parseInt(params[6]),
                        FormatDeCopiere.valueOf(params[7])
                    );
                    echipaments.add(cop);
                    break;
                }
                case "sistem de calcul" :
                {
                    var sis = new SistemDeCalcul(
                        denumire,
                        nr_inv,
                        pret,
                        zona_mag,
                        stareEchipament,
                        params[6],
                        params[7],
                        params[8],
                        SistemDeOperare.valueOf(params[9])
                    );
                    echipaments.add(sis);
                    break;
                }
                default:
                {
                    System.out.println("ERROR");
                }

            }
        }

        return echipaments;
    }
}
