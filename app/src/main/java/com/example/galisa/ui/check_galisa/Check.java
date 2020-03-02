package com.example.galisa.ui.check_galisa;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


import com.example.galisa.R;
import com.example.galisa.data.NetworkClient;
import com.example.galisa.data.ProjectAPIs;
import com.example.galisa.databinding.CheckBinding;
import com.example.galisa.pojo.request.CheckAnswer_request;
import com.example.galisa.pojo.response.Check_response;
import com.example.galisa.pojo.response.Checkanswer_response;

import java.util.List;

public class Check extends AppCompatActivity {

    CheckBinding checkBinding;
    CheckViewModel checkViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkBinding = DataBindingUtil.setContentView(this, R.layout.check);


        checkViewModel = ViewModelProviders.of(this).get(CheckViewModel.class);
        checkViewModel.check_question();
        checkViewModel.checkm.observe(this, new Observer<List<Check_response.DataBean>>() {
            @Override
            public void onChanged(List<Check_response.DataBean> dataBeans) {

                for (int n = 0; n < dataBeans.size(); n++) {
                    if (dataBeans.get(n).getId() == 5) {
                        checkBinding.etOne.setHint(dataBeans.get(n).getQuestion());
                    }
                    if (dataBeans.get(n).getId() == 6) {
                        checkBinding.etTwo.setHint(dataBeans.get(n).getQuestion());
                    }
                    if (dataBeans.get(n).getId() == 7) {
                        checkBinding.etThree.setHint(dataBeans.get(n).getQuestion());
                    }
                    if (dataBeans.get(n).getId() == 8) {
                        checkBinding.etFour.setHint(dataBeans.get(n).getQuestion());
                    }
                    if (dataBeans.get(n).getId() == 9) {
                        checkBinding.etFive.setHint(dataBeans.get(n).getQuestion());
                    }
                }
            }
        });

//
//        //Posting answers (data entry)
//        checkViewModel.post.observe(this, new Observer<List<Checkanswer_response>>() {
//            @Override
//            public void onChanged(List<Checkanswer_response> checkanswer_responses) {
//                checkViewModel.post_answer();
//            }
//        });


    }
    private void updateService(CheckAnswer_request request) {

        //Obtain an instance of Retrofit by calling the static method.
        Retrofit retrofit = NetworkClient.getRetrofitClient();
        /*
        The main purpose of Retrofit is to create HTTP calls from the Java interface based on the annotation associated with each method. This is achieved by just passing the interface class as parameter to the create method
        */
        ProjectAPIs projectAPIs = retrofit.create(ProjectAPIs.class);
        /*
        Invoke the method corresponding to the HTTP request which will return a Call object. This Call object will used to send the actual network request with the specified parameters
        */
        Call<Checkanswer_response> call = projectAPIs.answerQuestions(request);
        /*
        This is the line which actually sends a network request. Calling enqueue() executes a call asynchronously. It has two callback listeners which will invoked on the main thread
        */
        call.enqueue(new Callback<Checkanswer_response>() {
            @Override
            public void onResponse(Call<Checkanswer_response> call, Response<Checkanswer_response> response) {
                /*This is the success callback. Though the response type is JSON, with Retrofit we get the response in the form of WResponse POJO class
                 */
                if(response.isSuccessful())
                {
//                    checkBinding.progressBar.setVisibility(View.GONE);
                    final AlertDialog.Builder builder=new AlertDialog.Builder(Check.this);
                    View view=getLayoutInflater().inflate(R.layout.alert_thanking,null);
                    builder.setView(view);
                    builder.show();
                    final AlertDialog dialog=builder.create();
                    dialog.setCanceledOnTouchOutside(false);
                }
            }
            @Override
            public void onFailure(Call<Checkanswer_response> call, Throwable t) {
//                binding.progressBar.setVisibility(View.GONE);
//                Toast.makeText(EditServiceActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

}
