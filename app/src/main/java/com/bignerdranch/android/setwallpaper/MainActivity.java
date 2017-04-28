package com.bignerdranch.android.setwallpaper;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.setwall);
        img = (ImageView) findViewById(R.id.img);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr= WallpaperManager.getInstance(getApplicationContext());
                try
                {

                    wallmgr.setResource(+ R.drawable.wall2);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }

            }
        });
    }
}