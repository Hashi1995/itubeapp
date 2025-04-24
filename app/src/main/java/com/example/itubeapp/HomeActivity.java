package com.example.itubeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    EditText enterVideoUrl;
    Button btnPlay, btnAddPlaylist, btnViewPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        enterVideoUrl = findViewById(R.id.enterVideoUrl);
        btnPlay = findViewById(R.id.btnPlay);
        btnAddPlaylist = findViewById(R.id.btnAddPlaylist);
        btnViewPlaylist = findViewById(R.id.btnViewPlaylist);

        btnPlay.setOnClickListener(v -> {
            String url = enterVideoUrl.getText().toString();
            Intent intent = new Intent(HomeActivity.this, VideoPlayer.class);
            intent.putExtra("video_url", url);
            startActivity(intent);
        });

        btnAddPlaylist.setOnClickListener(v -> {

        });

        btnViewPlaylist.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, PlayList.class);
            startActivity(intent);
   });
}
}