/**
 * NIM : 10120097
 * NAMA : Raka Fadlilah
 * KELAS : IF-3
 */
package com.uas.catatanharian.ui.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.uas.catatanharian.R;

public class AboutPage1 extends Fragment {


    public AboutPage1() {
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
        return inflater.inflate(R.layout.fragment_about_page1, container, false);
    }
}