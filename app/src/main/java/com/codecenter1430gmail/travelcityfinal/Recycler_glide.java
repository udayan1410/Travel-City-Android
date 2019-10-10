package com.codecenter1430gmail.travelcityfinal;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class Recycler_glide extends RecyclerView.Adapter<Recycler_glide.ViewHolder> {

    Intent i;

    public ArrayList<String> mNames = new ArrayList<>();
    public ArrayList<String> mImagepath = new ArrayList<>();
    private Context mcontext;

    public Recycler_glide(Context mcontext, ArrayList<String> mNames, ArrayList<String> mImagepath) {
        this.mcontext = mcontext;
        this.mNames = mNames;
        this.mImagepath = mImagepath;

    }
    public Recycler_glide()
    {

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        Picasso.with(mcontext).load(mImagepath.get(position)).placeholder(R.drawable.loading_small).into(holder.image);

        holder.txt.setText(mNames.get(position));

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(mcontext,Main4Activity.class);
                i.putExtra("image",mImagepath.get(position));
                i.putExtra("heading",mNames.get(position));
                i.putExtra("imagelist",mImagepath);
                i.putExtra("namelist",mNames);
                mcontext.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImagepath.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView image;
        TextView txt;
        ProgressBar progressBar;
        CardView card;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.imageofplace);
            txt =(TextView) itemView.findViewById(R.id.nameofplace);
            card = (CardView)itemView.findViewById(R.id.cardview);

        }
    }

}
