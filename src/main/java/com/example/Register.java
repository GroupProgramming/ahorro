package com.example;
public class Register {
    
    public String registro(String nombre,String apellido, String email, String contraseña){

        String res = "Registrado con Exito";
        if(nombre==""){
            res = "Nombre No Valido" ;
        }
        if(apellido==""){
            res = "Apellido No Valido";
        }
        if(email==""){
            res = "Email No Valido";
        }
        if(!esSeguro(contraseña)){
            res = "Contraseña No Valida";
        }
        return res;
    }

    public boolean esSeguro(String contraseña){
        boolean res;
        if(contraseña.length() > 5 ){
            boolean mayuscula= false;
            boolean numero= false;
            char caracter ;
            for(int i=0; i < contraseña.length(); i++){

                caracter = contraseña.charAt(i);
                if(Character.isDigit(caracter)){
                    numero = true;
                }
                if(Character.isUpperCase(caracter)){
                    mayuscula = true;
                }
            }
            if(mayuscula && numero){
                
                res = true;
                
            }else{
                res = false;
                
            }

        }else{
            res = false;
            
        }
        return res;
    }
}