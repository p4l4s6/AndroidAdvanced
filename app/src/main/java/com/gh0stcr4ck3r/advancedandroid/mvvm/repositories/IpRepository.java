package com.gh0stcr4ck3r.advancedandroid.mvvm.repositories;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.gh0stcr4ck3r.advancedandroid.interfaces.ApiService;
import com.gh0stcr4ck3r.advancedandroid.mvvm.daos.IpDao;
import com.gh0stcr4ck3r.advancedandroid.mvvm.databases.IPDatabase;
import com.gh0stcr4ck3r.advancedandroid.mvvm.models.IPModel;
import com.gh0stcr4ck3r.advancedandroid.networks.RetrofitInstance;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by cr4ck3r
 * Date: 3/17/19
 * Owner: Raisul Islam
 * Copyright (c) 2019 . All rights reserved.
 */

public class IpRepository {
    private IpDao mIpDao;
    private LiveData<List<IPModel>> ipModelList;
    private Retrofit retrofit;
    private ApiService apiService;

    public IpRepository(Application application) {
        IPDatabase ipDatabase=IPDatabase.getDatabase(application);
        this.mIpDao = ipDatabase.ipDao();
        this.ipModelList = mIpDao.getAllIP();
        this.retrofit=RetrofitInstance.getRetrofitInstance();
        this.apiService=retrofit.create(ApiService.class);

    }

    public LiveData<List<IPModel>> getAllIPs() {
        return ipModelList;
    }

    public void insert (IPModel ipModel) {
        new insertAsyncTask(mIpDao).execute(ipModel);
    }

    public void getRemoteData(String ip){
        apiService.getIpInfo(ip)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<IPModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(IPModel ipModel) {
                        new insertAsyncTask(mIpDao).execute(ipModel);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static class insertAsyncTask extends AsyncTask<IPModel, Void, Void> {

        private IpDao mAsyncTaskDao;

        insertAsyncTask(IpDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final IPModel... params) {
            mAsyncTaskDao.Insert(params[0]);
            return null;
        }
    }
}
