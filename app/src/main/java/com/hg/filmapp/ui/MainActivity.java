package com.hg.filmapp.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.hg.filmapp.R;
import com.hg.filmapp.adapter.FilmAdapter;
import com.hg.filmapp.model.Film;
import com.hg.filmapp.utils.Utils;
import com.hg.filmapp.webservice.IFilms;
import com.hg.filmapp.webservice.RestfulAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public ProgressDialog progressDialog;
    private RecyclerView mRecyclerView;
    private FilmAdapter mJourneyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //showProgressDialog("", "Loading...");
        RestfulAdapter restfulAdapter = new RestfulAdapter();

        IFilms service = restfulAdapter.getRetrofitObject();
        Call<Film> call = service.getFilms();
        call.enqueue(new Callback<Film>() {
            @Override
            public void onResponse(Call<Film> call, Response<Film> response) {

                removeProgressDialog();

                Log.d(getClass().getSimpleName(), "Status Code = " + response.code());
                //Log.v(getClass().getSimpleName(), "size: " + response.body().getSections().size());

            }

            @Override
            public void onFailure(Call<Film> call, Throwable t) {

                removeProgressDialog();


            }
        });
    }

    public void showProgressDialog(String title, String description) {
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(true);
        progressDialog.setTitle(title);
        progressDialog.setMessage(description);
        progressDialog.show();
    }

    public void removeProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }
    }
}
