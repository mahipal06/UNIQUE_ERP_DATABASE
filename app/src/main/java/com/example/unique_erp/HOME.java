package com.example.unique_erp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class HOME extends Fragment {

    public HOME() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_h_o_m_e, container, false);

        ImageSlider imageSlider = view.findViewById(R.id.image_slider);

        List<SlideModel> imageList = new ArrayList<>();

        //imageList.add(new SlideModel(R.drawable.logo, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.banner1, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.banner2, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.baner8, ScaleTypes.FIT));
        //imageList.add(new SlideModel(R.drawable.banner9, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.banner5, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.banner6, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.banner7, ScaleTypes.FIT));

        imageSlider.setImageList(imageList,ScaleTypes.FIT);

        return view;
    }
}