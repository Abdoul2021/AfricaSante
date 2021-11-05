package com.bf.africasante.professionnel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.bf.africasante.databinding.ActivityProResetPassBinding;
import com.bf.africasante.patient.ConnexionActivity;
import com.bf.africasante.patient.ResetPassActivity;

public class ProResetPassActivity extends AppCompatActivity {

    private ActivityProResetPassBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProResetPassBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.resetbtn.setOnClickListener(v -> startActivity(new Intent(ProResetPassActivity.this, ProConnexionActivity.class)));

    }
}