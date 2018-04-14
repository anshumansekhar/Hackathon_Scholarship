package com.example.anshuman_hp.scholarship;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anshuman-HP on 02-04-2017.
 */

public class scholarshipadapter extends RecyclerView.Adapter<scholarshipholder> {
    Context c;
    List<scholarshipdetails> data;


    public scholarshipadapter(Context c,List<scholarshipdetails> data) {
        this.data=data;
        this.c = c;
    }

    @Override
    public scholarshipholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.scholarcard,parent,false);
        return new scholarshipholder(v);
    }
    scholarshipdetails obj;
    @Override
    public void onBindViewHolder( scholarshipholder holder,  int position) {
        obj=data.get(position);
        Log.v("aaa",obj.getFirstname());
        holder.firstnameofscholarship.setText(obj.getFirstname().replaceAll("\n",""));
        holder.secondnameofscholarship.setText(obj.getSecondname().replaceAll("\n",""));
        holder.lastdatetoapply.setText(obj.getLastdate().replaceAll("\n",""));
        holder.apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),DetailScholarship.class);
                i.putExtra("URL",obj.getUrl().replaceAll("\n",""));
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
