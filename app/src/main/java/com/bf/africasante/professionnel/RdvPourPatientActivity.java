package com.bf.africasante.professionnel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bf.africasante.databinding.ActivityRdvPourPatientBinding;

public class RdvPourPatientActivity extends AppCompatActivity {

    private ActivityRdvPourPatientBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRdvPourPatientBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.validerRdvbtn.setOnClickListener(v -> startActivity(new Intent(RdvPourPatientActivity.this, ProProfilActivity.class)));

    }
}