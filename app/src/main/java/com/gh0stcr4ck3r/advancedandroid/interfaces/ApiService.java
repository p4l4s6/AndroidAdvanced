package com.gh0stcr4ck3r.advancedandroid.interfaces;

import com.gh0stcr4ck3r.advancedandroid.mvvm.models.IPModel;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by cr4ck3r
 * Date: 3/17/19
 * Owner: Raisul Islam
 * Copyright (c) 2019 . All rights reserved.
 */
public interface ApiService {

    @GET("{ip}/json")
    Observable<IPModel> getIpInfo(@Path("ip") String ip);
}
