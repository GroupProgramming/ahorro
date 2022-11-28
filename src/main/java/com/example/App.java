package com.example;

public class App
{
    public static void main( String[] args )
    {

        UsuarioEsquema usuario = new UsuarioEsquema("dany");

        Archivo.postUser(usuario);

        System.out.println(Archivo.getUser("dany"));

    }
}
