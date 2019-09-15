package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText fno, sno, result;
Button add, subtract;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fno=(EditText)findViewById(R.id.fno);
        sno=(EditText)findViewById(R.id.sno);
        result=(EditText)findViewById(R.id.result);
        add=(Button)findViewById(R.id.add);
        subtract=(Button)findViewById(R.id.subtract);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fno1=fno.getText().toString();
                String sno1=sno.getText().toString();
                //Toast.makeText(MainActivity.this, fno1,Toast.LENGTH_LONG).show();
                //Toast.makeText(MainActivity.this, sno1,Toast.LENGTH_LONG).show();


                int n1=Integer.parseInt(fno1);
                int n2=Integer.parseInt(sno1);
                int c=n1+n2;
                result.setText(""+c);


            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fno1=fno.getText().toString();
                String sno1=sno.getText().toString();

                int n1=Integer.parseInt(fno1);
                int n2=Integer.parseInt(sno1);
                int c=n1-n2;
                result.setText(""+c);
            }
        });

}
}
