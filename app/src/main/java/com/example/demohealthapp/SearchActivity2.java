package com.example.demohealthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SearchActivity2 extends AppCompatActivity {

    ImageView mainImageView;
    TextView illness, description;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);

        mainImageView = findViewById(R.id.mainImageView);
        illness = findViewById(R.id.illness);
        description = findViewById(R.id.description);

        getData();
        setData();
    }


    private void getData(){
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImage", 1);
        }else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        illness.setText(data1);
        description.setText(data2);
        mainImageView.setImageResource(myImage);
    }
}

