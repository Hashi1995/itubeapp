package com.example.itubeapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlayList extends AppCompatActivity {

    ListView listView;
    ArrayList<String> playlist;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        listView = findViewById(R.id.playlistListView);

        playlist = new ArrayList<>();
        playlist.add("https://www.youtube.com/watch?v=example1");
        playlist.add("https://www.youtube.com/watch?v=example2");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, playlist);
        listView.setAdapter(adapter);
}
}