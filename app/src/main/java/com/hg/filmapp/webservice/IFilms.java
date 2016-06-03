package com.hg.filmapp.webservice;

import com.hg.filmapp.model.Film;
import com.hg.filmapp.utils.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by Hurman on 03/06/2016.
 */
public interface IFilms {

    @Headers("token : f90384c1-5a26-4a76-9f3b-fc0b37fe06f8")
    @GET(Constants.BASE_URL)
    Call<Film> getFilms();

}
