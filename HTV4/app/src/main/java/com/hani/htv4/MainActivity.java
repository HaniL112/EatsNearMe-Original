package com.hani.htv4;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.radar.sdk.Radar;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;

public class MainActivity extends AppCompatActivity {

    private final String publishableKey = "prj_test_pk_5ba191db8c35ac2c2a17ab0b3eb3924ca357ed73";
    private final String TEST_USER_ID = "test_user_id";

    private Button mButton1;
    private Button mButton2;
    private TextView mTextView1;
    private Radar r;

    private Location mLocation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Radar.initialize(publishableKey);
        Radar.setUserId(TEST_USER_ID);

        mTextView1 = (TextView) findViewById(R.id.textview1);

        mButton1 = (Button) findViewById(R.id.button1);
        mButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Radar.startTracking();

                Radar.trackOnce(new Radar.RadarCallback() {
                    @Override
                    public void onComplete(Radar.RadarStatus status, Location location, RadarEvent[] events, RadarUser user) {
                        // do something with status, location, events, user
                        if (location != null) {
                            mTextView1.setText(Double.toString(location.getLatitude()) + " "
                                    + Double.toString(location.getLongitude()));
                            mLocation = location;
                        }

                        Radar.stopTracking();


                    }
                });

            }
        });

        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mLocation != null) {
                    Plaza closestPlaza = PlazaFinder.findNearestPlaza(mLocation);
                    RestaurantHelper.getHelper().setRestaurants(closestPlaza.getRestaurants());
                    Intent intent = new Intent(MainActivity.this, RestaurantListActivity.class);
                    startActivity(intent);
                }
            }
        });

    }


}
