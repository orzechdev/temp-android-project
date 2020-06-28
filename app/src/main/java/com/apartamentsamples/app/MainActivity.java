package com.apartamentsamples.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Apartament> apartaments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        apartaments.add(new Apartament("Apartament First", "Lorem ipsum dolor sita amet consectetur adiscipling elit"));
        apartaments.add(new Apartament("Apartament Second", "Lorem ipsum dolor sita amet consectetur adiscipling elit"));
        apartaments.add(new Apartament("Apartament Third", "Lorem ipsum dolor sita amet consectetur adiscipling elit"));
        apartaments.add(new Apartament("Apartament Fourth", "Lorem ipsum dolor sita amet consectetur adiscipling elit"));
        apartaments.add(new Apartament("Apartament Fifth", "Lorem ipsum dolor sita amet consectetur adiscipling elit"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.apartaments_recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        ApartamentsAdapter apartamentsAdapter = new ApartamentsAdapter(apartaments);

        recyclerView.setAdapter(apartamentsAdapter);
    }

}
