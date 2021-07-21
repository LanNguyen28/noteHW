package com.example.notehw;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ListnoteFragment extends Fragment {


    public ListnoteFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listnote, container, false);
    }
    public static ListnoteFragment newInstance() {
        return new ListnoteFragment();
    }
}