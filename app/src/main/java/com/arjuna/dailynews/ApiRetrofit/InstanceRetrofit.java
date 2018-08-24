package com.arjuna.dailynews.ApiRetrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by arjuna on 24/08/18.
 */
public class InstanceRetrofit {
    public static final String WebUrl = "http://192.168.20.63/portalberita/";

    public static Retrofit setInit() {
        return new Retrofit.Builder()
                .baseUrl(WebUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getInstance() {
        return setInit().create(ApiService.class);
    }
}
