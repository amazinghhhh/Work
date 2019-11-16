package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.ixike:
                intent=new Intent(this,I_DengLuActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_ConstraintLayout:
                intent=new Intent(this,ConstraintLayoutActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_okhttp:
                intent=new Intent(this,OkhttpActivity.class);
                startActivity(intent);
                break;
        }
    }
}
