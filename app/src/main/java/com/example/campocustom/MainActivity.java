package com.example.campocustom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Campo campo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo = findViewById(R.id.campo);
        campo.setOnClickButton(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensaje = campo.getText();
                String llaveMsj = getString(R.string.llave_msj);
                enviaMsj(mensaje, llaveMsj, Activity2.class);
            }
        });
    }

    public void enviaMsj(String mensaje, String llaveMsj, Class activity) {
        Intent intent = new Intent(this, activity);
        intent.putExtra(llaveMsj, mensaje);
        startActivity(intent);
    }
}
