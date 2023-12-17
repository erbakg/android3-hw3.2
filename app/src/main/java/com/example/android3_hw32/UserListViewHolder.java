package com.example.android3_hw32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.io.IOException;
public class UserListViewHolder extends RecyclerView.ViewHolder {
    private TextView tvUserName;
    private TextView tvUserEmail;
    private AppCompatImageView ivUserAvatar;

    public UserListViewHolder(@NonNull View itemView) {
        super(itemView);
        tvUserName = itemView.findViewById(R.id.tv_user_name);
        tvUserEmail = itemView.findViewById(R.id.tv_user_email);
        ivUserAvatar = itemView.findViewById(R.id.iv_user_avatar);
    }

    public void onBind(UsersList.DataClass data) throws IOException {
        if (!data.equals(null)) {
            tvUserName.setText(data.getFirst_name().toString());
            tvUserEmail.setText(data.getEmail().toString());
            Glide.with(itemView.getContext())
                    .load(data.getAvatar())
                    .apply(RequestOptions.bitmapTransform(new RoundedCorners(14)))
                    .into(ivUserAvatar);
        }

    }
}
