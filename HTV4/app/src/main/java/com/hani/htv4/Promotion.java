package com.hani.htv4;

public class Promotion {

    private String mTitle; // Title or name of the promotion
    private String mDescription;
    private String mPrice; // Real price
    private String mPromotionPercentage; // Description of promotion or discount

    private int mDrawableRes;

    public Promotion(String title, String description, String price) {
        mTitle = title;
        mDescription = description;
        mPrice = price;
    }

    public Promotion(String title, String description, String price, int drawableRes) {
        mTitle = title;
        mDescription = description;
        mPrice = price;
        mDrawableRes = drawableRes;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public String getPromotionPercentage() {
        return mPromotionPercentage;
    }

    public void setPromotionPercentage(String promotionPercentage) {
        mPromotionPercentage = promotionPercentage;
    }

    public int getDrawableRes() {
        return mDrawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        mDrawableRes = drawableRes;
    }
}