package mfbeltran.cardviewfirebase.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mfbeltran.cardviewfirebase.Data.Information;
import mfbeltran.cardviewfirebase.R;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Information> informations;

    public MyAdapter(Context c, ArrayList<Information> informations) {
        this.c = c;
        this.informations = informations;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        MyHolder holder=new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        String name=informations.get(position).getName();
        holder.nameTxt.setText(name);

    }

    @Override
    public int getItemCount() {
        return informations.size();
    }
}
