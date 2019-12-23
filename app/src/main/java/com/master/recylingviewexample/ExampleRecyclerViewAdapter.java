package com.master.recylingviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleRecyclerViewAdapter  extends RecyclerView.Adapter<ExampleRecyclerViewAdapter.ExampleViewHolder> {


    private LayoutInflater inflater;
    private ArrayList<String> myarrayList;

    public ExampleRecyclerViewAdapter(Context context, ArrayList<String> arrayList){
        this.myarrayList = arrayList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public ExampleViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new ExampleViewHolder(inflater.inflate(R.layout.row_country_list,parent,false));
    }

    @Override
    public void onBindViewHolder( ExampleViewHolder holder, int position) {
        holder.txtCount.setText(myarrayList.get(position));
    }
    @Override
    public int getItemCount() {
        return myarrayList.size();
    }
    class ExampleViewHolder extends RecyclerView.ViewHolder{
        TextView txtCount;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            txtCount=itemView.findViewById(R.id.txt_count);
        }
    }
}
