package com.bf.africasante.patient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bf.africasante.MainActivity;
import com.bf.africasante.databinding.ActivityConnexionBinding;
import com.bf.africasante.databinding.ActivityResetPassBinding;

public class ResetPassActivity extends AppCompatActivity {

    private ActivityResetPassBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResetPassBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.resetbtn.setOnClickListener(v -> startActivity(new Intent(ResetPassActivity.this, ConnexionActivity.class)));

    }
}