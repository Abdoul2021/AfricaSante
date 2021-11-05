package com.bf.africasante.patient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bf.africasante.MainActivity;
import com.bf.africasante.databinding.ActivityProfilBinding;

public class ProfilActivity extends AppCompatActivity {

    private ActivityProfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfilBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.deconnexionbtn.setOnClickListener(v -> startActivity(new Intent(ProfilActivity.this, ConnexionActivity.class)));
        binding.editprofil.setOnClickListener(v -> startActivity(new Intent(ProfilActivity.this, EditProfilActivity.class)));
        binding.rvd.setOnClickListener(v -> startActivity(new Intent(ProfilActivity.this, RdvActivity.class)));


    }
}