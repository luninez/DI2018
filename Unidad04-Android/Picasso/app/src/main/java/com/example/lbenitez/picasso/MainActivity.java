package com.example.lbenitez.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

  ImageView imagen;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    imagen = findViewById(R.id.img);

    Picasso
      .get()
      .load("https://www.frutadelasarga.com/server/Portal_0008706/img/products/platano-de-canarias_1225267.jpg")
      .into(imagen);


  }
}
