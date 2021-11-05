package com.bf.africasante.professionnel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bf.africasante.databinding.ActivityProProfilBinding;
import com.bf.africasante.patient.ProfilActivity;
import com.bf.africasante.patient.RdvProActivity;

public class ProProfilActivity extends AppCompatActivity {

    private ActivityProProfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProProfilBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.deconnexionbtn.setOnClickListener(v -> startActivity(new Intent(ProProfilActivity.this, ProConnexionActivity.class)));
        binding.editprofil.setOnClickListener(v -> startActivity(new Intent(ProProfilActivity.this, ProEditProfilActivity.class)));
        binding.rdvPourPatientBtn.setOnClickListener(v -> startActivity(new Intent(ProProfilActivity.this, RdvPourPatientActivity.class)));

    }
}