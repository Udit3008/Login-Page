package com.example.android.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView nameTv , mobileTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nameTv = findViewById(R.id.display_name);
        mobileTv=findViewById(R.id.display_number);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String name= bundle.getString("N");
        String mobile= bundle.getString("M");
    }
}
