package cl.desafiolatam.pruebafinal.presentation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import cl.desafiolatam.pruebafinal.R;

public class MainActivity extends AppCompatActivity implements IYouTubeChannelView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
