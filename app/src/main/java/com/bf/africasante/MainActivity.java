package com.bf.africasante;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bf.africasante.databinding.ActivityMainBinding;
import com.bf.africasante.patient.ConnexionActivity;
import com.bf.africasante.patient.RdvActivity;
import com.bf.africasante.professionnel.ProConnexionActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.patient.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ConnexionActivity.class)));
        binding.rdvbtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RdvActivity.class)));
        binding.pro.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ProConnexionActivity.class)));

    }
}