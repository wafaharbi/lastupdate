package com.example.wafa.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class CourseViewIT342 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_view_it342);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        setTitle("           Course View ");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);

    }


    public void filesUploads(View v ){

        Intent i = new Intent(CourseViewIT342.this, ViewUploadsActivity.class);
        startActivity(i);
    }

    public void ViewInfo(View v ){

        Intent i = new Intent(CourseViewIT342.this, CourseStudentIT342.class);
        startActivity(i);
    }
}
