package com.hani.htv4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RestaurantHelper {

    private static RestaurantHelper sRestaurantHelper;
    private List<Restaurant> mRestaurants;
    private List<Promotion> mPromotions = new ArrayList<>();

    private RestaurantHelper() {

        // mRestaurants = DummyRestaurants.getUWRestaurants();

    }

    public static RestaurantHelper getHelper() {
        if (sRestaurantHelper == null) {
            sRestaurantHelper = new RestaurantHelper();
        }
        return sRestaurantHelper;
    }

    public List<Restaurant> getRestaurants() {
        return mRestaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        mRestaurants = restaurants;
    }

    public Restaurant getRestaurant(UUID id) {

        for (Restaurant restaurant : getRestaurants()) {
            if (restaurant.getId().equals(id)) return restaurant;
        }
        return null; // Restaurant was not found
    }

    public List<Promotion> getPromotions() {
        return mPromotions;
    }
}
