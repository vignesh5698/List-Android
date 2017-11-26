package com.example.root.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Details> obj=new ArrayList<Details>();
    ArrayAdapter<Details> adapter=null;
    EditText name,addr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.btn1);
        Button b1=(Button)findViewById(R.id.bt2);
        name=(EditText)findViewById(R.id.name);
        addr=(EditText)findViewById(R.id.addr);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Details d=new Details();
                d.setName(name.getText().toString());
                d.setAddress(addr.getText().toString());
                RadioGroup rg=(RadioGroup)findViewById(R.id.rg);
                switch (rg.getCheckedRadioButtonId()){
                    case R.id.be:
                        d.setDegree("B.E");
                        break;
                    case R.id.btech:
                        d.setDegree("B.Tech");
                        break;
                }                adapter.add(d);

            }
        });
        ListView list=(ListView)findViewById(R.id.lv);
        adapter=new ArrayAdapter<Details>(MainActivity.this,android.R.layout.simple_list_item_1,obj);
        list.setAdapter(adapter);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
