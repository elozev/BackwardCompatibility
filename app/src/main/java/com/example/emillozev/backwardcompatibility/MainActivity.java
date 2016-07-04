package com.example.emillozev.backwardcompatibility;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Welcome, ");
        toolbar.setSubtitle("folks!");

        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String msg = "";


                switch(item.getItemId()){
                    case R.id.delete:
                        msg = "delete";
                        break;
                    case R.id.edit:
                        msg = "edit";
                        break;
                    case R.id.search:
                        msg = "search";
                        break;
                    case R.id.exit:
                        msg = "exit";
                        break;
                    case R.id.settings:
                        msg = "settings";
                        break;
                }

                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                return true;
            }
        });
    }


}
