package com.example.galisa.ui.splash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.galisa.R;
import com.example.galisa.databinding.ActivitySplashGalisaBinding;
import com.example.galisa.ui.check_galisa.Check;
import com.example.galisa.ui.login.Login;
import com.example.galisa.ui.sign_up.Sign_up;

public class Splash_galisa extends AppCompatActivity {


    ActivitySplashGalisaBinding galisaBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        galisaBinding= DataBindingUtil.setContentView(this, R.layout.activity_splash_galisa);


        //زرار تسجيل الدخول
        galisaBinding.btnLoginsplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Splash_galisa.this, Login.class);
                startActivity(intent1);
            }
        });

        //زرار إنشاء حساب
        galisaBinding.btnSignupsplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Splash_galisa.this, Sign_up.class);
                startActivity(intent2);
            }
        });
    }
}
