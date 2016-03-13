package com.homedev.eticket;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends Activity {

    private Toolbar toolbar;

    @Override
    protected void onCreate (Bundle savedInstandState) {
        super.onCreate(savedInstandState);
        setContentView(R.layout.activity_main);

        initToolbar();

    }

    private void initToolbar() {
        toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);
    }
}
