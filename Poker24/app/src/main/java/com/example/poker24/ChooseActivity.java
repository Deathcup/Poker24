package com.example.poker24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        ImageButton ht1 = (ImageButton)findViewById(R.id.ht1);
        ImageButton ht2 = (ImageButton)findViewById(R.id.ht2);
        ImageButton ht3 = (ImageButton)findViewById(R.id.ht3);
        ImageButton ht4 = (ImageButton)findViewById(R.id.ht4);
        ImageButton ht5 = (ImageButton)findViewById(R.id.ht5);
        ImageButton ht6 = (ImageButton)findViewById(R.id.ht6);
        ImageButton ht7 = (ImageButton)findViewById(R.id.ht7);
        ImageButton ht8 = (ImageButton)findViewById(R.id.ht8);
        ImageButton ht9 = (ImageButton)findViewById(R.id.ht9);
        ImageButton ht10 = (ImageButton)findViewById(R.id.ht10);
        ImageButton ht11 = (ImageButton)findViewById(R.id.ht11);
        ImageButton ht12 = (ImageButton)findViewById(R.id.ht12);
        ImageButton ht13 = (ImageButton)findViewById(R.id.ht13);

        ImageButton hx1 = (ImageButton)findViewById(R.id.hx1);
        ImageButton hx2 = (ImageButton)findViewById(R.id.hx2);
        ImageButton hx3 = (ImageButton)findViewById(R.id.hx3);
        ImageButton hx4 = (ImageButton)findViewById(R.id.hx4);
        ImageButton hx5 = (ImageButton)findViewById(R.id.hx5);
        ImageButton hx6 = (ImageButton)findViewById(R.id.hx6);
        ImageButton hx7 = (ImageButton)findViewById(R.id.hx7);
        ImageButton hx8 = (ImageButton)findViewById(R.id.hx8);
        ImageButton hx9 = (ImageButton)findViewById(R.id.hx9);
        ImageButton hx10 = (ImageButton)findViewById(R.id.hx10);
        ImageButton hx11 = (ImageButton)findViewById(R.id.hx11);
        ImageButton hx12 = (ImageButton)findViewById(R.id.hx12);
        ImageButton hx13 = (ImageButton)findViewById(R.id.hx13);

        ImageButton mh1 = (ImageButton)findViewById(R.id.mh1);
        ImageButton mh2 = (ImageButton)findViewById(R.id.mh2);
        ImageButton mh3 = (ImageButton)findViewById(R.id.mh3);
        ImageButton mh4 = (ImageButton)findViewById(R.id.mh4);
        ImageButton mh5 = (ImageButton)findViewById(R.id.mh5);
        ImageButton mh6 = (ImageButton)findViewById(R.id.mh6);
        ImageButton mh7 = (ImageButton)findViewById(R.id.mh7);
        ImageButton mh8 = (ImageButton)findViewById(R.id.mh8);
        ImageButton mh9 = (ImageButton)findViewById(R.id.mh9);
        ImageButton mh10 = (ImageButton)findViewById(R.id.mh10);
        ImageButton mh11 = (ImageButton)findViewById(R.id.mh11);
        ImageButton mh12 = (ImageButton)findViewById(R.id.mh12);
        ImageButton mh13 = (ImageButton)findViewById(R.id.mh13);

        ImageButton fp1 = (ImageButton)findViewById(R.id.fp1);
        ImageButton fp2 = (ImageButton)findViewById(R.id.fp2);
        ImageButton fp3 = (ImageButton)findViewById(R.id.fp3);
        ImageButton fp4 = (ImageButton)findViewById(R.id.fp4);
        ImageButton fp5 = (ImageButton)findViewById(R.id.fp5);
        ImageButton fp6 = (ImageButton)findViewById(R.id.fp6);
        ImageButton fp7 = (ImageButton)findViewById(R.id.fp7);
        ImageButton fp8 = (ImageButton)findViewById(R.id.fp8);
        ImageButton fp9 = (ImageButton)findViewById(R.id.fp9);
        ImageButton fp10 = (ImageButton)findViewById(R.id.fp10);
        ImageButton fp11 = (ImageButton)findViewById(R.id.fp11);
        ImageButton fp12 = (ImageButton)findViewById(R.id.fp12);
        ImageButton fp13 = (ImageButton)findViewById(R.id.fp13);

        ht1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,1);
            }
        });
        ht2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,2);
            }
        });
        ht3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,3);
            }
        });
        ht4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,4);
            }
        });
        ht5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,5);
            }
        });
        ht6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,6);
            }
        });
        ht7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,7);
            }
        });
        ht8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,8);
            }
        });
        ht9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,9);
            }
        });
        ht10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,10);
            }
        });
        ht11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,11);
            }
        });
        ht12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,12);
            }
        });
        ht13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(1,13);
            }
        });

        hx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,1);
            }
        });
        hx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,2);
            }
        });
        hx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,3);
            }
        });
        hx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,4);
            }
        });
        hx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,5);
            }
        });
        hx6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,6);
            }
        });
        hx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,7);
            }
        });
        hx8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,8);
            }
        });
        hx9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,9);
            }
        });
        hx10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,10);
            }
        });
        hx11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,11);
            }
        });
        hx12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,12);
            }
        });
        hx13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(2,13);
            }
        });

        mh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,1);
            }
        });
        mh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,2);
            }
        });
        mh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,3);
            }
        });
        mh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,4);
            }
        });
        mh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,5);
            }
        });
        mh6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,6);
            }
        });
        mh7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,7);
            }
        });
        mh8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,8);
            }
        });
        mh9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,9);
            }
        });
        mh10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,10);
            }
        });
        mh11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,11);
            }
        });
        mh12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,12);
            }
        });
        mh13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(3,13);
            }
        });

        fp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,1);
            }
        });
        fp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,2);
            }
        });
        fp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,3);
            }
        });
        fp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,4);
            }
        });
        fp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,5);
            }
        });
        fp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,6);
            }
        });
        fp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,7);
            }
        });
        fp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,8);
            }
        });
        fp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,9);
            }
        });
        fp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,10);
            }
        });
        fp11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,11);
            }
        });
        fp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,12);
            }
        });
        fp13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(4,13);
            }
        });
    }

    private void send(int x,int y){
        Intent intent = new Intent();
        intent.putExtra("kind",x);
        intent.putExtra("num",y);
        setResult(RESULT_OK,intent);
        finish();
    }
}