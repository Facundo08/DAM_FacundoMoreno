package com.example.dam_facundomoreno;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Clic en el Botón Enviar", Toast.LENGTH_SHORT).show());

        TextView tv2 = findViewById(R.id.textViewg);
        tv2.setOnClickListener(view -> Toast.makeText(this, "Se envió sus datos", Toast.LENGTH_SHORT).show());
    }
}