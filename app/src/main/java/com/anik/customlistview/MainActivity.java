package com.anik.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    String countryList[]={"Bangladesh","India","China","Australia","America","New Zealand","Portugal"};
    int imgList[]={R.drawable.bd,R.drawable.india,R.drawable.china,R.drawable.australia,R.drawable.america,R.drawable.new_zealand,R.drawable.portugle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customList=findViewById(R.id.listview);
        CustomAdapter adapter=new CustomAdapter(MainActivity.this,countryList,imgList);
        customList.setAdapter(adapter);

        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(MainActivity.this, countryList[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}
