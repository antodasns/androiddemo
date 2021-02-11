package com.example.studentdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText name,regno,mark1,mark2;
private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        regno=(EditText)findViewById(R.id.regno);
        mark1=(EditText)findViewById(R.id.mark1);
        mark2=(EditText)findViewById(R.id.mark2);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                nextActivity();
            }
        });
    }
    public void nextActivity(){
        Intent obj=new Intent(this,secondactivity.class);
        obj.putExtra("name",name.getText().toString());
        obj.putExtra("regno",regno.getText().toString());
        obj.putExtra("mark1",mark1.getText().toString());
        obj.putExtra("mark2",mark2.getText().toString());
        startActivity(obj);
        finish();
    }
}