package com.example.galisa.ui.fragment.bottom_nav_galisa;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.galisa.R;
import com.example.galisa.databinding.BottomnavGalisaBinding;
import com.example.galisa.ui.fragment.home_galisa.Home_galisa;
import com.example.galisa.ui.fragment.messages.MessageFragment;
import com.example.galisa.ui.fragment.notification.NotificationFragment;
import com.example.galisa.ui.fragment.profile_galisa.Profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bot_nav_galisa extends AppCompatActivity {


    BottomnavGalisaBinding NavBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NavBinding= DataBindingUtil.setContentView(this, R.layout.bottomnav_galisa);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //adding fragment to current activity
        Fragment fragmentg = new Home_galisa();
        fragmentTransaction.add(R.id.fragment_container_galisa, fragmentg);
        fragmentTransaction.commit();
        NavBinding.navigationg.setOnNavigationItemSelectedListener(navlistnerg);


    }


    public BottomNavigationView.OnNavigationItemSelectedListener navlistnerg =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    Fragment fragment=null;

                    switch (menuItem.getItemId()) {

                        case R.id.homeg:
                            fragment = new Home_galisa();
                            break;
                        case R.id.notificationsg:
                            fragment = new NotificationFragment();
                            break;
                        case R.id.messagesg:
                            fragment = new MessageFragment();
                            break;
                        case R.id.profile:
                            fragment = new Profile();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_galisa,
                            fragment).commit();
                    return true;
                }

            };

}
