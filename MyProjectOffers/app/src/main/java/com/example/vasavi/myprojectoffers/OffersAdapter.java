package com.example.vasavi.myprojectoffers;

/**
 * Created by vasavi on 3/31/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
 public  class OffersAdapter extends RecyclerView.Adapter<OffersAdapter.MyViewHolder>{
     private List<Offer> offersList;

     public class MyViewHolder extends RecyclerView.ViewHolder {
         public TextView title,desc,percent;

         public MyViewHolder(View view) {
             super(view);
             title = (TextView) view.findViewById(R.id.title);
             desc = (TextView) view.findViewById(R.id.desc);
             percent = (TextView) view.findViewById(R.id.percent);
         }
     }


     public OffersAdapter(List<Offer> offersList) {
         this.offersList=offersList;
     }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.offer_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(OffersAdapter.MyViewHolder holder, int position) {
        Offer offer = offersList.get(position);
        holder.title.setText(offer.getTitle());
        holder.desc.setText(offer.getDesc());
        holder.percent.setText(offer.getPercent());
    }

    @Override
    public int getItemCount() {
        return offersList.size();
    }
}
