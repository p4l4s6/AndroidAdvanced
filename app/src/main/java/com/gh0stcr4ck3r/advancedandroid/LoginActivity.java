package com.gh0stcr4ck3r.advancedandroid;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.gh0stcr4ck3r.advancedandroid.mvvm.models.IPModel;
import com.gh0stcr4ck3r.advancedandroid.mvvm.viewmodels.IpViewModel;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private IpViewModel ipViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ipViewModel=ViewModelProviders.of(this).get(IpViewModel.class);
        ipViewModel.getAllIPs().observe(this, new Observer<List<IPModel>>() {
            @Override
            public void onChanged(@Nullable List<IPModel> ipModels) {
                for (IPModel ipModel:ipModels){
                    if (ipModel.getIp().isEmpty()){

                    }
                }
            }
        });
    }
}
