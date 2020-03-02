package com.example.galisa.ui.fragment.profile_galisa;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.galisa.R;
import com.example.galisa.databinding.GalisaProfileBindingImpl;

public class Profile extends Fragment {
    SharedPreferences sharedpreferences;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        GalisaProfileBindingImpl bindingprofile;
        bindingprofile = DataBindingUtil.inflate(
                inflater, R.layout.galisa_profile, container, false);
        View view = bindingprofile.getRoot();

        
        return view;
    }



}
