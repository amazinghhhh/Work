package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.IOException;

public class OkhttpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp);
    }
    public void onClick2(View view) {
        switch (view.getId()){
            case R.id.dzz_content:
                showcontent();
                break;
        }
    }

    private void showcontent() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Connection connection=Jsoup.connect("https://www.yznna.com/files/article/html/1/1118/570982.html");
                try {
                    Document document= (Document) connection.get();


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
