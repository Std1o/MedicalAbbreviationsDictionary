package com.stdio.medicalabbreviationsdictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataModel> dataList;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        rv=(RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        dataList = new ArrayList<>();
        dataList.add(new DataModel("Wert", "Показатель, величина"));
        dataList.add(new DataModel("Ergebnis", "результат"));
        dataList.add(new DataModel("Kommentar", "комментарий"));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(dataList, this);
        rv.setAdapter(adapter);
    }
}
