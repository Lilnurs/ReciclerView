package com.example.reciclerview.recyler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reciclerview.R;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;

    TextView textView;

    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String contactName){
        initViews();
        textView.setText(contactName);
    }

    public void initViews(){
        imageView = itemView.findViewById(R.id.imageViewMan);
        textView = itemView.findViewById(R.id.tvName);
    }
}
