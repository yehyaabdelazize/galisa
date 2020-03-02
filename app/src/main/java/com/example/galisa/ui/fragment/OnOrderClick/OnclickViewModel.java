package com.example.galisa.ui.fragment.OnOrderClick;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.galisa.data.NetworkClient;
import com.example.galisa.pojo.response.Info_response;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static android.content.ContentValues.TAG;

public class OnclickViewModel extends ViewModel {
    MutableLiveData<List<Info_response.DataBean>> orderinfo = new MutableLiveData<>();

    public void get_info_Order() {

        Observable observable = NetworkClient.getInstance().ShowData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());


        Observer<Info_response> observer = new Observer<Info_response>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Info_response response) {
                orderinfo.setValue(response.getData());
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: "+ e.getMessage());
            }

            @Override
            public void onComplete() {

            }
        };

        observable.subscribe(observer);

    }

}
