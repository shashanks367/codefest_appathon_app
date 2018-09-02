package com.example.shahsank.health;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class calc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.setText("TOTAL CALORIE CONSUMED IS   "+cchart.sum +"  " +cchart.n1+"  " +cchart.txt1);
    }
}
