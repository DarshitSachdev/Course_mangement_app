package com.example.coursemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.semester_1) {
            Toast.makeText(this,"Semester 1",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getBaseContext(),Semester_1.class);
            startActivity(intent);
        } else if (id == R.id.semester_2) {
            Toast.makeText(this,"Semester 2",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getBaseContext(),Semester_2.class);
            startActivity(intent);
        } else if (id == R.id.semester_3) {
            Toast.makeText(this,"Semester 3",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getBaseContext(),Semester_3.class);
            startActivity(intent);
        } else if (id == R.id.semester_4) {
            Toast.makeText(this,"Semester 4",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getBaseContext(),Semester_4.class);
            startActivity(intent);
        } else if (id == R.id.semester_5) {
            Toast.makeText(this,"Semester 5",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getBaseContext(),Semester_5.class);
            startActivity(intent);
        } else if (id == R.id.semester_6) {
            Toast.makeText(this,"Semester 6",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getBaseContext(),Semester_6.class);
            startActivity(intent);
        } else if (id == R.id.semester_7){
            Toast.makeText(this,"Semester 7",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getBaseContext(),Semester_7.class);
            startActivity(intent);
        } else if (id == R.id.semester_8){
            Toast.makeText(this,"Semester 8",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getBaseContext(),Semester_8.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
