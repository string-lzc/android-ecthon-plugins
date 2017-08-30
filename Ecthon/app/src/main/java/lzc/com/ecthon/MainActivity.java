package lzc.com.ecthon;

import android.graphics.Color;
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

    }
}
