package com.example.android3_hw32;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.ArrayList;

public class UsersListAdapter extends RecyclerView.Adapter<UserListViewHolder> {

    private ArrayList<UsersList.DataClass> usersList;

    public UsersListAdapter(ArrayList<UsersList.DataClass> usersList) {
        this.usersList = usersList;
    }

    @NonNull
    @Override
    public UserListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserListViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull UserListViewHolder holder, int position) {
        try {
            holder.onBind(usersList.get(position));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getItemCount() {
        return usersList == null ? 0 : usersList.size();
    }
}
