package com.example.temadawm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.example.temadawm.model.Animal;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.temadawm.fragment.AnimalPage;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button closeButton = findViewById(R.id.buttonClose);
        Button changeFragmentButton = findViewById(R.id.changeToFragment1);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        changeFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragmentButton.setVisibility(View.GONE);
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.MainPage, new AnimalPage()).commit();
            }
        });

    }
}