package com.example.galisa.ui.check_galisa;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.galisa.data.NetworkClient;

import com.example.galisa.pojo.request.CheckAnswer_request;
import com.example.galisa.pojo.response.Check_response;
import com.example.galisa.pojo.response.Checkanswer_response;
import java.util.List;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static android.content.ContentValues.TAG;

public class CheckViewModel extends ViewModel {

    public MutableLiveData<List<Check_response.DataBean>> checkm=new MutableLiveData();
    public MutableLiveData<List<Checkanswer_response>> post=new MutableLiveData<>();
    CheckAnswer_request an;
    public void check_question() {
        Observable observable= NetworkClient.getInstance().getQuestions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        Observer<Check_response> observer = new Observer<Check_response>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(Check_response Response) {
                checkm.setValue(Response.getData());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        observable.subscribe(observer);

    }

////////////////////////////////////////////////////////////
    public void post_answer() {
        Observable observable= NetworkClient.getInstance().post_ans(an)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        Observer<List<Checkanswer_response>> observer = new Observer<List<Checkanswer_response>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<Checkanswer_response> checkanswer_responses) {

                post.setValue(checkanswer_responses);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, e.getMessage());
            }

            @Override
            public void onComplete() {

            }
        };

        observable.subscribe(observer);

    }

}
