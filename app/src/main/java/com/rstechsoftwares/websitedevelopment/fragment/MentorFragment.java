package com.rstechsoftwares.websitedevelopment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rstechsoftwares.websitedevelopment.R;
import com.rstechsoftwares.websitedevelopment.mentor2;

public class MentorFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_mentor, container, false);
        Button b= rootView.findViewById(R.id.apply);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String url1="https://docs.google.com/forms/d/16AgiF80sshzQ-30yhoOqXTlR5-hauONoPlBro-qSgFs/edit?usp=sharing";
                Intent i= new Intent(getActivity(), mentor2.class);

                startActivity(i);
            }
        });
        return rootView;

    }
}
