package com.hani.htv4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurant {

    private UUID mId;

    private String mName; // name of the restaurant
    private String mDescription;
    private String mPriceRange; // $$$
    private String mRating;

    private String mAddress;

    private int mDrawableRes;

    private List<Promotion> mPromotions = new ArrayList<>();

    public Restaurant(String name) {
        mId = UUID.randomUUID();
        mName = name;
    }

    public Restaurant(String name, String description, String priceRange, String rating) {
        mId = UUID.randomUUID();
        mName = name;
        mDescription = description;
        mPriceRange = priceRange;
        mRating = rating;
    }

    public Restaurant(String name, String description, String priceRange, String rating, int drawableRes) {
        mId = UUID.randomUUID();
        mName = name;
        mDescription = description;
        mPriceRange = priceRange;
        mRating = rating;
        mDrawableRes = drawableRes;
    }

    public UUID getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getPriceRange() {
        return mPriceRange;
    }

    public void setPriceRange(String priceRange) {
        mPriceRange = priceRange;
    }

    public String getRating() {
        return mRating;
    }

    public void setRating(String rating) {
        mRating = rating;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public int getDrawableRes() {
        return mDrawableRes;
    }

    public void setDrawableRes(int drawable) {
        mDrawableRes = drawable;
    }

    public List<Promotion> getPromotions() {
        return mPromotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        mPromotions = promotions;
    }
}
