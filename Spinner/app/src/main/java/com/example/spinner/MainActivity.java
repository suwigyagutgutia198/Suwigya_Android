package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;

    String data[]={"Ram","Shyam","Mohan","Arvind"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,R.layout.list,data);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //TextView txt=((TextView)view);
                //Toast.makeText(MainActivity.this, txt.getText().toString(), Toast.LENGTH_SHORT).show();
                switch(position)
                {
                    case 0:
                        Toast.makeText(MainActivity.this, "First" ,Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Second", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Third", Toast.LENGTH_SHORT).show();
                       break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Fourth", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
    }
}
