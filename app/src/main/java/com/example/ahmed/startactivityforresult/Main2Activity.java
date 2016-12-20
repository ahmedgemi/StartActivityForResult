package com.example.ahmed.startactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText e1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        e1 = (EditText) findViewById(R.id.editText);
    }

    public void back (View v){


        String str = e1.getText().toString();

        Intent intent = new Intent(this,MainActivity.class);

        intent.putExtra("name",str);

        setResult(4,intent);

        finish();
    }
}
