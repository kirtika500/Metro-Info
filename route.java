package com.example.metro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.metro.MainActivity.s1;
import static com.example.metro.MainActivity.s2;

public class route extends AppCompatActivity {
int xi,yi;
    int i,j,time=0,k=0,t=0,sm=0;
    ListView ll;
    int sum[]={0,5,3,5,2,3,3,5,5};
    String[] n={"Mansarovar","New Aatish Market","Vivek Vihar","Shyam Nagar","Ram Nagar","Civil Lines","Railway Station","Sindi Camp","Chand Pol"};

     TextView aa,bb,cc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        aa=(TextView)findViewById(R.id.a);
        bb=(TextView)findViewById(R.id.b);
        cc=(TextView)findViewById(R.id.c);
        ll=(ListView)findViewById(R.id.l);

        for(i=0;i<n.length;i++)
        {
            if(s1.equals(n[i]))
            {
                xi=i;

            }
        }
        for(j=0;j<n.length;j++) {
            if (s2.equals(n[j])) {
                yi= j;
            }
        }

        int count=Math.abs(xi-yi);
        String[] p=new String[count+1];
        if(xi<yi) {
            for (i = xi; i <= yi; i++) {
                p[k]=n[i];
                k++;
            }
        }
        else
        {
            for (i = xi; i >= yi; i--) {
                p[t] = n[i];
                t++;
            }
        }
        if(xi<yi) {
            for (i = xi; i <= yi; i++) {
                sm = sm +sum[i];
            }
        }
        else
        {
            for (i = xi; i >=yi; i--) {
                sm = sm +sum[i];
            }
        }
        if(s1.equals(s2)) {
        aa.setText("0");
        bb.setText("0");
        cc.setText("0");
        String[] e=new String[1];
        e[0]=s1;
            ArrayAdapter<String> obj;
            obj=new ArrayAdapter<String>(route.this,R.layout.support_simple_spinner_dropdown_item,e);
            ll.setAdapter(obj);
        }
        else if(s1.equals(null) && s2.equals(null)) {
            aa.setText("0");
            bb.setText("0");
            cc.setText("0");
            String[] e={""};
            ArrayAdapter<String> obj;
            obj=new ArrayAdapter<String>(route.this,R.layout.support_simple_spinner_dropdown_item,e);
            ll.setAdapter(obj);

        }
        else {
            time = count * 2;
            aa.setText("" + count);
            bb.setText("" + sm);
            cc.setText("" + time);

            ArrayAdapter<String> obj;
            obj = new ArrayAdapter<String>(route.this, R.layout.support_simple_spinner_dropdown_item, p);
            ll.setAdapter(obj);
        }


    }
}
