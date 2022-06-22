package com.example.demohealthapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;
import com.example.demohealthapp.databinding.ActivityQuestionsBinding;
import com.google.android.material.button.MaterialButton;


public class QuestionsActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityQuestionsBinding binding;

    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;
    private RadioGroup radioGroup6;
    private RadioGroup radioGroup7;
    private RadioGroup radioGroup8;
    private RadioGroup radioGroup9;
    private RadioGroup radioGroup10;
    private RadioGroup radioGroup11;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        //initiates each of the 7 radio groups
        MaterialButton evalsubmitbtn = (MaterialButton) findViewById(R.id.evalsubmitbtn);
        radioGroup1 = (RadioGroup) findViewById(R.id.radio_group1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radio_group2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radio_group3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radio_group4);
        radioGroup5 = (RadioGroup) findViewById(R.id.radio_group5);
        radioGroup6 = (RadioGroup) findViewById(R.id.radio_group6);
        radioGroup7 = (RadioGroup) findViewById(R.id.radio_group7);
        radioGroup8 = (RadioGroup) findViewById(R.id.radio_group8);
        radioGroup9 = (RadioGroup) findViewById(R.id.radio_group9);
        radioGroup10 = (RadioGroup) findViewById(R.id.radio_group10);
        radioGroup11 = (RadioGroup) findViewById(R.id.radio_group11);

        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();
        radioGroup7.clearCheck();
        radioGroup8.clearCheck();
        radioGroup9.clearCheck();
        radioGroup10.clearCheck();
        radioGroup11.clearCheck();

        evalsubmitbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Healthy
                if ((radioGroup1.getCheckedRadioButtonId() == findViewById(R.id.none_cough).getId()) && (radioGroup2.getCheckedRadioButtonId() == findViewById(R.id.no_fever).getId()) && (radioGroup3.getCheckedRadioButtonId() == findViewById(R.id.no_aches).getId()) && (radioGroup4.getCheckedRadioButtonId() == findViewById(R.id.no_tiredness).getId()) && (radioGroup5.getCheckedRadioButtonId() == findViewById(R.id.no_irritated).getId()) && (radioGroup6.getCheckedRadioButtonId() == findViewById(R.id.no_congestion).getId()) && (radioGroup7.getCheckedRadioButtonId() == findViewById(R.id.no_Nausea).getId()) && (radioGroup8.getCheckedRadioButtonId() == findViewById(R.id.no_hr).getId()) && (radioGroup9.getCheckedRadioButtonId() == findViewById(R.id.yes_sorethroat).getId())&& (radioGroup10.getCheckedRadioButtonId() == findViewById(R.id.no_sorethroat).getId())&& (radioGroup11.getCheckedRadioButtonId() == findViewById(R.id.no_headache).getId())) {
                    Toast.makeText(QuestionsActivity.this,
                            "You are healthy", Toast.LENGTH_LONG).show();
                //Flu
                } else if ((radioGroup1.getCheckedRadioButtonId() == findViewById(R.id.moderate_cough).getId()) && (radioGroup2.getCheckedRadioButtonId() == findViewById(R.id.yes_fever).getId()) && (radioGroup3.getCheckedRadioButtonId() == findViewById(R.id.mild_aches).getId()) && (radioGroup4.getCheckedRadioButtonId() == findViewById(R.id.yes_tiredness).getId()) && (radioGroup5.getCheckedRadioButtonId() == findViewById(R.id.no_irritated).getId()) && (radioGroup6.getCheckedRadioButtonId() == findViewById(R.id.slight_congestion).getId()) && (radioGroup7.getCheckedRadioButtonId() == findViewById(R.id.no_Nausea).getId()) && (radioGroup8.getCheckedRadioButtonId() == findViewById(R.id.yes_hr).getId()) && (radioGroup9.getCheckedRadioButtonId() == findViewById(R.id.yes_chills).getId())&& (radioGroup10.getCheckedRadioButtonId() == findViewById(R.id.yes_sorethroat).getId())&& (radioGroup11.getCheckedRadioButtonId() == findViewById(R.id.yes_headache).getId())) {
                    Toast.makeText(QuestionsActivity.this,
                            "You may have the flu.", Toast.LENGTH_LONG).show();
                //Cold
                } else if ((radioGroup1.getCheckedRadioButtonId() == findViewById(R.id.mild_cough).getId()) && (radioGroup2.getCheckedRadioButtonId() == findViewById(R.id.no_fever).getId()) && (radioGroup3.getCheckedRadioButtonId() == findViewById(R.id.mild_aches).getId()) && (radioGroup4.getCheckedRadioButtonId() == findViewById(R.id.yes_tiredness).getId()) && (radioGroup5.getCheckedRadioButtonId() == findViewById(R.id.no_irritated).getId()) && (radioGroup6.getCheckedRadioButtonId() == findViewById(R.id.significant_congestion).getId()) && (radioGroup7.getCheckedRadioButtonId() == findViewById(R.id.no_Nausea).getId()) && (radioGroup8.getCheckedRadioButtonId() == findViewById(R.id.yes_hr).getId()) && (radioGroup9.getCheckedRadioButtonId() == findViewById(R.id.no_chills).getId())&& (radioGroup10.getCheckedRadioButtonId() == findViewById(R.id.yes_sorethroat).getId())&& (radioGroup11.getCheckedRadioButtonId() == findViewById(R.id.no_headache).getId())) {
                    Toast.makeText(QuestionsActivity.this,
                            "You may have the cold.", Toast.LENGTH_LONG).show();
                //Allergies
                } else if ((radioGroup1.getCheckedRadioButtonId() == findViewById(R.id.none_cough).getId()) && (radioGroup2.getCheckedRadioButtonId() == findViewById(R.id.no_fever).getId()) && (radioGroup3.getCheckedRadioButtonId() == findViewById(R.id.no_aches).getId()) && (radioGroup4.getCheckedRadioButtonId() == findViewById(R.id.no_tiredness).getId()) && (radioGroup5.getCheckedRadioButtonId() == findViewById(R.id.yes_irritated).getId()) && (radioGroup6.getCheckedRadioButtonId() == findViewById(R.id.slight_congestion).getId()) && (radioGroup7.getCheckedRadioButtonId() == findViewById(R.id.no_Nausea).getId()) && (radioGroup8.getCheckedRadioButtonId() == findViewById(R.id.no_hr).getId()) && (radioGroup9.getCheckedRadioButtonId() == findViewById(R.id.no_chills).getId())&& (radioGroup10.getCheckedRadioButtonId() == findViewById(R.id.no_sorethroat).getId())&& (radioGroup11.getCheckedRadioButtonId() == findViewById(R.id.no_headache).getId())) {
                    Toast.makeText(QuestionsActivity.this,
                            "You may have seasonal allergies.", Toast.LENGTH_LONG).show();
                //Seek immediate medical attention
                } else if ((radioGroup1.getCheckedRadioButtonId() == findViewById(R.id.severe_cough).getId()) && (radioGroup2.getCheckedRadioButtonId() == findViewById(R.id.yes_fever).getId()) && (radioGroup3.getCheckedRadioButtonId() == findViewById(R.id.severe_aches).getId()) && (radioGroup4.getCheckedRadioButtonId() == findViewById(R.id.yes_tiredness).getId()) && (radioGroup5.getCheckedRadioButtonId() == findViewById(R.id.yes_irritated).getId()) && (radioGroup6.getCheckedRadioButtonId() == findViewById(R.id.significant_congestion).getId()) && (radioGroup7.getCheckedRadioButtonId() == findViewById(R.id.always_Nausea).getId()) && (radioGroup8.getCheckedRadioButtonId() == findViewById(R.id.yes_hr).getId()) && (radioGroup9.getCheckedRadioButtonId() == findViewById(R.id.yes_chills).getId())&& (radioGroup10.getCheckedRadioButtonId() == findViewById(R.id.yes_sorethroat).getId())&& (radioGroup11.getCheckedRadioButtonId() == findViewById(R.id.yes_headache).getId())) {
                    Toast.makeText(QuestionsActivity.this,
                            "You should seek immediate medical attention.", Toast.LENGTH_LONG).show();
                }
                openProfileActivity();

            }

        });

    }

    public void openProfileActivity() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
