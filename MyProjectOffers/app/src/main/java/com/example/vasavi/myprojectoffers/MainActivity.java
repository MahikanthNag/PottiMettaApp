package com.example.vasavi.myprojectoffers;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private List<Offer> offerList = new ArrayList<>();
    private RecyclerView recyclerView;
    private OffersAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new OffersAdapter(offerList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareOfferData();
    }

    private void prepareOfferData() {
        Offer offer = new Offer("domino s","on purchase 0f Rs 200 and above ","50/- off");
        offerList.add(offer);

        offer = new Offer("domino s", "on purchase of rs 1000 and above ", "50% off");
        offerList.add(offer);

        offer = new Offer("domino s ", "on a minimum purchase of 500 and above", "25% off");
        offerList.add(offer);
        offer = new Offer("k f c ", "on purchase of two meals", "25% off");
        offerList.add(offer);
        offer = new Offer("k f c ", "on a minimum purchase of 1000 and above", "50% off");
        offerList.add(offer);
        offer = new Offer("k f c ", "on a minimum bill 0f 450 and above", "20% off");
        offerList.add(offer);
        mAdapter.notifyDataSetChanged();

    }
}