package com.example.palm.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView frontText;
    private Button button;
    private boolean caps = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(){
//        boolean caps = true;


        caps = !caps;
        frontText.setAllCaps(caps);

    }
}
