package com.example.meruj.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.rv);
        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant(R.drawable.aaa,"kafn","5km","+7(906)-720-3356"));
        restaurantList.add(new Restaurant(R.drawable.about_us,"м. домодедовская  ул Ореховый ," +
                "б-р д.14 корп 3","5km","+7(906)-720-3356"));
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(restaurantList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(restaurantAdapter);
        return view;
    }

}
