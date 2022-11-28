package com.example;

import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.example.UsuarioEsquema;

public class Archivo {

    public static void postUser(UsuarioEsquema usuario) {
        try {
            BufferedWriter user = new BufferedWriter(new FileWriter(usuario.getNombre() + ".txt"));
            user.write(usuario.getNombre());
            user.close();
            
        } catch (IOException e) {
            System.out.println("Error en los post...");
        }
    }

    public static String getUser(String name) {
        String response = "";
        try {
            Reader user = Files.newBufferedReader(Paths.get(name + ".txt"));
            BufferedReader readUser = new BufferedReader(user);
            response = readUser.readLine();
        } catch (IOException e) {
            System.out.println("Error en el get...");
        }
        return response;
    }

}