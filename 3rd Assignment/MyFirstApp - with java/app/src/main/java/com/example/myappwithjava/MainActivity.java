package com.example.myappwithjava;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button6);
        button2 = (Button) findViewById(R.id.button5);
        button3 = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResume();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInvest();
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             openAbout();
             }
        });
    }

    public void openResume() {
        Intent intent = new Intent(this, Resume.class);
        startActivity(intent);
    }

    public void openAbout() {
        Intent intent = new Intent(this, AboutMe.class);
        startActivity(intent);
    }

    public void openInvest() {
        Intent intent = new Intent(this, InvestmentPortfolio.class);
        startActivity(intent);
    }
}