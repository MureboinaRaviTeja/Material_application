package com.example.mravi.collapsingtoolbar.branch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.mravi.collapsingtoolbar.R;

import java.util.ArrayList;

public class CseActivity extends AppCompatActivity {

private ListView mListView;

private static final String TAG="CseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_layout);

        mListView=(ListView)findViewById(R.id.listView);


        ArrayList<Card> list=new ArrayList<>();

        list.add(new Card("drawable://"+R.drawable.creative1,"Activity1"));
        list.add(new Card("drawable://"+R.drawable.creative1,"Activity2"));
        list.add(new Card("drawable://"+R.drawable.creative1,"Activity3"));
        list.add(new Card("drawable://"+R.drawable.creative1,"Activity4"));
        list.add(new Card("drawable://"+R.drawable.creative1,"Activity5"));
        list.add(new Card("drawable://"+R.drawable.creative1,"Activity6"));
        list.add(new Card("drawable://"+R.drawable.creative1,"Activity7"));

        CustomListAdapter adapter=new CustomListAdapter(this,R.layout.cselist_layout,list);
        mListView.setAdapter(adapter);


    }
}
