package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button showMoney;
    private TextView moneyText;
    private int mneyCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMoney = findViewById(R.id.button_makeRain);
        moneyText = findViewById(R.id.moneyText);

        showMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

                Log.d("MYMONEY", "onClick: Show Money"+ mneyCounter);
                moneyText.setText(String.valueOf(numberFormat.format(mneyCounter)));

                switch (mneyCounter){
                    case 5:
                        moneyText.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.myColor));
                        break;
                    case 10:
                        moneyText.setTextColor(Color.GREEN);
                        break;
                    case 15:
                        moneyText.setTextColor(Color.YELLOW);
                        break;
                    default:
                        break;
                }


                mneyCounter += 1;
            }
        });
    }
    public void showTag(View v){
        Log.d("MYTAG", "onClick: Show Tag");
        Toast.makeText(getApplicationContext(), R.string.app_name , Toast.LENGTH_LONG).show();
    }
}