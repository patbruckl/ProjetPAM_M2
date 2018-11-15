package com.example.brucklpa.projet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proposer (View view){
        Intent intent = new Intent(this, ChoisirContact.class);
        startActivityForResult(intent,3);
    }

    public void notif (View view){
        Intent intent = new Intent(this, Notifications.class);
        startActivityForResult(intent,3);
    }
}
