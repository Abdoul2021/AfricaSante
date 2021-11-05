package com.bf.africasante.patient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bf.africasante.MainActivity;
import com.bf.africasante.databinding.ActivityCreationBinding;
import com.bf.africasante.databinding.ActivityRdvBinding;

public class RdvActivity extends AppCompatActivity {

    private ActivityRdvBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRdvBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.accueil.setOnClickListener(v -> startActivity(new Intent(RdvActivity.this, MainActivity.class)));

    }
}