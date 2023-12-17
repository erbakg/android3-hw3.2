package com.example.android3_hw32;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RequestUsers {
    @GET("/api/users?filters")
    Call<UsersList> getUsers(@Query("page")Integer pageNum, @Query("per_page")Integer perPageNum);
}
