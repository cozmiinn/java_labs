package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static Object scriere(List<Angajat> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            File file = new File("C:\\Users\\cosmi\\eclipse-workspace\\lab6\\src\\main\\resources\\angajari.json");
            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Angajat> citire() {
        try {
            File file = new File("C:\\Users\\cosmi\\eclipse-workspace\\lab6\\src\\main\\resources\\angajari.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            List<Angajat> ang = mapper.readValue(file, new TypeReference<List<Angajat>>() {
            });
            return ang;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<Angajat> ang = citire();
//        System.out.println("Angajat care are salariu peste 2500: ");
        System.out.println();
    }
}
