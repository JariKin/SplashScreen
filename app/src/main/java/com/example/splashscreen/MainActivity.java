package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button_1;
    private EditText text_1;
    // private boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.text_1 = findViewById(R.id.txtSub);
        this.button_1 = findViewById(R.id.button1);

        this.button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_1.isEnabled()) {
                    text_1.setEnabled(false);
                    // clicked = true;
                } else {
                    text_1.setEnabled(true);
                }
            }
        });
    }

    /* EN SAANUT TOIMIMAAN MITAAN GENERAL RATKAISUA TUOHON USEIDEN YRITYSTEN JALKEEN
    JOTEN TOTEUTIN SEN MANIFESTISSA */
   /* @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putBoolean();
        super.onSaveInstanceState(savedInstanceState);
    }
    */
}
