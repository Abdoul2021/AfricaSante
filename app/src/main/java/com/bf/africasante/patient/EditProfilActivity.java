package com.bf.africasante.patient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bf.africasante.databinding.ActivityEditProfilBinding;

public class EditProfilActivity extends AppCompatActivity {

    private ActivityEditProfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditProfilBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.editprofilbtn.setOnClickListener(v -> startActivity(new Intent(EditProfilActivity.this, ProfilActivity.class)));

    }
}