package com.arjuna.dailynews.ApiRetrofit;

import com.arjuna.dailynews.ResponseServer.ResponseReadData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by arjuna on 24/08/18.
 */


public interface ApiService {
    @GET("read_data.php")
    Call<ResponseReadData> response_read_data();
}
