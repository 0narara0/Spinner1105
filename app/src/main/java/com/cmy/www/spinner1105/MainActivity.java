package com.cmy.www.spinner1105;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);

        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

        String selected = ((TextView)view).getText().toString(); //item에서 가져온 것
        String text = adapterView.getItemAtPosition(position).toString(); //parent에서 가져온 것

        TextView textView = findViewById(R.id.textView);


        textView.setText(selected);
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

        long item_id = adapterView.getSelectedItemId();

        Bundle bundle = new Bundle();
        bundle.putString("Details",text);
        Intent intent = new Intent(this, Details.class);
        intent.putExtras(bundle);
        startActivity(intent);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
