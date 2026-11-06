package com.dangmod.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.*;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends Activity {

    int bg = Color.rgb(10, 10, 12);
    int red = Color.rgb(235, 25, 45);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(1);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(28, 30, 28, 30);
        layout.setBackgroundColor(bg);

        TextView logo = new TextView(this);
        logo.setText("◈");
        logo.setTextColor(red);
        logo.setTextSize(75);
        logo.setGravity(Gravity.CENTER);

        TextView title = new TextView(this);
        title.setText("DANGMOD");
        title.setTextColor(Color.WHITE);
        title.setTextSize(34);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("CYBER MANAGEMENT TOOL");
        subtitle.setTextColor(red);
        subtitle.setTextSize(13);
        subtitle.setGravity(Gravity.CENTER);

        Button test = new Button(this);
        test.setText("CÔNG CỤ KIỂM THỬ");
        test.setOnClickListener(v ->
            Toast.makeText(this,
                "DANGMOD - Chế độ kiểm thử",
                Toast.LENGTH_SHORT).show()
        );

        Button tiktok = new Button(this);
        tiktok.setText("TIKTOK @thaituquandoi");
        tiktok.setOnClickListener(v -> {
            Intent intent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.tiktok.com/@thaituquandoi")
            );
            startActivity(intent);
        });

        layout.addView(logo);
        layout.addView(title);
        layout.addView(subtitle);

        LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(
                -1, -2);
        params.setMargins(0, 45, 0, 15);

        layout.addView(test, params);
        layout.addView(tiktok);

        setContentView(layout);
    }
}
