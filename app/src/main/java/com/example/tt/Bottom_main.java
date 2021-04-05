package com.example.tt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tt.fragments.Faculty;
import com.example.tt.fragments.Syllabus;
import com.example.tt.fragments.TimeTable;
import com.example.tt.fragments.holiday;
import com.example.tt.fragments.notes;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom_main extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_main);

        loadFragment(new notes());

        BottomNavigationView navigation = findViewById(R.id.bottomNavView);
        navigation.setOnNavigationItemSelectedListener(this);
    }


    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.Notes:
                fragment = new notes();
                break;

            case R.id.Holiday:
                fragment = new holiday();
                break;

            case R.id.Faculty:
                fragment = new Faculty();
                break;

            case R.id.Syllabus:
                fragment = new Syllabus();
                break;
            case R.id.Time_Table:
                fragment = new TimeTable();
                break;
        }

        return loadFragment(fragment);
    }
}