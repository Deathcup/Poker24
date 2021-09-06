package com.example.poker24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ResultActivity extends AppCompatActivity {
    int a,b,c,d;
    int ka,kb,kc,kd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        a = getIntent().getExtras().getInt("a");
        b = getIntent().getExtras().getInt("b");
        c = getIntent().getExtras().getInt("c");
        d = getIntent().getExtras().getInt("d");
        ka = getIntent().getExtras().getInt("ka");
        kb = getIntent().getExtras().getInt("kb");
        kc = getIntent().getExtras().getInt("kc");
        kd = getIntent().getExtras().getInt("kd");

        ImageView image1 = (ImageView)findViewById(R.id.imageView2);
        ImageView image2 = (ImageView)findViewById(R.id.imageView3);
        ImageView image3 = (ImageView)findViewById(R.id.imageView4);
        ImageView image4 = (ImageView)findViewById(R.id.imageView5);

        if(ka==1){
            String name = "ht"+a;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image1.setImageResource(resId);
        }
        else if(ka==2){
            String name = "hx"+a;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image1.setImageResource(resId);
        }
        else if(ka==3){
            String name = "mh"+a;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image1.setImageResource(resId);
        }
        else if(ka==4){
            String name = "fp"+a;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image1.setImageResource(resId);
        }

        if(kb==1){
            String name = "ht"+b;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image2.setImageResource(resId);
        }
        else if(kb==2){
            String name = "hx"+b;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image2.setImageResource(resId);
        }
        else if(kb==3){
            String name = "mh"+b;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image2.setImageResource(resId);
        }
        else if(kb==4){
            String name = "fp"+b;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image2.setImageResource(resId);
        }

        if(kc==1){
            String name = "ht"+c;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image3.setImageResource(resId);
        }
        else if(kc==2){
            String name = "hx"+c;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image3.setImageResource(resId);
        }
        else if(kc==3){
            String name = "mh"+c;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image3.setImageResource(resId);
        }
        else if(kc==4){
            String name = "fp"+c;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image3.setImageResource(resId);
        }

        if(kd==1){
            String name = "ht"+d;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image4.setImageResource(resId);
        }
        else if(kd==2){
            String name = "hx"+d;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image4.setImageResource(resId);
        }
        else if(kd==3){
            String name = "mh"+d;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image4.setImageResource(resId);
        }
        else if(kd==4){
            String name = "fp"+d;
            int resId = getResources().getIdentifier(name, "drawable", getPackageName());
            image4.setImageResource(resId);
        }

        String text = Integer.toString(a)+"  "+Integer.toString(b)+"  "+Integer.toString(c)+"  "+Integer.toString(d);
        TextView textView = (TextView)findViewById(R.id.textView4);
        TextView textView2 = (TextView)findViewById(R.id.textView5);
        textView.setText(text);
        //String str[]={};

        List<String> str = getResultList(a,b,c,d);

        if(str.size()==0){
            textView2.setText("没有答案");
        }
        else{
            ArrayAdapter<String> adapter=new ArrayAdapter<String>
                    (this,android.R.layout.simple_list_item_1,str);
            ListView listView=(ListView)findViewById(R.id.list);
            listView .setAdapter(adapter);
        }

        Button btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this,MainActivity.class));
            }
        });
    }
    public static List<String> getResultList(int a,int b,int c,int d){
        List<String> _List = new ArrayList<String>();
        int op1,op2,op3;
        for(op1=1;op1<=4;op1++)
            for(op2=1;op2<=4;op2++)
                for(op3=1;op3<=4;op3++){
                    if(calculate_model1(a,b,c,d,op1,op2,op3)==24){
                        String s1="(("+a+showFuHao(op1)+b+")"+showFuHao(op2)+c+")"+showFuHao(op3)+d;
                        _List.add(s1);
                    }
                    if(calculate_model2(a,b,c,d,op1,op2,op3)==24){
                        String s2="("+a+showFuHao(op1)+"("+b+showFuHao(op2)+c+")"+")"+showFuHao(op3)+d;
                        _List.add(s2);
                    }
                    if(calculate_model3(a,b,c,d,op1,op2,op3)==24){
                        String s3 = a+showFuHao(op1)+"("+b+showFuHao(op2)+"("+c+showFuHao(op3)+d+"))";
                        _List.add(s3);
                    }
                    if(calculate_model4(a,b,c,d,op1,op2,op3)==24){
                        String s4 = a+showFuHao(op1)+"(("+b+showFuHao(op2)+c+")"+showFuHao(op3)+d+")";
                        _List.add(s4);
                    }
                    if(calculate_model5(a,b,c,d,op1,op2,op3)==24){
                        String s5 = "("+a+showFuHao(op1)+b+")"+showFuHao(op2)+"("+c+showFuHao(op3)+d+")";
                        _List.add(s5);
                    }
                }

        return _List;
    }

    private static String showFuHao(int op){
        switch(op){
            case 1:return "+";
            case 2:return "-";
            case 3:return "*";
            case 4:return "/";
        }
        return "";
    }

    private static float calculate_model1(float i,float j,float k,
                                          float t,int op1,int op2,int op3){

        float r1,r2,r3;                                           /*对应表达式类型：((A□B)□C)□D*/
        r1 = cal(i,j,op1);
        r2 = cal(r1,k,op2);
        r3 = cal(r2,t,op3);
        return r3;
    }

    private static float calculate_model2(float i,float j,float k,
                                          float t,int op1,int op2,int op3){
        float r1,r2,r3;                                         /*对应表达式类型：(A□(B□C))□D */
        r1 = cal(j,k,op2);
        r2 = cal(i,r1,op1);
        r3 = cal(r2,t,op3);
        return r3;
    }

    private static float calculate_model3(float i,float j,float k,
                                          float t,int op1,int op2,int op3){
        float r1,r2,r3;                                     /*对应表达式类型：A□(B□(C□D))*/
        r1 = cal(k,t,op3);
        r2 = cal(j,r1,op2);
        r3 = cal(i,r2,op1);
        return r3;
    }

    private static float calculate_model4(float i,float j,float k,
                                          float t,int op1,int op2,int op3){
        float r1,r2,r3;                                         /*对应表达式类型：A□((B□C)□D)*/
        r1 = cal(j,k,op2);
        r2 = cal(r1,t,op3);
        r3 = cal(i,r2,op1);
        return r3;
    }

    private static float calculate_model5(float i,float j,float k,
                                          float t,int op1,int op2,int op3){
        float r1,r2,r3;                                            /*对应表达式类型：(A□B)□(C□D)*/
        r1 = cal(i,j,op1);
        r2 = cal(k,t,op3);
        r3 = cal(r1,r2,op2);
        return r3;
    }

    private static  float cal(float x,float y,int op){             //计算两个操作数
        switch(op){
            case 1:return x+y;
            case 2:return x-y;
            case 3:return x*y;
            case 4:return x/y;
        }
        return 0;
    }

    public static boolean isGet24(int a,int b,int c,int d){                 //判断是否能得到24
        boolean result = false;
        List<String> _list = getResultList(a, b, c, d);
        if(_list.size()>0)
            result = true;
        return result;
    }
}

