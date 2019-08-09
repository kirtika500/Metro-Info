package com.example.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText aa,cc;
Button bb,dd,ee,ff;
static String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bb=(Button)findViewById(R.id.b);
        dd=(Button)findViewById(R.id.d);
        aa=(EditText)findViewById(R.id.a);
        cc=(EditText)findViewById(R.id.c);
        ee=(Button)findViewById(R.id.e);
        ff=(Button)findViewById(R.id.f);
        aa.setText(second.r);
        cc.setText(tolist.ri);
        s1=aa.getText().toString();
        s2=cc.getText().toString();
        bb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob=new Intent(MainActivity.this,second.class);
                        startActivity(ob);
                    }
                }
        );
        dd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ob1=new Intent(MainActivity.this,tolist.class);
                        startActivity(ob1);
                    }
                }
        );
        ff.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent obj=new Intent(MainActivity.this,other.class);
                        startActivity(obj);
                    }
                }
        );
        ee.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent obj=new Intent(MainActivity.this,route.class);
                        startActivity(obj);
                    }
                }
        );
    }
}
