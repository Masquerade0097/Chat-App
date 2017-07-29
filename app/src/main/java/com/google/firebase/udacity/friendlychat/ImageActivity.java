package com.google.firebase.udacity.friendlychat;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();

        setContentView(R.layout.activity_image);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("");


        Uri imageUri = Uri.parse(extras.getString("imageUri"));

        ImageView imageFullScreen = (ImageView) findViewById(R.id.imageFullscreen);

        Glide.with(imageFullScreen.getContext())
                .load(imageUri)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageFullScreen);

    }

}
