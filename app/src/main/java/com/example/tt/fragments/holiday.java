package com.example.tt.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tt.R;
import com.github.barteksc.pdfviewer.PDFView;


public class holiday extends Fragment {

    PDFView p1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_holiday, container, false);

        p1=(PDFView)view.findViewById(R.id.p1);

        p1.fromAsset("holiday.pdf").load();
        return view;
    }
}