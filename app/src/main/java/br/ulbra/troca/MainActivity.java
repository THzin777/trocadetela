package br.ulbra.troca;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgFoto;
    Button btnImagem1, btnImagem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFoto = findViewById(R.id.imgFoto);
        btnImagem1 = findViewById(R.id.btnImagem1);
        btnImagem2 = findViewById(R.id.btnImagem2);

        btnImagem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFoto.setImageResource(R.drawable.foto1);
            }
        });

        btnImagem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFoto.setImageResource(R.drawable.foto2);
            }
        });
    }
}