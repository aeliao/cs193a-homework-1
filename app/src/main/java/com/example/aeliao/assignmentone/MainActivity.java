package com.example.aeliao.assignmentone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import java.util.Random;
import android.graphics.Color;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private boolean isPlaying = false;
    private ImageButton[] patterns = new ImageButton[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButtonClick(View view) {
        Button playButton = (Button)findViewById(R.id.playButton);
        playButton.setText("Watch Carefully!");
        Toast.makeText(this,"I'm an apple!", Toast.LENGTH_SHORT).show();

        // makes buttons accessible
        ImageButton avocado = (ImageButton)findViewById(R.id.avocado);
        ImageButton orange = (ImageButton)findViewById(R.id.orange);
        ImageButton apple = (ImageButton)findViewById(R.id.apple);
        ImageButton blue = (ImageButton)findViewById(R.id.blueberries);

        //create array of fruit/veggie buttons
        ImageButton[] buttons = {avocado,orange,apple,blue};

        //generate pattern
        for(int i = 0; i< patterns.length;i++){
            Random rand = new Random();
            patterns[i] = buttons[rand.nextInt(3)];
        }

        //display pattern
        for(ImageButton b:patterns ){
            Color highlight = new Color();
            b.setBackgroundColor(highlight.rgb(255, 229, 204));
            //wasn't sure how to delay so i use loop haha
            for(int i=0;i<10000;i++){

            }
            b.setBackgroundColor(highlight.WHITE);
        }


        //makes buttons clickable
        avocado.setClickable(true);
        orange.setClickable(true);
        apple.setClickable(true);
        blue.setClickable(true);

        isPlaying = true;



    }

    public void avocadoClick(View view) {
        if(!isPlaying){
            return;
        }

        Toast.makeText(this,"I'm an avocado!", Toast.LENGTH_SHORT).show();
    }

    public void orangeClick(View view) {
        if(!isPlaying){
            return;
        }
        Toast.makeText(this,"I'm an orange!", Toast.LENGTH_SHORT).show();
    }

    public void appleClick(View view) {
        if(!isPlaying){
            return;
        }

        Toast.makeText(this,"I'm an apple!", Toast.LENGTH_SHORT).show();
    }

    public void blueberriesClick(View view) {
        if(!isPlaying){
            return;
        }
        Toast.makeText(this,"This is my blueberry family!", Toast.LENGTH_SHORT).show();
    }
}
