package com.example.screenrecorderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this code opens the PWA on Chrome
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://trilogy-group.github.io/ScreenRecorderDemo/index.html"));
            startActivity(browserIntent);
        });
        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        TextView res = (TextView) findViewById(R.id.screenshot_path);
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
        if (appLinkData != null) {
            res.setText(appLinkData.getQueryParameter("folder"));
        }
    }
}