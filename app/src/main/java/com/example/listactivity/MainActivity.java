package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListData[] myListData = new MyListData[]{
                new MyListData("apple","price:70",R.drawable.apple),
                new MyListData("apple","70",R.drawable.allfrouit),
                new MyListData("apple","70",R.drawable.broccoli),
                new MyListData("apple","70",R.drawable.cabbage),
                new MyListData("apple","70",R.drawable.carrot),
                new MyListData("apple","70",R.drawable.cauliflower),
                new MyListData("apple","70",R.drawable.coriander),
                new MyListData("apple","70",R.drawable.curryleaves),
                new MyListData("apple","70",R.drawable.potato),


        };
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.product_recycler_view);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
