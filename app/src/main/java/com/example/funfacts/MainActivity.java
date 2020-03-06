package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button pressButton;
    TextView funFactText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pressButton = findViewById(R.id.pressButton);
        funFactText = findViewById(R.id.funFactText);

        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomAction();

            }
        });
    }

    public void randomAction(){
        final String[] fatArray = {"dogs are cool",
                "fish can't breathe",
                "i like to play video games",
                "fish are no green",
                "gorillas are epic animals",
                "i am 5,2",
                "the moon is made of cheese",
                "my favorite color is black",
                "sand is yellow",
                "frogs can jump high"};

        Random random = new Random();
        int randomFact = random.nextInt(fatArray.length);
}

}