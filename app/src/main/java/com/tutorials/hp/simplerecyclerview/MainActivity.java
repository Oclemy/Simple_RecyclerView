package com.tutorials.hp.simplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tutorials.hp.simplerecyclerview.m_Recycler.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SET UP RECYCLERVIEW
        RecyclerView rv= (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        //ADAPTER
        MyAdapter adapter=new MyAdapter(this,getData());
        rv.setAdapter(adapter);

    }

    //FILL DATA
    private ArrayList<String> getData()
    {
        ArrayList<String> languages=new ArrayList<>();
        languages.clear();

        //FILL
        languages.add("Java");
        languages.add("C#");
        languages.add("VB.NET");
        languages.add("PHP");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("C");
        languages.add("C++");
        languages.add("Fortran");
        languages.add("Cobol");
        languages.add("Perl");
        languages.add("Prolog");

        return languages;
    }
}
