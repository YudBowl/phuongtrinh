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

public class MainActivity2 extends AppCompatActivity {
    TextView anhap,bnhap,cnhap,kq2;
    Button tinh2,quay2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        anhap=findViewById(R.id.editTextTextnhapa);
        bnhap=findViewById(R.id.editTextTextnhapb);
        cnhap=findViewById(R.id.editTextTextnhapc);
        kq2=findViewById(R.id.ketquabac2);
        tinh2=findViewById(R.id.tinhbac2);
        quay2=findViewById(R.id.quaylai2);

        tinh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(anhap.getText().toString());
                double b = Double.parseDouble(bnhap.getText().toString());
                double c = Double.parseDouble(cnhap.getText().toString());
                String kq;
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    kq = "Vô nghiệm thực";
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    kq = "Nghiệm kép x = " + x;
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    kq = "x1 = " + x1 + "\nx2 = " + x2;
                }

                kq2.setText(kq);

            }
        });
        quay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}