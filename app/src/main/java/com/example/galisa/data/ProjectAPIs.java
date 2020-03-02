package com.example.galisa.data;

import com.example.galisa.pojo.request.CheckAnswer_request;
import com.example.galisa.pojo.request.Filter_request;
import com.example.galisa.pojo.request.Login_request;
import com.example.galisa.pojo.response.Check_response;
import com.example.galisa.pojo.response.Checkanswer_response;
import com.example.galisa.pojo.response.Filter_response;
import com.example.galisa.pojo.response.Info_response;
import com.example.galisa.pojo.response.Login_response;
import com.example.galisa.pojo.response.Orders_response;

import io.reactivex.Observable;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ProjectAPIs {

    @POST("regesteration")
    public Call<com.example.galisa.pojo.response.SignUp_response> creatUser(@Body com.example.galisa.pojo.request.SignUp_request signUp_request);

    @POST("user_login")
    public Call<Login_response> enterUser(@Body Login_request loginRequest);


    @GET("setter_questions")
    public Observable<Check_response> GetQuestions();


    //not complete
    @POST("answer_questions")
    public Observable<Checkanswer_response> post_answers(@Body CheckAnswer_request answer_request);

    //not complete
    @POST("answer_questions")
    Call<Checkanswer_response> answerQuestions(@Body CheckAnswer_request answer_request);

    @GET("show_requestes")
    public Observable<Orders_response> getOrders(@Query("user_token") String user_token);


    //not complete
    //on click on order to show data in new activity....
    @GET("show_requestByid")
    public Observable<Info_response> showDAta(@Query("user_token") String user_token,
                                              @Query("request_id") int id);

    //not working
    @POST("filter_requestes")
    public Observable<Filter_response> filter_answers(@Body Filter_request request);



}
