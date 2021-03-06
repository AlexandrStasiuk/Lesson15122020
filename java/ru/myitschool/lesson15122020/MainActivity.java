package ru.myitschool.lesson15122020;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout linearLayout;
    Button btn1, btn2;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linlay);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        linearLayout.setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySetColor();
            }
        });
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn1:
                Toast.makeText(getApplicationContext(),
                        "Была нажата кнопка", Toast.LENGTH_SHORT).show();
                break;
            case R.id.linlay: {
                MySetColor();
                Toast.makeText(getApplicationContext(),
                        "Было нажатие на экран", Toast.LENGTH_SHORT).show();
            }
            break;

        }

    }

    public void MySetColor() {
        switch (count % 3) {
            case 0:
                linearLayout.setBackgroundColor(getColor(R.color.myred));
                break;
            case 1:
                linearLayout.setBackgroundColor(getColor(R.color.myyellow));
                break;
            case 2:
                linearLayout.setBackgroundColor(Color.GREEN);
                break;
        }
        count++;
    }
}