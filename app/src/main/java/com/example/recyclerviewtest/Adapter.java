package com.example.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<String> data;
    private List<String> time;
    private List<Integer> image;

    Adapter(Context context, List<String> data,List<String> time,List<Integer> image){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
        this.time = time;
        this.image = image;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.custom_view,viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int i) {

        String title = data.get(i);
        String times = time.get(i);
        Integer images = image.get(i);
        viewholder.textTitle.setText(title);
        viewholder.textDate.setText(times);
        viewholder.newsimage.setImageResource(images);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textTitle,textDate;
        ImageView newsimage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textTitle);
            textDate = itemView.findViewById(R.id.textDate);
            newsimage = itemView.findViewById(R.id.newsimage);
        }
    }
}