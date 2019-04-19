package com.example.rotate4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.rotate4.R;

public class MainActivity extends Activity {

    ImageButton pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        pic =findViewById(R.id.imageButton);
        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pic = findViewById(R.id.imageButton);
                pic.setRotation(pic.getRotation()+90);

            }  });
        pic =findViewById(R.id.imageButton2);
        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pic = findViewById(R.id.imageButton2);
                pic.setRotation(pic.getRotation()+90);

            }  });
        pic =findViewById(R.id.imageButton3);
        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pic = findViewById(R.id.imageButton3);
                pic.setRotation(pic.getRotation()+90);

            }  });

        pic =findViewById(R.id.imageButton4);
        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pic = findViewById(R.id.imageButton4);
                pic.setRotation(pic.getRotation()+90);

            }  });

        pic =findViewById(R.id.imageButton5);
        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pic = findViewById(R.id.imageButton5);
                pic.setRotation(pic.getRotation()+90);

            }  });

    }

}

