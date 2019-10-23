package com.stdio.medicalabbreviationsdictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    DataContainer dataContainer = new DataContainer();
    private EditText etSearch;
    public static ArrayList<DataModel> listForSearching = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSearch = findViewById(R.id.etSearch);
        initRecyclerView();
        listForSearching.addAll(dataContainer.getData());
        setSearchListener();
    }

    private void setSearchListener() {
        etSearch.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                getDataForSearching();
            }
        });
    }

    private void getDataForSearching() {
        listForSearching.clear();
        for (int i = 0; i < dataContainer.getData().size(); i++) {
            if (etSearch.getText().toString().isEmpty()) {
                listForSearching.add(dataContainer.getData().get(i));
            }
            else {
                if (dataContainer.getData().get(i).title.toLowerCase().contains(etSearch.getText().toString().toLowerCase()) || dataContainer.getData().get(i).description.toLowerCase().contains(etSearch.getText().toString().toLowerCase())) {
                    listForSearching.add(dataContainer.getData().get(i));
                }
            }
        }
        initializeAdapter();
    }

    private void initRecyclerView() {
        rv=(RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        dataContainer.initializeData();
        initializeAdapter();
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(listForSearching, this);
        rv.setAdapter(adapter);
    }
}
