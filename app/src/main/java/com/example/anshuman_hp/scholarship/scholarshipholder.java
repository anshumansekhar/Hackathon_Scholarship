package com.example.anshuman_hp.scholarship;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Anshuman-HP on 02-04-2017.
 */

public class scholarshipholder extends RecyclerView.ViewHolder {
    TextView firstnameofscholarship,secondnameofscholarship,lastdatetoapply;
    Button apply;
    public scholarshipholder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        firstnameofscholarship=(TextView)itemView.findViewById(R.id.firstnamescholarship);
        secondnameofscholarship=(TextView)itemView.findViewById(R.id.secondnamescholarship);
        lastdatetoapply=(TextView)itemView.findViewById(R.id.lastdatetoapply);
        apply=(Button)itemView.findViewById(R.id.applybutton);
    }
}
