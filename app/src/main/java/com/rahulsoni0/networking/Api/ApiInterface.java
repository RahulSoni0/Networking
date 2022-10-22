package com.rahulsoni0.networking.Api;

import com.rahulsoni0.networking.Models.PicModelItem;
import com.rahulsoni0.networking.Models.Post;
import com.rahulsoni0.networking.Models.UserModelItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    //after / define here

    @GET("photos")
    Call<List<PicModelItem>> getpic( );

    @GET("posts")
    Call<List<Post>> getPosts();

    @POST("posts")
    Call<Post> createUser(@Body Post post);

    @GET("users")
    Call<List<UserModelItem>> getUsers();

    @POST("users")
    Call<UserModelItem> postUsers(@Body UserModelItem user);
}
