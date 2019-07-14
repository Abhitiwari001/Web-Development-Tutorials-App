package com.rstechsoftwares.websitedevelopment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rstechsoftwares.websitedevelopment.OnRecyclerViewItemClickListener;
import com.rstechsoftwares.websitedevelopment.R;
import com.rstechsoftwares.websitedevelopment.model.Topic;

import java.util.ArrayList;

public class TopicsListAdapter extends RecyclerView.Adapter<TopicsListAdapter.TopicsViewHolder> {

    private ArrayList<Topic> mDataset;
    private OnRecyclerViewItemClickListener listener;

    class TopicsViewHolder extends RecyclerView.ViewHolder {

        private TextView topicTitle;
        private ImageView topicImage;

        TopicsViewHolder(@NonNull View itemView) {
            super(itemView);
            topicTitle = itemView.findViewById(R.id.item_topic_title);
            topicImage = itemView.findViewById(R.id.item_topic_image);
        }

        void bind(Topic item){
            topicTitle.setText(item.getTitle());
            Glide.with(itemView.getContext()).load(item.getImage()).into(topicImage);
            topicImage.setOnClickListener(v -> listener.onItemClicked(getAdapterPosition()));
        }
    }

    public TopicsListAdapter(ArrayList<Topic> dataset){
        mDataset = dataset;
    }

    @NonNull
    @Override
    public TopicsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_topic, parent, false);
        return new TopicsViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicsViewHolder holder, int position) {
        holder.bind(mDataset.get(position));

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener){
        this.listener = listener;
    }

}
