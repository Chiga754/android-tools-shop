package com.example.androidtoolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DrillDetailActivity extends AppCompatActivity {

    private ImageView imageViewTool;
    private TextView textViewTitle;
    private TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_detail);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Intent intent = getIntent();

        textViewTitle = findViewById(R.id.textViewToolTitle);
        textViewTitle.setText(intent.getStringExtra("title"));

        textViewDescription = findViewById(R.id.textViewToolDescription);
        textViewDescription.setText(intent.getStringExtra("description"));

        imageViewTool = findViewById(R.id.imageViewTool);
        imageViewTool.setImageResource(intent.getIntExtra("imageId", R.drawable.logo));
    }
}