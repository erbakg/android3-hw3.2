package com.example.android3_hw32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUsersList;
    private UsersListAdapter usersListAdapter;
    private ArrayList<UsersList.DataClass> usersList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvUsersList = findViewById(R.id.rv_users_list);
        loadData();
        usersListAdapter = new UsersListAdapter(usersList);
        rvUsersList.setAdapter(usersListAdapter);
    }

    private void loadData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RequestUsers requestUsers = retrofit.create(RequestUsers.class);
        requestUsers.getUsers(1, 15).enqueue(new Callback<UsersList>() {
            @Override
            public void onResponse(Call<UsersList> call, Response<UsersList> response) {
                if (response.code() == 200) {
                    if (response.body().getData() != null) {
                        usersList.addAll(response.body().getData());
                        usersListAdapter.notifyDataSetChanged();
                    }

                }

            }

            @Override
            public void onFailure(Call<UsersList> call, Throwable t) {
                Snackbar.make(rvUsersList, t.getMessage(), Snackbar.LENGTH_LONG)
                        .show();
            }
        });
    }
}