package com.example.t02_teoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radio = (RadioGroup) findViewById(R.id.radioGroup);
        radio.setOnCheckedChangeListener(this);

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        TextView text = findViewById(R.id.textView);

        switch (checkedId){
            case R.id.rbTalavera: text.setText("Talavera no es buena opción");
            break;
            case R.id.radioButton2: text.setText("Real Madrid es el mejor.");
            break;
            case R.id.radioButton3: text.setText("EL Mónaco apesta");
            break;
        }
    }
}