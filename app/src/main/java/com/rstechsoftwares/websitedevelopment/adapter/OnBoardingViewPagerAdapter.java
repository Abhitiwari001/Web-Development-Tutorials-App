package com.rstechsoftwares.websitedevelopment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.rstechsoftwares.websitedevelopment.R;
import com.rstechsoftwares.websitedevelopment.model.ScreenItem;

import java.util.List;

/**
 * ViewPagerAdapter for OnBoardingScreen
 */
public class OnBoardingViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<ScreenItem> mScreenItems;

    public OnBoardingViewPagerAdapter(Context mContext, List<ScreenItem> mScreenItems) {
        this.mContext = mContext;
        this.mScreenItems = mScreenItems;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.layout_screen, null);

        ImageView image = layoutScreen.findViewById(R.id.intro_image);
        TextView title = layoutScreen.findViewById(R.id.intro_title);
        TextView description = layoutScreen.findViewById(R.id.intro_description);

        title.setText(mScreenItems.get(position).getTitle());
        description.setText(mScreenItems.get(position).getDescription());
        image.setImageResource(mScreenItems.get(position).getImage());

        container.addView(layoutScreen);
        return layoutScreen;
    }

    @Override
    public int getCount() {
        return mScreenItems.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);

    }
}
