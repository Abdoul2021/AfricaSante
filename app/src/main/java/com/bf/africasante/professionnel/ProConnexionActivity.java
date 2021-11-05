package com.bf.africasante.professionnel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bf.africasante.MainActivity;
import com.bf.africasante.databinding.ActivityProConnexionBinding;

public class ProConnexionActivity extends AppCompatActivity {

    private ActivityProConnexionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProConnexionBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.connexionbtn.setOnClickListener(v -> startActivity(new Intent(ProConnexionActivity.this, ProProfilActivity.class)));
        binding.accueil.setOnClickListener(v -> startActivity(new Intent(ProConnexionActivity.this, MainActivity.class)));
        binding.passoublie.setOnClickListener(v -> startActivity(new Intent(ProConnexionActivity.this, ProResetPassActivity.class)));
    }
}