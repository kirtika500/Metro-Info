package com.example.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class second extends AppCompatActivity {
    static  String r="";
    ListView ll;
    String[] name={"Mansarovar","New Aatish Market","Vivek Vihar","Shyam Nagar","Ram Nagar","Civil Lines","Railway Station","Sindi Camp","Chand Pol"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ll=(ListView)findViewById(R.id.l);
        ArrayAdapter<String>obj;
        obj=new ArrayAdapter<String>(second.this,R.layout.support_simple_spinner_dropdown_item,name);
        ll.setAdapter(obj);
        ll.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int p, long id) {
                             r = (String) ll.getItemAtPosition(p);
                            Intent obj = new Intent(second.this, MainActivity.class);

                            startActivity(obj);
                    }
                }
        );
    }
}
