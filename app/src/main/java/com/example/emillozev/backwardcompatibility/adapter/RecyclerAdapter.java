package com.example.emillozev.backwardcompatibility.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.emillozev.backwardcompatibility.R;
import com.example.emillozev.backwardcompatibility.model.Landscape;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Landscape> mData;
    private LayoutInflater mInflater;
    private static final String TAG = RecyclerAdapter.class.getSimpleName();


    public RecyclerAdapter(Context context, List<Landscape> data){
        mData = data;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i(TAG, " onCreateViewHolder");
        View view = mInflater.inflate(R.layout.list_item, parent, false);
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        //MyViewHolder holder = new MyViewHolder(view);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.i(TAG, " onBindViewHolder " + position);

        Landscape currentObj = mData.get(position);
        holder.setData(currentObj, position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView title;
        public ImageView imgThumb, imgDelete, imgAdd;
        public int position;
        public Landscape current;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.textTitle);
            this.imgThumb = (ImageView) itemView.findViewById(R.id.imageRow);
            this.imgDelete = (ImageView) itemView.findViewById(R.id.delete);
            this.imgAdd = (ImageView) itemView.findViewById(R.id.refreshImg);
        }

        public void setData(Landscape currentObj, int position) {
            this.title.setText(currentObj.getTitle());
            this.imgThumb.setImageResource(currentObj.getImageId());
            this.position = position;
            this.current = currentObj;
        }
    }
}
