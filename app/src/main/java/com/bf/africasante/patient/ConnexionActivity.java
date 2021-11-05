package com.bf.africasante.patient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bf.africasante.MainActivity;
import com.bf.africasante.databinding.ActivityConnexionBinding;

public class ConnexionActivity extends AppCompatActivity {

    private ActivityConnexionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConnexionBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.connexionbtn.setOnClickListener(v -> startActivity(new Intent(ConnexionActivity.this, ProfilActivity.class)));
        binding.accueil.setOnClickListener(v -> startActivity(new Intent(ConnexionActivity.this, MainActivity.class)));
        binding.passoublie.setOnClickListener(v -> startActivity(new Intent(ConnexionActivity.this, ResetPassActivity.class)));
        binding.creation.setOnClickListener(v -> startActivity(new Intent(ConnexionActivity.this, CreationActivity.class)));




    }
}