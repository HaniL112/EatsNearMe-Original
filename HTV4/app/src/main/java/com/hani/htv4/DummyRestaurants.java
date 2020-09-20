package com.hani.htv4;

import java.util.ArrayList;
import java.util.List;

public class DummyRestaurants {

    public static List<Restaurant> getUWRestaurants() {
        List<Restaurant> mRestaurants = new ArrayList<>();
        mRestaurants.add(new Restaurant("Lazeez", "Shawarma", "$$", "4.9/5.0", R.drawable.picture1_lazeez));
        mRestaurants.add(new Restaurant("McDonald's", "Fast Food | Burgers", "$", "4.0/5.0", R.drawable.picture2_mcdonalds));
        mRestaurants.add(new Restaurant("Eastside Mario's", "Italian Food | Pasta | Pizza", "$$$", "4.2/5.0", R.drawable.picture3_eastsidemario));
        mRestaurants.add(new Restaurant("Starbucks", "Coffee Shop | Baked Goods", "$$", "3.9/5.0", R.drawable.picture4_starbuck));
        mRestaurants.add(new Restaurant("Swiss Chalet", "Rotisserie Chicken | Ribs | Family Restaurant", "$$", "3.2/5.0", R.drawable.picture5_swisschalet));
        mRestaurants.add(new Restaurant("Jimmy The Greek", "Greek Food", "$$", "4.1/5.0", R.drawable.picture6_jimmythegreek));
        mRestaurants.add(new Restaurant("Sunset Grill", "All Day Breakfast", "$$", "4.7/5.0", R.drawable.picture7_sunsetgrill));
        mRestaurants.add(new Restaurant("Chatime", "Bubble Tea", "$$", "4.3/5.0", R.drawable.picture8_chatim));
        mRestaurants.add(new Restaurant("Gino’s Pizza", "Pizza | Wings", "$", "4.2/5.0", R.drawable.picture9_ginospizza));
        mRestaurants.add(new Restaurant("KFC", "Fried Chicken | Fast Food", "$", "3.2/5.0", R.drawable.picture10_kf));
        mRestaurants.add(new Restaurant("Subway", "Sandwich | Fast Food", "$", "3.6/5.0", R.drawable.picture11_subwa));
        mRestaurants.add(new Restaurant("Osmows", "Shawarma", "$$", "4.9/5.0", R.drawable.picture12_osmow));
        mRestaurants.add(new Restaurant("DOShack", "White food", "$$$", "2.9/5.0", R.drawable.picture13_doshac));
        mRestaurants.add(new Restaurant("Popeyes", "Chicken | Southern | American", "$", "5.0/5.0", R.drawable.picture14_popeyes));
        mRestaurants.add(new Restaurant("A&W", "Burgers | American | Fast Food", "$", "4.5/5.0", R.drawable.picture15_aw));
        mRestaurants.add(new Restaurant("The Poke Box", "Sushi | Hawaiian | Healthy", "$$$", "4.8/5.0", R.drawable.picture16_poke));
        mRestaurants.add(new Restaurant("Burger King", "Burgers | Fast Food", "$", "4.0/5.0", R.drawable.picture17_burgerking));
        mRestaurants.add(new Restaurant("Thai Express", "Thai | Healthy", "$$", "4.1/5.0", R.drawable.picture18_thaiexpress));
        mRestaurants.add(new Restaurant("Harveys", "Burgers | Canadian | Fast Food", "$$", "4.9/5.0", R.drawable.picture19_harv));
        mRestaurants.add(new Restaurant("Nathan’s Wild Wings", "Chicken | Healthy", "$", "5.0/5.0", R.drawable.picture20_wildwings));
        mRestaurants.add(new Restaurant("Nuri Village", "Korean | Asian", "$$", "4.3/5.0", R.drawable.picture21_nurivillage));
        mRestaurants.add(new Restaurant("Mongolian Grill", "Mongolian | Grill", "$$", "4.0/5.0", R.drawable.picture22_mongoliangrill));
        mRestaurants.add(new Restaurant("Arhum’s Curry", "Curry | Indian", "$$", "0.1/5.0", R.drawable.picture23_chickencurry));
        mRestaurants.add(new Restaurant("Seoul Seoul", "Korean | Asian", "$$", "2.9/5.0", R.drawable.picture24_seoulseoul));
        mRestaurants.add(new Restaurant("Raphael’s Kimchi", "Korean | Blessed", "$$$", "4.1/5.0", R.drawable.picture25_kimchi));

        List<Promotion> mcdonalds_promotion = new ArrayList<>();
        mcdonalds_promotion.add(new Promotion("BigMac Promotion", "$2 off BigMac!", "$8.99 - ($2.00) = $6.99", R.drawable.picture1_bigmac));
        mcdonalds_promotion.add(new Promotion("DoubleDouble", "Buy one get one coffee free!", "$3.98 - ($1.99) = $1.99", R.drawable.picture2_coffee));
        mcdonalds_promotion.add(new Promotion("Junior Chicken", "Buy one get one free!", "$3.99 - ($2.00) = $1.99", R.drawable.picture3_jrchicken));
        mcdonalds_promotion.add(new Promotion("Quarter Pounder Deal", "Buy 4 get 1 free!", "$39.95 - ($7.99) = $31.96", R.drawable.picture4_quarterpounder));
        mcdonalds_promotion.add(new Promotion("BigMac Deal", "50% off BigMac Combo!", "$6.99 - ($3.49) = $3.49", R.drawable.picture5_bigmac));
        mcdonalds_promotion.add(new Promotion("Double Cheeseburger Special", "$1 Double Cheeseburger", "$1.69 - ($0.70) = $0.99", R.drawable.picture6_dcheeseburger));
        mcdonalds_promotion.add(new Promotion("CheeseBurger Deal", "50% off cheeseburger!", "$4.00 - ($2.00) = $2.00", R.drawable.picture7_cheeseburger));
        mcdonalds_promotion.add(new Promotion("Free French Fries", "Buy BigMac for free fries", "$6.00 - ($2.01) = $3.99", R.drawable.picture8_fries));
        mcdonalds_promotion.add(new Promotion("McNuggets Promotion", "$2 10pcs McNuggets", "$4.49 - ($2.50) = $1.99", R.drawable.picture9_mcnuggets));
        mcdonalds_promotion.add(new Promotion("Free Icecream", "Buy fries for free ice cream!", "$5.49 - ($1.20) = $4.29", R.drawable.picture10_icecream));
        mcdonalds_promotion.add(new Promotion("Egg McMuffin Promotion", "Buy one get one free Egg McMuffin", "$7.98 - ($3.99) = $3.99", R.drawable.picture11_egg));
        mcdonalds_promotion.add(new Promotion("PanCakes", "50% off Pancakes!", "$3.99 - ($1.99) = $2.00", R.drawable.picture12_pancakes));
        mcdonalds_promotion.add(new Promotion("McDouble", "50% off Mcdouble!", "$6.99 - ($3.49) = $3.49", R.drawable.picture13_mcdouble));
        mcdonalds_promotion.add(new Promotion("Free McFlurry", "Buy BigMac for free Mcflurry!", "$6.38 - ($2.39) = $3.99", R.drawable.picture14_mcflurry));
        mcdonalds_promotion.add(new Promotion("Free Kid’s Meal", "Buy reg meal for free kids meal!", "$20.99 - ($8.99) = $13.00", R.drawable.picture15_kidsmeal));
        mRestaurants.get(1).setPromotions(mcdonalds_promotion);

        List<Promotion> default_promotion = new ArrayList<>();
        default_promotion.add(new Promotion("Promotion 1", "Description", "Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 2", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 3", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 4", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 5", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 6", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 7", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 8", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 9", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 10", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 11", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 12", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 13", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 14", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 15", "Description", "$Price", R.drawable.htv4black));

        for (int i=0; i < 25; i++) {
            if (i != 1) mRestaurants.get(i).setPromotions(default_promotion);
        }

        return mRestaurants;
    }

    public static List<Restaurant> getUTSCPlaza() {
        List<Restaurant> mRestaurants = new ArrayList<>();
        mRestaurants.add(new Restaurant("Shamrock Burgers", "Burgers | Fries", "$$", "4.2/5.0", R.drawable.picture1_sham));
        mRestaurants.add(new Restaurant("Nasir’s Hot Dogs", "Hot Dog Stand", "$", "5.0/5.0", R.drawable.picture2_nas));
        mRestaurants.add(new Restaurant("Food Kulture Bistro", "Jamaican | Chicken", "$", "4.2/5.0", R.drawable.picture3_food));
        mRestaurants.add(new Restaurant("Highland Fish and Chips", "Fish and Chips | Local Restaurant", "$$", "4.0/5.0", R.drawable.picture4_highland));
        mRestaurants.add(new Restaurant("Fratelli village pizzeria", "Wood fired pizza | pasta", "$$", "2.5/5.0", R.drawable.picture5_frat));

        List<Promotion> default_promotion = new ArrayList<>();
        default_promotion.add(new Promotion("Promotion 1", "Description", "Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 2", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 3", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 4", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 5", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 6", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 7", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 8", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 9", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 10", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 11", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 12", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 13", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 14", "Description", "$Price", R.drawable.htv4black));
        default_promotion.add(new Promotion("Promotion 15", "Description", "$Price", R.drawable.htv4black));

        for (int i=0; i < mRestaurants.size(); i++) {
            mRestaurants.get(i).setPromotions(default_promotion);
        }

        return mRestaurants;
    }

}
