package com.example.sethu.employeedetails;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SEARCH extends AppCompatActivity {
    EditText e1;
    Button b1;
    String s1;
    EMP database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        database=new EMP(this);
        database.getWritableDatabase();
        e1 = (EditText)findViewById(R.id.ename);
        b1=(Button)findViewById(R.id.search);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                Log.d("name",s1);



            }
        });

    }
}
