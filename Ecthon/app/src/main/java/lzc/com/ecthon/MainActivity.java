package lzc.com.ecthon;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lzc.com.actionbar.LightActionBar;
import lzc.com.datehelper.DateHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new LightActionBar(MainActivity.this).builder()
                .setTitle("测试")
                .setBarColor(Color.WHITE,LightActionBar.COLOR_BAR_TEXT_WHITE)
                .build();


        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setView(xxx);
        final Dialog dialog = builder.show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                dialog.dismiss();
            }
        },3000);

    }
}
