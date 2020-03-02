package com.example.galisa.data;

import com.example.galisa.pojo.request.CheckAnswer_request;
import com.example.galisa.pojo.request.Filter_request;
import com.example.galisa.pojo.response.Check_response;
import com.example.galisa.pojo.response.Checkanswer_response;
import com.example.galisa.pojo.response.Filter_response;
import com.example.galisa.pojo.response.Info_response;
import com.example.galisa.pojo.response.Orders_response;

import io.reactivex.Observable;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {

    private static final String Base_url = "http://babySitterApi.codecaique.com/api/";
    private ProjectAPIs galisaInterface;
    private static NetworkClient Instance;
    public  static  Retrofit retrofit;

    public NetworkClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        galisaInterface = retrofit.create(ProjectAPIs.class);


    }
    public static Retrofit getRetrofitClient() {

        if (retrofit ==null){
            //Defining the Retrofit using Builder
            retrofit=new Retrofit.Builder()
                    .baseUrl(Base_url) //This is the only mandatory call on Builder object.
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


    //function of checking instance class....
    public static NetworkClient getInstance() {
        if (null == Instance) {
            Instance = new NetworkClient();
        }
        return Instance;
    }



    public Observable<Check_response> getQuestions()
    {
        return galisaInterface.GetQuestions();
    }


    //not working
    public Observable<Checkanswer_response> post_ans(CheckAnswer_request a)
    {
        return galisaInterface.post_answers(a);
    }

    public Observable<Orders_response> order ()
    {
        return galisaInterface.getOrders("54ceb91256e8190e474aa752a6e0650a2df5ba37");
    }


    // not working
    public Observable<Info_response> ShowData ()
    {
        return galisaInterface.showDAta("54ceb91256e8190e474aa752a6e0650a2df5ba37",1);
    }


    public Observable<Filter_response> post_ans(Filter_request filter_request)
    {
        return galisaInterface.filter_answers(filter_request);
    }












}
