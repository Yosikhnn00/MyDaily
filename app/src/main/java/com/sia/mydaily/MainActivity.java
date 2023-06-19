package com.sia.mydaily;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonsatu, buttondua, buttontiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonsatu = (Button) findViewById(R.id.buttonsatu);
        buttondua = (Button) findViewById(R.id.buttondua);
        buttontiga = (Button) findViewById(R.id.buttontiga);

        buttonsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActivitysatu = new Intent(getApplicationContext(), DailyActivity.class);
                startActivity(BukaActivitysatu);

            }
        });

        buttondua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              BukaActivitydua();
            }
        });

        buttontiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BukaActivitytiga();
            }
        });
    }

        public void BukaActivitydua(){
            Intent BukaActivitydua = new Intent(getApplicationContext(), TaskActivity.class);
            startActivity(BukaActivitydua);
        }

        public void BukaActivitytiga(){
            Intent BukaActivitytiga = new Intent(getApplicationContext(), ReminderActivity.class);
            startActivity(BukaActivitytiga);
    }
}