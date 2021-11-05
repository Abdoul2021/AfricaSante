package com.bf.africasante.patient;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bf.africasante.databinding.ActivityCreationBinding;

public class CreationActivity extends AppCompatActivity {

    private ActivityCreationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.creationbtn.setOnClickListener(v -> startActivity(new Intent(CreationActivity.this, ConnexionActivity.class)));

    }
}