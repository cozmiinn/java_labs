package ex1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppMain {
    public static void main(String[] args)
    {

        List<Angajat> angajati = new ArrayList<>();
        angajati.add(new Angajat( "Veniamin", "director", LocalDate.parse("2020-04-01"), 2500));
        angajati.add(new Angajat( "Vicu", "sef", LocalDate.now().minusYears(1).withMonth(4), 8000));
        angajati.add(new Angajat( "Ana", "director", LocalDate.now().minusYears(1).withMonth(4), 9000));
        angajati.add(new Angajat( "Mariana", "director", LocalDate.parse("2022-04-20"), 9000));
        angajati.add(new Angajat( "Marilena", "director", LocalDate.parse("2023-04-20"), 9000));
        angajati.add(new Angajat( "Dragos", "Senior", LocalDate.now(), 7000));
        angajati.add(new Angajat( "Nelu", "asistent", LocalDate.now(), 2500));

        scriere(angajati);



        angajati = citire();

        System.out.println("Toti angajatii\n");
        for (var ang: angajati) {
            System.out.println(ang);
        }
        System.out.println("\n");

        /*
        afisare_filtrata(angajati, new Filtru<Angajat>() {
            @Override
            public boolean test(Angajat p) {
                return p.getSalariul() > 2500;
            }
        });

        afisare_filtrata2(angajati, new Predicate<Angajat>() {
            @Override
            public boolean test(Angajat angajat) {
                return angajat.getSalariul() > 2500;
            }
        });
        */

        System.out.println("2.Toti angajatii cu salariul mai mare de 2500\n");
        angajati.stream()
                .filter(a->a.getSalariul() > 2500)
                .forEach(a->System.out.println(a));
        System.out.println("\n");

        System.out.println("3.Angajatii pe post de sef sau director\n");
        LocalDate date;
        angajati.stream()
                .filter(a -> a.getPostul().contentEquals("sef") || a.getPostul().contentEquals("director"))
                .filter(a->a.getData_angajatori().isAfter(LocalDate.now().minusYears(1).withMonth(4).withDayOfMonth(1)) &&
                        a.getData_angajatori().isBefore(LocalDate.now().minusYears(1).withMonth(5).withDayOfMonth(1)))
                .collect((Collectors.toList()))
                .forEach(a->System.out.println(a));
        System.out.println("\n");

        System.out.println("4.Angajatii care nu au post de sef sau director\n");
        angajati.stream()
                .filter(a -> !a.getPostul().contentEquals("sef") && !a.getPostul().contentEquals("director"))
                .sorted( (a , b) -> Integer.compare((int)b.getSalariul() , (int)a.getSalariul())  )
                .collect((Collectors.toList() ))
                .forEach(a->System.out.println(a));
        System.out.println("\n");

        System.out.println("5.lista de angajați\n");
        angajati.stream()
                .map(a->a.getNumele().toUpperCase())
                .collect((Collectors.toList() ))
                .forEach(a->System.out.println(a));
    }

    static  void scriere(List<Angajat> lista)
    {
        try {
            ObjectMapper mapper=new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

            File file=new File("src/main/resources/angajati.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<Angajat> citire()
    {
        try {
            File file=new File("src/main/resources/angajati.json");
            ObjectMapper mapper=new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

            List<Angajat> angajati = mapper
                    .readValue(file, new TypeReference<List<Angajat>>(){});
            return angajati;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static void afisare_filtrata(List<Angajat> angajati, Filtru<Angajat> f) {
        for(var ang:angajati)
            if(f.test( ang ))
                System.out.println( ang);
    }

    static void afisare_filtrata2(List<Angajat> angajati, Predicate<Angajat> p) {
        for(var ang:angajati)
            if(p.test( ang ))
                System.out.println( ang);
    }
}
