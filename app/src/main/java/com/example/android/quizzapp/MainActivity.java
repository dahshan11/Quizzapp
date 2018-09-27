package com.example.android.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // this int 'll keep the score , we make it public so we can add score from anywhere


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /* this method will be called when the user press the SUBMIT Button
        it'll calculate the score and send it to the score display message  */
    public void button(View view) {

        int score = 0;


        // this method will get the first Question answer
        EditText firstQanswer = (EditText) findViewById(R.id.first_answer);
        String userAnswer1 = firstQanswer.getText().toString();
        if (userAnswer1.equals("1")) {
            score++;
        }


        // this method will get the second Question answer
        CheckBox secondQanswer1 = (CheckBox) findViewById(R.id.second_q_1);
        boolean userAnswer2_1 = secondQanswer1.isChecked();
        CheckBox secondQanswer2 = (CheckBox) findViewById(R.id.second_q_2);
        boolean userAnswer2_2 = secondQanswer2.isChecked();
        CheckBox secondQanswer3 = (CheckBox) findViewById(R.id.second_q_3);
        boolean userAnswer2_3 = secondQanswer3.isChecked();

        if (userAnswer2_1 && userAnswer2_2 && !userAnswer2_3 ) {
            score++;
        }


        // this method will get the third Question answer
        RadioButton thirdQanswer = (RadioButton) findViewById(R.id.radio_button_1);
        boolean userAnswer3 = thirdQanswer.isChecked();
        if (userAnswer3) {
            score++;
        }


        // this method will get the fourth Question answer
        EditText fourthQanswer = (EditText) findViewById(R.id.fourth_answer);
        String userAnswer4 = fourthQanswer.getText().toString();
        if (userAnswer4.equals("1")) {
            score++;
        }
        Log.v("mainActivity", "Score is " + score);


        displayScore(score);

    }


    /**
     * This method displays the score
     */
    private void displayScore(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_text_view);
        quantityTextView.setText("Score: " + number);
    }

}
