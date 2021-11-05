package com.bf.africasante.professionnel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bf.africasante.databinding.ActivityProEditProfilBinding;

public class ProEditProfilActivity extends AppCompatActivity {

    private ActivityProEditProfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProEditProfilBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.editprofilbtn.setOnClickListener(v -> startActivity(new Intent(ProEditProfilActivity.this, ProProfilActivity.class)));

    }
}