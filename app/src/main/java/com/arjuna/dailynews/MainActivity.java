package com.arjuna.dailynews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.arjuna.dailynews.ApiRetrofit.ApiService;
import com.arjuna.dailynews.ApiRetrofit.InstanceRetrofit;
import com.arjuna.dailynews.ResponseServer.DataItem;
import com.arjuna.dailynews.ResponseServer.ResponseReadData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    // TODO Create Recyclerview variable class
    RecyclerView view;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO Inlitialize Widget to Variable
        view = findViewById(R.id.rclist);
        view.setLayoutManager(new LinearLayoutManager(this));
        getData();
    }

    private void getData() {
        ApiService api = InstanceRetrofit.getInstance();
        Call<ResponseReadData> call = api.response_read_data();
        call.enqueue(new Callback<ResponseReadData>() {
            @Override
            public void onResponse(Call<ResponseReadData> call, Response<ResponseReadData> response) {
                Boolean status = response.body().isSuccess();
                if(status){
                    List<DataItem> dataItems = response.body().getData();
                    adapter = new CustomAdapter(MainActivity.this, dataItems);
                    view.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ResponseReadData> call, Throwable t) {

            }
        });
    }


}
