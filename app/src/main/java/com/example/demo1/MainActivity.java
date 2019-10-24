package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView home, profile, notification, chat, fire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = findViewById(R.id.home);
        profile = findViewById(R.id.profile);
        notification = findViewById(R.id.notification);
        chat = findViewById(R.id.chat);
        fire = findViewById(R.id.fire);

        home.setOnClickListener(this);
        profile.setOnClickListener(this);
        notification.setOnClickListener(this);
        chat.setOnClickListener(this);
        fire.setOnClickListener(this);

        HomeFragment homeFragment = new HomeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment_layout, homeFragment, homeFragment.getTag()).commit();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home:
                HomeFragment homeFragment = new HomeFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragment_layout, homeFragment, homeFragment.getTag()).commit();
                break;

            case R.id.profile:
                ProfileFragment profileFragment = new ProfileFragment();
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                fragmentManager1.beginTransaction().replace(R.id.fragment_layout, profileFragment, profileFragment.getTag()).commit();

                break;

            case R.id.notification:
                NotificationFragment notificationFragment = new NotificationFragment();
                FragmentManager fragmentManager2 = getSupportFragmentManager();
                fragmentManager2.beginTransaction().replace(R.id.fragment_layout, notificationFragment, notificationFragment.getTag()).commit();
                break;

            case R.id.chat:
                ChatFragment chatFragment = new ChatFragment();
                FragmentManager fragmentManager3 = getSupportFragmentManager();
                fragmentManager3.beginTransaction().replace(R.id.fragment_layout, chatFragment, chatFragment.getTag()).commit();
                break;

            case R.id.fire:
                FireFragment fireFragment = new FireFragment();
                FragmentManager fragmentManager4 = getSupportFragmentManager();
                fragmentManager4.beginTransaction().replace(R.id.fragment_layout, fireFragment, fireFragment.getTag()).commit();
                break;
        }
    }
}
