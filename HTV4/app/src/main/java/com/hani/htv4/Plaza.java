package com.hani.htv4;

import java.util.List;

public class Plaza {

    private String mName;
    private double mLongitude;
    private double mLatitude;

    private List<Restaurant> mRestaurants;

    public Plaza(String name, double longitude, double latitude) {
        mName = name;
        mLongitude = longitude;
        mLatitude = latitude;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double longitude) {
        mLongitude = longitude;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double latitude) {
        mLatitude = latitude;
    }

    public List<Restaurant> getRestaurants() {
        return mRestaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        mRestaurants = restaurants;
    }
}
