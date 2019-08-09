package com.example.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class parking extends AppCompatActivity {
    static  String r="";
    ListView ll;
    String[] name={"Mansarovar","New Aatish Market","Vivek Vihar","Shyam Nagar","Ram Nagar","Civil Lines","Railway Station","Sindi Camp","Chand Pol"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        ll=(ListView)findViewById(R.id.l);
        ArrayAdapter<String> obj;
        obj=new ArrayAdapter<String>(parking.this,R.layout.support_simple_spinner_dropdown_item,name);
        ll.setAdapter(obj);
        ll.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int p, long id) {
                        r = (String) ll.getItemAtPosition(p);
                        if(r.equals("Mansarovar")||r.equals("Vivek Vihar")||r.equals("Ram Nagar")||r.equals("Railway Station")||r.equals("Chand Pol"))
                        {
                            Toast.makeText(parking.this,"Parking Available",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(parking.this,"Parking Not Available",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
