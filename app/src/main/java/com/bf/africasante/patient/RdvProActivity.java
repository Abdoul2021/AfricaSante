package com.bf.africasante.patient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bf.africasante.databinding.ActivityRdvProBinding;

public class RdvProActivity extends AppCompatActivity {

    private ActivityRdvProBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRdvProBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.validerRdvbtn.setOnClickListener(v -> startActivity(new Intent(RdvProActivity.this, ProfilActivity.class)));

    }
}