package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MovieSelectionActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtUserFinalOutput;
    TextInputEditText textInputEditText;
    Button btnSelectmovie;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initViews();
    }

    private void initViews() {
        btnSelectmovie=findViewById(R.id.btnMovieSelect);
        textInputEditText=findViewById(R.id.etUserMovieSelect);
        txtUserFinalOutput=findViewById(R.id.userFinalMovie);

        btnSelectmovie.setOnClickListener(this);

    }

    private String movie() {
        textInputEditText=findViewById(R.id.etUserMovieSelect);
        String userMovieInputString=textInputEditText.getText().toString();
        int userMovieInputInt=Integer.parseInt(userMovieInputString);

        String movieNameReturn;

        switch (userMovieInputInt)
        {
            case 1:
            {
                movieNameReturn="watch 12th fail";
                break;
            }
            case 2:
            {
                movieNameReturn="watch kabir singh";
                break;
            }
            case 3:
            {
                movieNameReturn="watch 3 idiots";
                break;
            }
            case 4 :
            {
                movieNameReturn="watch yeh jawani yeh diwani";
                break;
            }
            default:
            {
                movieNameReturn="Something Error!!!";
            }

        }
        return movieNameReturn;

    }

    @Override
    public void onClick(View v) {

        String a= textInputEditText.getText().toString();

        if (a.isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Select any  movie",Toast.LENGTH_SHORT).show();
        }
        else
        {
            txtUserFinalOutput.setText(movie());
        }
    }
}