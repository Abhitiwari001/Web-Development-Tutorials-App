package com.rstechsoftwares.websitedevelopment.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rstechsoftwares.websitedevelopment.R;

public class AboutDeveloperFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_about_developer, container, false);

        ImageButton b2=rootView.findViewById(R.id.facebook);
        b2.setOnClickListener(view -> {
            String url1="https://www.facebook.com/rstechsoftwares/";
            Intent i= new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url1));
            startActivity(i);
        });
        ImageButton b3=rootView.findViewById(R.id.Twitter);
        b3.setOnClickListener(view -> {
            String url1="https://www.instagram.com/rstechsoftwares/?hl=en";
            Intent i= new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url1));
            startActivity(i);
        });
        ImageButton b4=rootView.findViewById(R.id.Website);
        b4.setOnClickListener(view -> {
            String url1="https://www.rstechsoftwares.com/";
            Intent i= new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url1));
            startActivity(i);
        });
        ImageButton b5=rootView.findViewById(R.id.LinkedIn);
        b5.setOnClickListener(view -> {
            String url1="https://www.linkedin.com/company/rstechsoftwares/about/";
            Intent i= new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url1));
            startActivity(i);
        });
        return rootView;

    }
}
