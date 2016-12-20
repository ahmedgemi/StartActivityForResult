package com.example.ahmed.startactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View v){

        Intent intent = new Intent(this,Main2Activity.class);

        startActivityForResult(intent,5);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode ==5){

            String str = data.getStringExtra("name");


            Toast.makeText(MainActivity.this,str ,Toast.LENGTH_SHORT).show();
        }

    }

}
