package com.usb.apppub.modelo;

public class CredencialDao {

    public int entradaSistema(String usuario,String password){
        if(usuario.equals("carlos@hotmail.com") && password.equals("123456")){
            return 1;
        }

        return 0;
    }

}
