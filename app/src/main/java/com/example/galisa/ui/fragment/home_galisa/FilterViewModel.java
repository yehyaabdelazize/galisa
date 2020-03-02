package com.example.galisa.ui.fragment.home_galisa;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.galisa.data.NetworkClient;
import com.example.galisa.pojo.request.Filter_request;
import com.example.galisa.pojo.response.Filter_response;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class FilterViewModel extends ViewModel {
    public MutableLiveData<Filter_response> filter = new MutableLiveData<>();


    public void filteranswer(Filter_request an) {
        Observable observable = NetworkClient.getInstance().post_ans(an)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        Observer<Filter_response> observer = new Observer<Filter_response>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Filter_response Response) {
                filter.setValue(Response);
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


}
