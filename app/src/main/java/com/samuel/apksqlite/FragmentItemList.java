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

public class FragmentItemList extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private ArrayList<Spell> dspells;

    public FragmentItemList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.activity_fragment_item_list,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.rv_dashboard);
        ListSpellAdapter listSpellAdapter =new ListSpellAdapter(getContext(),dspells);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(listSpellAdapter);
        return v;
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        dspells = new ArrayList<>();
        dspells.addAll(SpellData.getListData());
    }
}
