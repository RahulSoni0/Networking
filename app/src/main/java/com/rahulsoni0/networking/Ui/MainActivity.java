package com.rahulsoni0.networking.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.rahulsoni0.networking.Api.ApiInterface;
import com.rahulsoni0.networking.Api.RetrofitClient;
import com.rahulsoni0.networking.Models.Address;
import com.rahulsoni0.networking.Models.Company;
import com.rahulsoni0.networking.Models.Geo;
import com.rahulsoni0.networking.Models.PicModelItem;
import com.rahulsoni0.networking.Models.Post;
import com.rahulsoni0.networking.Models.UserModelItem;
import com.rahulsoni0.networking.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface jsonPlaceHolderApi = RetrofitClient.getClient();
//        Company company = new Company("cheatfund" , "25 din me paisa double" , "lamxi cheat fund");
//        Geo geo  = new Geo("32.17" , "34.23");
//        Address add  = new Address("ranchi" ,geo,"65","buji","743757" );
//        UserModelItem user = new UserModelItem(add,company,"hello@gmail.com",1,"raju","95454","raju420","raju.com");
//
//         Call<UserModelItem> postuser = jsonPlaceHolderApi.postUsers(user);
//         postuser.enqueue(new Callback<UserModelItem>() {
//             @Override
//             public void onResponse(Call<UserModelItem> call, Response<UserModelItem> response) {
//                 if(response.isSuccessful() && response.body() != null){
//                     Log.d("@@@@", "onResponse: " + response.body().toString());
//                 }
//             }
//
//             @Override
//             public void onFailure(Call<UserModelItem> call, Throwable t) {
//                 Log.d("@@@@", "onFailure: " + t.getLocalizedMessage());
//             }
//         });
//


//        Call<List<UserModelItem>> users = jsonPlaceHolderApi.getUsers();
//        users.enqueue(new Callback<List<UserModelItem>>() {
//            @Override
//            public void onResponse(Call<List<UserModelItem>> call, Response<List<UserModelItem>> response) {
//                if(response.isSuccessful() && response.body() != null){
//                    List<UserModelItem> ll  = response.body();
//                    Log.d("@@@@", "onResponse: " + ll.get(2).getCompany().getCatchPhrase());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<UserModelItem>> call, Throwable t) {
//
//            }
//        });


//        Call<List<Post>> listCall = jsonPlaceHolderApi.getPosts();
//
//        Post post = new Post(1,1,"heelo","hello");
//
//        Call<Post> postcall = jsonPlaceHolderApi.createUser(post);
//        postcall.enqueue(new Callback<Post>() {
//            @Override
//            public void onResponse(Call<Post> call, Response<Post> response) {
//                if(response.isSuccessful() && response.body() != null){
//                    Post p = response.body();
//                    Log.d("####", "onResponse: " + p.toString());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Post> call, Throwable t) {
//                Log.d("####", "onResponse: " + t.getLocalizedMessage());
//            }
//        });
//
//        Call<List<PicModelItem>> call = jsonPlaceHolderApi.getpic();
//        call.enqueue(new Callback<List<PicModelItem>>() {
//            @Override
//            public void onResponse(Call<List<PicModelItem>> call, Response<List<PicModelItem>> response) {
//                if(response.isSuccessful() && response.body() != null){
//                    List<PicModelItem> listpics = response.body();
//                    Log.d("@@@@", "onResponse: " + listpics.toString());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<PicModelItem>> call, Throwable t) {
//
//            }
//        });


//        listCall.enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//                if(response.isSuccessful() && response.body() != null){
//                    List<Post> posts = response.body();
//                    Log.d("@@@@", "onResponse: " + posts.toString());
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//                Log.d("@@@@", "onResponse: " + t.getLocalizedMessage());
//            }
//        });




    }
}