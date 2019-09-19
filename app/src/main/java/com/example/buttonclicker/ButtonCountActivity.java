package com.example.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ButtonCountActivity extends AppCompatActivity {
   TextView tCounter;
   Button incBtn;
   int counter = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_screen);
        tCounter = findViewById(R.id.display);
        incBtn = findViewById(R.id.btn_press);

        tCounter.setText("Don't Press the Button");

        incBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = counter + 1 ;
                tCounter.setText(String.valueOf(counter));
                if (counter == 1 )  {
                    tCounter.setText("O0Ooo you pressed the Button D;<");

                }
                if (counter == 10 )  {
                    tCounter.setText("Serious...STOP 0:< ");

                }
                if (counter == 15 )  {
                    tCounter.setText("STOP... ):< ");

                }
                if (counter == 20 )  {
                    tCounter.setText("You Makin' Me MAD MAD!!! >;C");

                }



            }
        });
    }
}
