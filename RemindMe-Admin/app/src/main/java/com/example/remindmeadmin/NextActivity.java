package com.example.remindmeadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class NextActivity extends AppCompatActivity {
    private RecyclerView mrecycleview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        mrecycleview=(RecyclerView) findViewById (R.id.recycle_view);
        new firebasedatabasehelper ().readreq (new firebasedatabasehelper.DataStatus () {
            @Override
            public void Dataisloaded(List<crreq> cr_request, List<String> keys) {
                new  recycleriew ().setConfigure (mrecycleview,NextActivity.this,
                        cr_request,keys);

            }

            @Override
            public void datainserted() {

            }

            @Override
            public void dataupdated() {

            }

            @Override
            public void datadeleted() {

            }
        });
    }
}
