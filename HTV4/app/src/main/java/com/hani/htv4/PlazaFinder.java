package com.hani.htv4;

import android.location.Location;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import io.radar.sdk.Radar;

public class PlazaFinder {

    private static List<Plaza> plazas = new ArrayList<>();

    static {
        // latitude and then longitude (negative)
        Plaza uwPlaza = new Plaza("UW Plaza", -80.53, 43.47);
        uwPlaza.setRestaurants(DummyRestaurants.getUWRestaurants());
        plazas.add(uwPlaza);

        Plaza utscPlaza = new Plaza("UTSC Plaza",-79.232978 ,43.777366);
        utscPlaza.setRestaurants(DummyRestaurants.getUTSCPlaza());
        plazas.add(utscPlaza);
    }

    public static Plaza findNearestPlaza(Location currentLocation) {

        Location location;
        float distanceTo;

        float min = -1;
        Plaza closestPlaza = null;

        for (Plaza plaza: plazas) {

            location = new Location(plaza.getName());
            location.setLatitude(plaza.getLatitude());
            location.setLongitude(plaza.getLongitude());

            distanceTo = currentLocation.distanceTo(location);
            if (min == -1 || distanceTo < min) {
                closestPlaza = plaza;
                min = distanceTo;
            }

        }

        return closestPlaza;
    }


}
