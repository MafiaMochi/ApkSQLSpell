package com.samuel.apksqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentAccount extends Fragment {
    TextView mTextViewLogout;

    public FragmentAccount() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.activity_fragment_account, container, false);

        mTextViewLogout = (TextView) view.findViewById(R.id.logout);
        mTextViewLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MainActivity.class));
                Toast.makeText(getContext(), "Anda Berhasil Logout", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
