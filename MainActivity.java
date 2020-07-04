package com.example.mycustomadeptar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryName;
    private int[] flags={R.drawable.england,R.drawable.australia,R.drawable.usa,R.drawable.bangladesh,R.drawable.japan,R.drawable.nepal,R.drawable.canada,R.drawable.russia,R.drawable.india,R.drawable.china,R.drawable.pakistan,R.drawable.germany,R.drawable.southafrica,R.drawable.brazil,R.drawable.argentina,R.drawable.finland};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName=getResources().getStringArray(R.array.country_name);

        listView=(ListView) findViewById(R.id.ListViewId);

        CustomAdapter adapter=new CustomAdapter(this,countryName,flags);
        listView.setAdapter(adapter);
    }
}