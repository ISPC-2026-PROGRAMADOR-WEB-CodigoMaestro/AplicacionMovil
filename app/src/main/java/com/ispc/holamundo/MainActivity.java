package com.ispc.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvBienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBienvenida = findViewById(R.id.tvBienvenida);
        String usuario = getIntent().getStringExtra("EXTRA_USUARIO");
        if (usuario == null || usuario.isEmpty()) {
            usuario = "usuario";
        }
        tvBienvenida.setText("¡Bienvenido/a, " + usuario + "!");
    }
}