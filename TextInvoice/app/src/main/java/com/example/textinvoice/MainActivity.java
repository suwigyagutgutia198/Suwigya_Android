package com.example.textinvoice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fb, gst, result;
    Button total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fb=(EditText)findViewById(R.id.bill);

        result=(EditText)findViewById(R.id.result);
        total=(Button)findViewById(R.id.total);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String foodbill1=fb.getText().toString();

                //Toast.makeText(MainActivity.this, fno1,Toast.LENGTH_LONG).show();
                //Toast.makeText(MainActivity.this, sno1,Toast.LENGTH_LONG).show();


                int n1=Integer.parseInt(foodbill1);

                int c=n1+n1*18/100;
                result.setText(""+c);


            }
        });


    }
}
