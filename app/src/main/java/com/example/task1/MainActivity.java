package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAge;
    TextInputEditText userAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews(){
        btnAge=findViewById(R.id.btnAge);
        userAge=findViewById(R.id.etUserAge);

        btnAge.setOnClickListener(this);
    }
    private void returnAge(){
        String userAgeInputString=userAge.getText().toString();
        int userAgeInputInt=Integer.parseInt(userAgeInputString);

        if (checkAge(userAgeInputInt))
        {
            Intent intent=new Intent(MainActivity.this, MovieSelectionActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(),"You are under 18",Toast.LENGTH_SHORT).show();
        }
    }


    private boolean checkAge(int age) {
        return age >= Constants.minimumAge;
    }

    @Override
    public void onClick(View v) {
        if(btnAge == v){
            returnAge();
        }
    }
}