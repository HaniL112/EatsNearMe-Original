package com.hani.htv4;

import android.content.Context;
import android.location.Location;

import io.radar.sdk.Radar;
import io.radar.sdk.RadarReceiver;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;

public class MyRadarReceiver extends RadarReceiver {

    @Override
    public void onEventsReceived(Context context, RadarEvent[] events, RadarUser user) {
        // do something with context, events, user

    }

    @Override
    public void onLocationUpdated(Context context, Location location, RadarUser user) {
        // do something with context, location, user
    }

    @Override
    public void onError(Context context, Radar.RadarStatus status) {
        // do something with context, status

    }

}