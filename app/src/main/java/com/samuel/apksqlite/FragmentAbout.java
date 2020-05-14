package com.samuel.apksqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentAbout extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private ArrayList<Kelompok> kelompoks;

    public FragmentAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.activity_fragment_item_list,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.rv_dashboard);
        ListKelompokAdapter listKelompokAdapter =new ListKelompokAdapter(getContext(),kelompoks);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(listKelompokAdapter);
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        kelompoks = new ArrayList<>();
        kelompoks.addAll(KelompokData.getListData());
    }
}

