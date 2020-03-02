package com.example.galisa.ui.fragment.home_galisa;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.galisa.data.NetworkClient;
import com.example.galisa.pojo.response.Orders_response;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static android.content.ContentValues.TAG;

public class Home_galisaViewModel extends ViewModel {

    MutableLiveData<List<Orders_response.DataBean>> orderlivedata = new MutableLiveData<>();


    public void getOrders() {

        Observable observable = NetworkClient.getInstance().order()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());


        Observer<Orders_response> observer = new Observer<Orders_response>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Orders_response response) {
                orderlivedata.setValue(response.getData());
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
