package com.hani.htv4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RestaurantListFragment extends Fragment {

    private RecyclerView mRestaurantRecyclerView;
    private RestaurantAdapter mAdapter;

    public static RestaurantListFragment newInstance() {
        return new RestaurantListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_list, container, false);

        mRestaurantRecyclerView = (RecyclerView) view.findViewById(R.id.restaurant_recycler_view);
        mRestaurantRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        List<Restaurant> restaurants = RestaurantHelper.getHelper().getRestaurants(); // Get list of restaurants
        mAdapter = new RestaurantAdapter(restaurants); // Pass list of restaurants into adapter
        mRestaurantRecyclerView.setAdapter(mAdapter);

        return view;
    }

    private class RestaurantHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private Restaurant mRestaurant;

        // textviews in the holder
        private TextView mNameTextView; // Name of the restaurant
        private ImageView mRestaurantImage; // Image of the restaurant
        private TextView mDescription;
        private TextView mPriceRange;
        private TextView mRating;

        public RestaurantHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_restaurant, parent, false));
            itemView.setOnClickListener(this);

            // Wire up widgets in view
            mNameTextView = (TextView) itemView.findViewById(R.id.restaurant_name);
            mRestaurantImage = (ImageView) itemView.findViewById(R.id.restaurant_image);
            mDescription = (TextView) itemView.findViewById(R.id.restaurant_description);
            mPriceRange = (TextView) itemView.findViewById(R.id.restaurant_price_range);
            mRating = (TextView) itemView.findViewById(R.id.restaurant_rating);
        }

        public void bind(Restaurant restaurant) {
            mRestaurant = restaurant;
            mNameTextView.setText(restaurant.getName());

            mDescription.setText(restaurant.getDescription());
            mPriceRange.setText(restaurant.getPriceRange());
            mRating.setText(restaurant.getRating());

            mRestaurantImage.setImageResource(restaurant.getDrawableRes());
        }

        @Override
        public void onClick(View v) {
            Intent intent = PromotionListActivity.newIntent(getActivity(), mRestaurant.getId());
            startActivity(intent);
        }
    }

    private class RestaurantAdapter extends RecyclerView.Adapter<RestaurantHolder> {

        private List<Restaurant> mRestaurants;

        public RestaurantAdapter(List<Restaurant> restaurants) {
            mRestaurants = restaurants;
        }

        @NonNull
        @Override
        public RestaurantHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new RestaurantHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull RestaurantHolder holder, int position) {
            Restaurant restaurant = mRestaurants.get(position);
            holder.bind(restaurant);
        }

        @Override
        public int getItemCount() {
            return mRestaurants.size();
        }
    }

}
