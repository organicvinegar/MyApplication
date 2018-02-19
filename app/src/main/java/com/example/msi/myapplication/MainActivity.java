package com.example.msi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.button);
        Button bt2 = (Button) findViewById(R.id.button2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(intent, 101);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivityForResult(intent, 102);
            }
        });

        }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 101){
            Toast.makeText(getApplicationContext(),"요청 코드 : "+ requestCode, Toast.LENGTH_LONG).show();
        }
        else if (resultCode == RESULT_OK) {
            String name = data.getStringExtra("name");
            Toast.makeText(getApplicationContext(), "응답 코드 : " + name, Toast.LENGTH_LONG).show();
        }

        /*if (requestCode == 102) {
            Toast.makeText(getApplicationContext(), "요청 코드 : " + requestCode, Toast.LENGTH_LONG).show();
        }
        else if (resultCode == RESULT_OK) {
            String age = data.getStringExtra("age");
            Toast.makeText(getApplicationContext(), "응답 코드 : " + age, Toast.LENGTH_LONG).show();
        }*/
    }
}
