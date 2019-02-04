package com.example.sethu.employeedetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3,e4,e5,e6,e7;
    String s1,s2,s3,s4,s5,s6,s7;
    EMP emp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.submit);
        e1=(EditText)findViewById(R.id.ecode);
        e2=(EditText)findViewById(R.id.ename);
        e3=(EditText)findViewById(R.id.emobno);
        e4=(EditText)findViewById(R.id.eemail);
        e5=(EditText)findViewById(R.id.edesg);
        e6=(EditText)findViewById(R.id.esalary);
        e7=(EditText)findViewById(R.id.ecompany);

        emp1=new EMP(this);
        emp1.getWritableDatabase();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();
                s6=e6.getText().toString();
                s7=e7.getText().toString();
                Log.d("ecode",s1);
                Log.d("ename",s2);
                Log.d("emobno",s3);
                Log.d("eemail",s4);
                Log.d("edesg",s5);
                Log.d("esalary",s6);
                Log.d("ecompany",s7);
                boolean status=emp1.insertData(s1,s2,s3,s4,s5,s6,s7);
                if (status==true)
                {
                    Toast.makeText(getApplicationContext(),"successfully insert",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
