package com.example.rabiiae.letsstudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Provelogin extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provelogin);


    button= (Button) findViewById(R.id.Bt);


      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {


              Intent intent= new Intent(Provelogin.this.Kursusoversigt.class);
              startActivity(intent);
              )


          }
      });


    }
}
