package com.hg.filmapp.webservice;

import com.google.gson.Gson;
import com.hg.filmapp.utils.Constants;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hurman on 03/06/2016.
 */
public class RestfulAdapter {

    public IFilms getRetrofitObject() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = getClient().newBuilder().addInterceptor(interceptor).build();

        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(client)
                .build()
                .create(IFilms.class);
    }

    public OkHttpClient getClient() {
        return new OkHttpClient.Builder()
                .build();
    }
}
