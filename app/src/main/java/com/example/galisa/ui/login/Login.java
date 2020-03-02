package com.example.galisa.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.galisa.R;
import com.example.galisa.data.ProjectAPIs;
import com.example.galisa.data.NetworkClient;
import com.example.galisa.databinding.ActivityLoginBinding;
import com.example.galisa.pojo.request.Login_request;
import com.example.galisa.pojo.response.Login_response;
import com.example.galisa.ui.fragment.bottom_nav_galisa.Bot_nav_galisa;

import com.example.galisa.ui.sign_up.Sign_up;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Login extends AppCompatActivity {

    ActivityLoginBinding loginBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding= DataBindingUtil.setContentView(this,R.layout.activity_login);


        loginBinding.btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //calling request off api
                Login_request request=new Login_request();
                request.setUser_name(loginBinding.etLoginname.getText().toString());
                request.setPasswords(loginBinding.etLoginpass.getText().toString());
                Userlogin(request);
            }
        });

        loginBinding.tvGosignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Login.this, Sign_up.class);
                startActivity(intent1);
            }
        });
    }

    private void Userlogin(Login_request login_request) {

        Retrofit retrofit = NetworkClient.getRetrofitClient();
        ProjectAPIs projectAPIs = retrofit.create(ProjectAPIs.class);
        Call<Login_response> call = projectAPIs.enterUser(login_request);
        call.enqueue(new Callback<Login_response>() {
            @Override
            public void onResponse(Call<Login_response> call, Response<Login_response> response) {

                if(response.isSuccessful())
                {
                    if(response.body().getData().getState().equals("pending"))
                    {
                        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
                        SharedPreferences.Editor editor = pref.edit();
                        editor.putString("userId", "" + response.body().getData().getId());
                        editor.putString("userToken", "" + response.body().getData().getUser_token());
                        editor.putString("userState", "" + response.body().getData().getState());
                        editor.putBoolean("SignState", true);
                        editor.commit();
                        loginBinding.progressBar.setVisibility(View.GONE);

                        Intent intent=new Intent(Login.this, Bot_nav_galisa.class);
                        startActivity(intent);
                        {
                            Toast.makeText(Login.this, "هذا الحساب ليس لجليسة أطفال !", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
            @Override
            public void onFailure(Call<Login_response> call, Throwable t) {
                Toast.makeText(Login.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }


}
