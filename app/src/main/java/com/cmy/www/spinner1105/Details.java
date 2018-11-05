package com.cmy.www.spinner1105;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    Bundle bundle;
    String Details;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        bundle =  getIntent().getExtras();
        Details = bundle.getString("Details","No Data");
        textView = findViewById(R.id.textView3);
        textView.setText(Details);


    }
}
