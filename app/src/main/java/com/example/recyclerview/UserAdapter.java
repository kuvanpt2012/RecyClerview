package com.example.recyclerview;

import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ItemViewHolder> {
    private ArrayList<User> mArrayUsers;
    public UserAdapter (){
        mArrayUsers = new ArrayList<>();
    }

    public void submitData (ArrayList<User> arrayUsers){
        if (arrayUsers!= null){
            mArrayUsers.clear();
            mArrayUsers.addAll(arrayUsers);
            notifyDataSetChanged();
        }
    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView mImage;
        TextView mTvName, mTvAge;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            mTvAge = itemView.findViewById(R.id.textviewAge);
            mImage = itemView.findViewById(R.id.imageview);
            mTvName = itemView.findViewById(R.id.textviewName);
        }
    }
}
