package com.inventory.st.stboardinventory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button loginBT = (Button) findViewById(R.id.login);
        loginBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "you clicked me !", Toast.LENGTH_LONG).show();

                // the next GUI
                Intent home = new Intent(getApplication(), Home.class);
                home.putExtra("key", "myvalue");
                startActivity(home);

            }
        });
    }
}
