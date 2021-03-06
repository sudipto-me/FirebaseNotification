package com.gnt.fireapp.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_showToken = (Button)findViewById(R.id.btn_show_token);
        btn_showToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get the token
                String token = FirebaseInstanceId.getInstance().getToken();
                Log.d(TAG,"Token:"+token);
                Toast.makeText(MainActivity.this,token,Toast.LENGTH_LONG).show();
            }
        });

    }
}
