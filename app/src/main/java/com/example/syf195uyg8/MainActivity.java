package com.example.syf195uyg8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editArabaHiz, editArabaKapi, editOtobosKapi, editOtobosHiz, editYolcuAl, editYolcuIndir;
    Button btnSur, btnYolcuAl, btnYolcuIndir;
    TextView bildiri, bildiri2, bildiri3, bildiri4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editArabaHiz = findViewById(R.id.editTxtAHız);
        editArabaKapi = findViewById(R.id.editTxtAKapiSayi);
        editOtobosHiz = findViewById(R.id.editTxtOtobosHız);
        editOtobosKapi = findViewById(R.id.editTxtOtobosKapıSayisi);
        editYolcuAl = findViewById(R.id.editTxtYolcuAl);
        editYolcuIndir = findViewById(R.id.editTxtYolcuindir);
        btnSur = findViewById(R.id.surButon);
        btnYolcuAl = findViewById(R.id.yolcuAlButon);
        btnYolcuIndir = findViewById(R.id.yolcuIndir);
        bildiri = findViewById(R.id.txtViewBildiri);
        bildiri2 = findViewById(R.id.txtViewBildiri2);
        bildiri3 = findViewById(R.id.txtViewBildiri3);
        bildiri4 = findViewById(R.id.txtViewBildiri4);

        Araba araba = new Araba();
        araba.setKapiSayisi(4);
        araba.setAracHizi(230);

        Otobos otobos = new Otobos();
        otobos.setAracHizi(90);
        otobos.setKapiSayisi(2);

        btnSur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bildiri.setText("Max Hızı: "+editArabaHiz.getText().toString()+"  "+editArabaKapi.getText().toString()+" "+"Kapılı: "+" "+araba.sur());
                bildiri2.setText("Max Hızı: "+editOtobosHiz.getText().toString()+"  "+editOtobosKapi.getText().toString()+" "+"Kapılı: "+" "+otobos.otobosSur());
            }
        });

        btnYolcuAl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bildiri3.setText(editYolcuAl.getText().toString()+" "+otobos.yolcuAl());
            }
        });

        btnYolcuIndir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bildiri4.setText(editYolcuIndir.getText().toString()+" "+otobos.yolcuIndir());
            }
        });
        if(btnYolcuIndir.cl)






    }
}