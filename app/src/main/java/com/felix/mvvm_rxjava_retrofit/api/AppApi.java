package com.felix.mvvm_rxjava_retrofit.api;

import com.felix.annotation.ApiAnnotation;
import com.felix.base.http.BaseResponse;
import com.felix.mvvm_rxjava_retrofit.model.MusicRaingItem;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

@ApiAnnotation
public interface AppApi {

    //反馈
    @POST("/api/Tools/FeedBack")
    Flowable<String> commitFeedBack(@Body String reqParam);

    //测试
    @POST("/api/Tools/reset")
    Flowable<BaseResponse<Boolean>> reset(String aaaaa);

    @GET("/musicRankings")
    Flowable<BaseResponse<List<MusicRaingItem>>> musicRankings();
}
