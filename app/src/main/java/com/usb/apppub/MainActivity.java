package com.usb.apppub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.usb.apppub.modelo.CredencialDao;

public class MainActivity extends AppCompatActivity {

    private EditText usertext;
    private EditText passtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usertext=findViewById(R.id.usertext);
        passtext=findViewById(R.id.passtext);
    }

    public void entrada(View view){

        CredencialDao credencialDao=new CredencialDao();
        int respuesta=credencialDao.entradaSistema(usertext.getText().toString(),
                passtext.getText().toString());
        if(respuesta==1){
            Toast.makeText(this,"Acceso Al Sistema",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Usuario o Password " +
                    " invalido",Toast.LENGTH_LONG).show();
        }


    }




}