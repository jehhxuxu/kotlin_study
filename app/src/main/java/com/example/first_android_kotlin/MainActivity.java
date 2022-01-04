package com.example.first_android_kotlin;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Alunos");

        List<String> alunos = new ArrayList<>(Arrays.asList(
                "Jessica",
                "Bia",
                "Helena",
                "Thiago",
                "Lele",
                "Mais",
                "Hmmm",
                "Bora",
                "Old",
                "Tela",
                "Lista",
                "Mais",
                "Hmmm",
                "Bora",
                "Old",
                "Tela",
                "Lista",
                "Mais",
                "Hmmm",
                "Bora",
                "Old",
                "Tela",
                "Lista"));
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));
    }
}
