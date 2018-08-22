package com.brocodingtuts.a8ball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ballIV;
    private TextView answerTV;
    private String[] answersArray = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes",
                        "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again", "Ask again later",
                        "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it",
                        "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballIV = findViewById(R.id.magic_ball);
        answerTV = findViewById(R.id.answer);

        ballIV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.magic_ball:
                int randomNum = new Random().nextInt(answersArray.length);
                answerTV.setText(answersArray[randomNum]);

                break;
        }
    }
}
