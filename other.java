package com.example.metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class other extends AppCompatActivity {
Button aa1,bb1,cc1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        aa1=(Button)findViewById(R.id.a1);
        bb1=(Button)findViewById(R.id.b1);
        cc1=(Button)findViewById(R.id.c1);
        aa1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent obj=new Intent(other.this,aboutmetro.class);
                        startActivity(obj);
                    }
                }
        );
        bb1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent obj=new Intent(other.this,parking.class);
                        startActivity(obj);
                    }
                }
        );
        cc1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent obj=new Intent(other.this,farelist.class);
                        startActivity(obj);
                    }
                }
        );
    }
}
