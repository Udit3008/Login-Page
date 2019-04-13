package com.example.android.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nameEt , mobileEt;
    Button GoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEt=findViewById(R.id.name_id);
        mobileEt=findViewById(R.id.mobile_id);
        GoButton= findViewById(R.id.go_btn);

        GoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= nameEt.getText().toString();
                String mobile= mobileEt.getText().toString();
                Intent intent= new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("N" , name);
                intent.putExtra("M" , mobile);
                startActivity(intent);
            }
        });
    }
}
