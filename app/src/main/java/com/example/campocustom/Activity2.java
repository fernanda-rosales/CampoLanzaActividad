package com.example.campocustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        String mensaje = getIntent().getStringExtra(getString(R.string.llave_msj));
        textView = findViewById(R.id.text_mensaje);
        textView.setText(mensaje);
    }
}
