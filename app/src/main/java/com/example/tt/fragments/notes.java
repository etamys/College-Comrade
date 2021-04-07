package com.example.tt.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.tt.R;
import com.example.tt.dsa;
import com.example.tt.eec;
import com.example.tt.math;
import com.example.tt.oop;


public class notes extends Fragment {

    private Button btnmath,btnoop,btndsa,btndec,btneec;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_notes, container, false);
        btndec=(Button) view.findViewById(R.id.dec);
        btndec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Refer class notes",Toast.LENGTH_LONG).show();
            }
        });
        btndsa=(Button)view.findViewById(R.id.dsa);
        btndsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), dsa.class);

                startActivity(intent);
            }
        });
        btnmath=(Button)view.findViewById(R.id.math);
        btnmath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), math.class);

                startActivity(intent);
            }
        });
        btnoop=(Button)view.findViewById(R.id.oop);
        btnoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), oop.class);

                startActivity(intent);
            }
        });
        btneec=(Button)view.findViewById(R.id.eco);
        btneec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), eec.class);

                startActivity(intent);
            }
        });
        return view;
    }

}