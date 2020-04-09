package com.example.zahran.actiontoolbbaebottom;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingBtn;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.tb);
        setSupportActionBar(toolbar);
        floatingBtn=findViewById(R.id.btn_floating);
        floatingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.home) {
            Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show();
           /* Intent intent=new Intent(MainActivity.this,fragment1.class);
            startActivity(intent);*/
        }
        if(id==R.id.close) {
            Toast.makeText(this,"Close",Toast.LENGTH_SHORT).show();
            finish();
        }
        if(id==R.id.search) {
            Toast.makeText(this,"search",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
