package com.anningtex.label;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.flexbox.FlexboxLayout;

/**
 * 文字标签显示
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] strings = {"寒食过", "云雨消", "不夜侯正好", "又是一年", "采茶时节暖阳照", "风追着", "蝴蝶跑", "谁家种红苕", "木犁松土", "地龙惊兮蚁出巢", "翠盈盈", "悠香飘", "茶垄漫山绕", "钻进田间", "扯下笠帽 春眠要趁早"};

        FlexboxLayout layout = findViewById(R.id.flexbox);

        for (int i = 0; i < strings.length; i++) {
            TextView textView = new TextView(this);
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(35, 10, 35, 10);

            textView.setText(strings[i]);
            textView.setPadding(10, 10, 10, 10);
            final int finalI = i;
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "点击了" + finalI, Toast.LENGTH_SHORT).show();
                }
            });
            textView.setBackgroundResource(R.drawable.label);
            textView.setLayoutParams(layoutParams);
            layout.addView(textView);
        }
    }
}
