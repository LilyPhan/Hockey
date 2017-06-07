package com.example.a17phanli.hockeyscorez;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import static android.widget.ArrayAdapter.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner leagueSpinner = (Spinner) findViewById(R.id.Leagues_spinner);
        Spinner teamSpinner = (Spinner) findViewById(R.id.Teams_spinner);
        Spinner teamSpinner2 = (Spinner) (leagueSpinner.getSelectedItem());
        //Spinner teamSpinner2 = (Spinner) findViewById(R.id.Teams1_spinner);


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}
