package com.example.poker24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;

public class GameActivity extends AppCompatActivity {
    int a=1,b=1,c=1,d=1;
    int ka=1,kb=1,kc=1,kd=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageButton imgbtn1 = (ImageButton)findViewById(R.id.imageButton);
        ImageButton imgbtn2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton imgbtn3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton imgbtn4 = (ImageButton)findViewById(R.id.imageButton4);
        Button btn = (Button)findViewById(R.id.button3);

        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(GameActivity.this,ChooseActivity.class),1);
            }
        });
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(GameActivity.this,ChooseActivity.class),2);
            }
        });
        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(GameActivity.this,ChooseActivity.class),3);
            }
        });
        imgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(GameActivity.this,ChooseActivity.class),4);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameActivity.this,ResultActivity.class);
                intent.putExtra("a",a);
                intent.putExtra("b",b);
                intent.putExtra("c",c);
                intent.putExtra("d",d);
                intent.putExtra("ka",ka);
                intent.putExtra("kb",kb);
                intent.putExtra("kc",kc);
                intent.putExtra("kd",kd);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(resultCode==RESULT_OK){
            if(requestCode==1){
                int kind = data.getExtras().getInt("kind");
                int num = data.getExtras().getInt("num");
                a = num;
                ka = kind;
                String name = "";
                if(kind==1) name = name+"ht";
                else if(kind==2) name = name+"hx";
                else if(kind==3) name = name+"mh";
                else if(kind==4) name = name+"fp";
                name = name+num;
                ImageButton imgbtn1 = (ImageButton)findViewById(R.id.imageButton);
                int resId = getResources().getIdentifier(name, "drawable", getPackageName());
                imgbtn1.setImageResource(resId);
                //Log.e("name",Integer.toString(resId));
            }
            else if(requestCode==2){
                int kind = data.getExtras().getInt("kind");
                int num = data.getExtras().getInt("num");
                b = num;
                kb = kind;
                String name = "";
                if(kind==1) name = name+"ht";
                else if(kind==2) name = name+"hx";
                else if(kind==3) name = name+"mh";
                else if(kind==4) name = name+"fp";
                name = name+num;
                ImageButton imgbtn2 = (ImageButton)findViewById(R.id.imageButton2);
                int resId = getResources().getIdentifier(name, "drawable", getPackageName());
                imgbtn2.setImageResource(resId);
                Log.e("name",Integer.toString(resId));
            }
            else if(requestCode==3){
                int kind = data.getExtras().getInt("kind");
                int num = data.getExtras().getInt("num");
                c = num;
                kc = kind;
                String name = "";
                if(kind==1) name = name+"ht";
                else if(kind==2) name = name+"hx";
                else if(kind==3) name = name+"mh";
                else if(kind==4) name = name+"fp";
                name = name+num;
                ImageButton imgbtn3 = (ImageButton)findViewById(R.id.imageButton3);
                int resId = getResources().getIdentifier(name, "drawable", getPackageName());
                imgbtn3.setImageResource(resId);
            }
            else if(requestCode==4){
                int kind = data.getExtras().getInt("kind");
                int num = data.getExtras().getInt("num");
                d = num;
                kd = kind;
                String name = "";
                if(kind==1) name = name+"ht";
                else if(kind==2) name = name+"hx";
                else if(kind==3) name = name+"mh";
                else if(kind==4) name = name+"fp";
                name = name+num;
                ImageButton imgbtn4 = (ImageButton)findViewById(R.id.imageButton4);
                int resId = getResources().getIdentifier(name, "drawable", getPackageName());
                imgbtn4.setImageResource(resId);
            }
        }

    }
}