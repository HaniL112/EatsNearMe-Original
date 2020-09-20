package com.hani.htv4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import java.util.UUID;

public class PromotionListActivity extends AppCompatActivity {

    private static final String EXTRA_RESTAURANT_ID = "promotionlistactivity.restaurant_id";

    public static Intent newIntent(Context packageContext, UUID restaurantId) {
        Intent intent = new Intent(packageContext, PromotionListActivity.class);
        intent.putExtra(EXTRA_RESTAURANT_ID, restaurantId);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion_list);

        UUID restaurantId = (UUID) getIntent().getSerializableExtra(EXTRA_RESTAURANT_ID);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = PromotionListFragment.newInstance(restaurantId);
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
