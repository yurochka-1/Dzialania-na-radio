package com.example.dzialanianaradio;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioButton radioDuzy, radioMaly, radioGreen, radioBlue;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        radioDuzy = findViewById(R.id.radioButtonDuzy);
        radioMaly = findViewById(R.id.radioButtonMaly);
        radioGreen = findViewById(R.id.radioButtonZielony);
        radioBlue = findViewById(R.id.radioButtonNiebieski);
        textView = findViewById(R.id.Napis);
        button = findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (radioDuzy.isChecked()){
                            textView.setTextSize(50);
                        }if (radioMaly.isChecked()){
                            textView.setTextSize(10);
                        }if (radioGreen.isChecked()){
                            textView.setTextColor(Color.GREEN);
                        }if (radioBlue.isChecked()){
                            textView.setTextColor(Color.BLUE);
                        }
                    }
                }
        );
    }
}