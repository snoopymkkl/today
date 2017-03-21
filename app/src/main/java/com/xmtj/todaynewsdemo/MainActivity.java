package com.xmtj.todaynewsdemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击安装更新包
                TinkerInstaller.onReceiveUpgradePatch
                        (getApplicationContext(),
                                Environment.getExternalStorageDirectory().getAbsolutePath()
                                        + "/patch_signed_7zip.apk");

            }
        });

    }
}
