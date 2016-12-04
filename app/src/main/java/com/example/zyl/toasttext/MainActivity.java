package com.example.zyl.toasttext;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button) findViewById(R.id.button);
        btn2= (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "简单的提示信息", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Toast toast=new Toast(MainActivity.this);
                toast.setGravity(Gravity.CENTER,0,0);
                ImageView image=new ImageView(MainActivity.this);
                image.setImageResource(R.mipmap.ic_launcher);
                LinearLayout linear=new LinearLayout(MainActivity.this);
                linear.addView(image);
                TextView text=new TextView(MainActivity.this);
                text.setText("带图片的提示信息");
                text.setTextColor(Color.RED);

                text.setTextSize(30);
                linear.addView(text);
                toast.setView(linear);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
