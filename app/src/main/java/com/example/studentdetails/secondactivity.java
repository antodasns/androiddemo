package com.example.studentdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {
private TextView snames,sregnos,smark1s,smark2s,stotals,spercents,sgrades;
int total;
float percent;
String Grade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        snames=(TextView) findViewById(R.id.sname);
        sregnos=(TextView) findViewById(R.id.sregno);
        smark1s=(TextView) findViewById(R.id.smark1);
        smark2s=(TextView) findViewById(R.id.smark2);
        stotals=(TextView) findViewById(R.id.stotal);
        spercents=(TextView) findViewById(R.id.spercent);
        sgrades=(TextView) findViewById(R.id.sgrade);

        total=Integer.parseInt(getIntent().getExtras().getString("mark1"))+Integer.parseInt(getIntent().getExtras().getString("mark2"));
        percent=((float)total/200)*100;
        if(percent>=90 && percent<=100){
            Grade="A";
        }
        else if(percent>=80 && percent<=90){
            Grade="B";
        }
        else if(percent>=70 && percent<=80){
            Grade="C";
        }
        else if(percent>=60 && percent<=70){
            Grade="D";
        }
        else {
            Grade="Failed";
        }
        snames.setText(getIntent().getExtras().getString("name"));
        sregnos.setText(getIntent().getExtras().getString("regno"));
        smark1s.setText(getIntent().getExtras().getString("mark1"));
        smark2s.setText(getIntent().getExtras().getString("mark2"));
        stotals.setText(String.valueOf(total));
        spercents.setText(String.valueOf(percent));
        sgrades.setText(Grade);
    }
}