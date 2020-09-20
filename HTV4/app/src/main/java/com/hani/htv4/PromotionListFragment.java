package com.hani.htv4;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.UUID;

public class PromotionListFragment extends Fragment {

    private static final String ARG_RESTAURANT_ID = "promotionlistfragment.restaurant_id";

    private Restaurant mRestaurant;

    private RecyclerView mPromotionRecyclerView;
    private PromotionAdapter mAdapter;

    public static PromotionListFragment newInstance(UUID id) { // id of Restaurant
        Bundle args = new Bundle();
        args.putSerializable(ARG_RESTAURANT_ID, id);

        // Pass restaurant to promotion list fragment so fragment knows which restuarant's promotions to show
        PromotionListFragment fragment = new PromotionListFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Retrieve id for restaurant from arguments and fetch restaurant
        UUID restaurantId = (UUID) getArguments().getSerializable(ARG_RESTAURANT_ID);
        mRestaurant = RestaurantHelper.getHelper().getRestaurant(restaurantId);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_promotion_list, container, false);

        mPromotionRecyclerView = (RecyclerView) view.findViewById(R.id.promotion_recycler_view);
        mPromotionRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        Log.e("Restaurant Helper", (RestaurantHelper.getHelper() == null) ? "hello null" : "not null");

        List<Promotion> promotions = mRestaurant.getPromotions();
        mAdapter = new PromotionAdapter(promotions);
        mPromotionRecyclerView.setAdapter(mAdapter);

        return view;
    }

    private class PromotionHolder extends RecyclerView.ViewHolder {

        private Promotion mPromotion;

        // Widgets in promotion
        TextView mName; // name of the restaurant
        TextView mDescription;
        TextView mPrice;
        ImageView mImageView;

        public PromotionHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_promotion, parent, false));

            // Wire up widgets in promotion
            mName = (TextView) itemView.findViewById(R.id.promotion_name);
            mDescription = (TextView) itemView.findViewById(R.id.promotion_description);
            mPrice = (TextView) itemView.findViewById(R.id.promotion_price);
            mImageView = (ImageView) itemView.findViewById(R.id.promotion_image);
        }

        public void bind(Promotion promotion) {
            mPromotion = promotion;
            mName.setText(promotion.getTitle());
            mDescription.setText(promotion.getDescription());
            mPrice.setText(promotion.getPrice());
            mImageView.setImageResource(promotion.getDrawableRes());
        }

    }

    private class PromotionAdapter extends RecyclerView.Adapter<PromotionHolder> {

        private List<Promotion> mPromotions; // Use this to get list of promotions

        public PromotionAdapter(List<Promotion> promotions) {
            mPromotions = promotions;
        }

        @NonNull
        @Override
        public PromotionHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new PromotionHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull PromotionHolder holder, int position) {
            Promotion promotion = mPromotions.get(position);
            holder.bind(promotion);
        }

        @Override
        public int getItemCount() {
            return mPromotions.size();
        }
    }

}
