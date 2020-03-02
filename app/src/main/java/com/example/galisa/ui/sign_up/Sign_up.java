package com.example.galisa.ui.sign_up;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.galisa.R;
import com.example.galisa.data.ProjectAPIs;
import com.example.galisa.data.NetworkClient;
import com.example.galisa.databinding.ActivitySignUpBinding;
import com.example.galisa.pojo.request.SignUp_request;
import com.example.galisa.pojo.response.SignUp_response;
import com.example.galisa.ui.login.Login;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Sign_up extends AppCompatActivity {

    ActivitySignUpBinding signUpBinding;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        signUpBinding= DataBindingUtil.setContentView(this,R.layout.activity_sign_up);

        signUpBinding.progressBar.setVisibility(View.GONE);
        signUpBinding.btSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignUp_request signUpRequest=new SignUp_request();
                signUpRequest.setState_id(6);
                signUpRequest.setUser_name(signUpBinding.etSignname.getText().toString());
                signUpRequest.setEmail(signUpBinding.etSignemail.getText().toString());
                signUpRequest.setPhone(signUpBinding.etPhone.getText().toString()) ;
                signUpRequest.setPasswords(signUpBinding.etSignpass.getText().toString());
                signUpBinding.progressBar.setVisibility(View.VISIBLE);

                registerUser(signUpRequest);
            }
        });
        signUpBinding.tvGologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sign_up.this, Login.class);
                startActivity(intent);
            }
        });
    }
    private void registerUser(SignUp_request regesterationrequest) {

        Retrofit retrofit = NetworkClient.getRetrofitClient();
        ProjectAPIs projectAPIs = retrofit.create(ProjectAPIs.class);
        Call<SignUp_response> call = projectAPIs.creatUser(regesterationrequest);
        call.enqueue(new Callback<SignUp_response>() {
            @Override
            public void onResponse(Call<SignUp_response> call, Response<SignUp_response> response) {
                /*This is the success callback. Though the response type is JSON, with Retrofit we get the response in the form of WResponse POJO class
                 */
                if(response.isSuccessful())
                {
                    signUpBinding.progressBar.setVisibility(View.GONE);
                    Intent intent=new Intent(Sign_up.this,Login.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onFailure(Call<SignUp_response> call, Throwable t) {
                signUpBinding.progressBar.setVisibility(View.GONE);

                Toast.makeText(Sign_up.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
