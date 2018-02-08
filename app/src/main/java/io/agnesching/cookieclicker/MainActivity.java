package io.agnesching.cookieclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int currentScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgCookie = (ImageView)findViewById(R.id.imgCookie);
        final TextView lblTotal = (TextView) findViewById(R.id.lblTotal);

        imgCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentScore ++;
                lblTotal.setText(String.valueOf(currentScore));

            }
        });
    }
}

