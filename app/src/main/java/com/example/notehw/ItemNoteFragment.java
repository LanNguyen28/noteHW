package com.example.notehw;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ItemNoteFragment extends Fragment {


    public ItemNoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_note, container, false);
    }

    public static ItemNoteFragment newInstance() {
        return new ItemNoteFragment();
    }
}