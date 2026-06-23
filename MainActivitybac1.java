package com.example.thithu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivitybac1 extends AppCompatActivity {
    TextView nhapa, nhapb, kqbac1;
    Button tinh1, quay1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_activitybac1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        nhapa = findViewById(R.id.editTextTextnhapa);
        nhapb = findViewById(R.id.editTextnhapb);
        kqbac1 = findViewById(R.id.editTextTextMultiLine);
        tinh1 = findViewById(R.id.btntinhbac1);
        quay1 = findViewById(R.id.btnquaylaibac1);
        tinh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(nhapa.getText().toString());
                double b = Double.parseDouble(nhapb.getText().toString());
                String kq;
                if (a == 0) {
                    if (b == 0) {
                        kq = "Phương trình vô số nghiệm";
                    } else {
                        kq = "Phương trình vô nghiệm";
                    }
                } else {
                    double x = -b / a;
                    kq = "Nghiệm x = " + x;
                }
                kqbac1.setText(kq);
            }
        });
        quay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitybac1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}