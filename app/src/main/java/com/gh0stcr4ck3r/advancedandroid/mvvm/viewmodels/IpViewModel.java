package com.gh0stcr4ck3r.advancedandroid.mvvm.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.gh0stcr4ck3r.advancedandroid.mvvm.models.IPModel;
import com.gh0stcr4ck3r.advancedandroid.mvvm.repositories.IpRepository;

import java.util.List;

/**
 * Created by cr4ck3r
 * Date: 3/17/19
 * Owner: Raisul Islam
 * Copyright (c) 2019 . All rights reserved.
 */
public class IpViewModel extends AndroidViewModel {

    private IpRepository mRepository;
    private LiveData<List<IPModel>> mIpModelList;

    public IpViewModel(@NonNull Application application) {
        super(application);
        mRepository=new IpRepository(application);
        mIpModelList=mRepository.getAllIPs();
    }

    public LiveData<List<IPModel>> getAllIPs() {
        return mIpModelList;
    }

    public void insert(IPModel ipModel) {
        mRepository.insert(ipModel);
    }
    public void getRemoteData(String ip){
        mRepository.getRemoteData(ip);
    }
}
