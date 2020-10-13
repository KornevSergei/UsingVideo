package com.example.usingvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);

        //пишем путь к видеофайлу в приложении + через маке прожект не забыть пересобрать
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demo);

        //делаем контроллер к видео
        MediaController mediaController = new MediaController(this);
        //связываем одно с другим
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        //запускаем
        videoView.start();



    }
}