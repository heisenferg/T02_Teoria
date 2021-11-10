package com.example.t02_teoria;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener{
    boolean llamando = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RadioButton
        RadioGroup radio = (RadioGroup) findViewById(R.id.radioGroup);
        radio.setOnCheckedChangeListener(this);

        //CheckBox
        CheckBox check = (CheckBox) findViewById(R.id.checkBoxFutbol);
        check.setOnCheckedChangeListener(this);

        ImageButton botonLlamar = findViewById(R.id.imageButtonCall);
        botonLlamar.setOnClickListener(this::Llamar);

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        TextView text = (TextView) findViewById(R.id.textView);

        switch (checkedId){
            case R.id.rbTalavera: text.setText("Talavera no es buena opción");
            break;
            case R.id.radioButton2: text.setText("Real Madrid es el mejor.");
            break;
            case R.id.radioButton3: text.setText("EL Mónaco apesta");
            break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        TextView t = (TextView) findViewById(R.id.textView);
        if (isChecked){
            t.setText("Te gusta el fútbol");
        } else
        t.setText("No te gusta.");
    }

    public void Llamar(View v) {
        TextView textoCall = (TextView) findViewById(R.id.textViewCall);
        ImageButton botonCAll = (ImageButton) findViewById(R.id.imageButtonCall);
        ImageView walter = (ImageView) findViewById(R.id.imageView);

        if (!llamando){
            textoCall.setText("Llamando a Walter White...");
            botonCAll.setImageResource(R.drawable.llamadasaliente);
            walter.setImageResource(R.drawable.heisenberg);
            llamando=true;
        } else {
            textoCall.setText("Llamada finalizada con Heisenberg.");
            botonCAll.setImageResource(R.drawable.abc_vector_test);
            walter.setImageResource(R.drawable.walter);
            llamando=false;
        }

    }
}