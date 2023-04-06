package com.hridoy.a271navigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tablayout);


        FragmentManager fmanager = getSupportFragmentManager();
        FragmentTransaction ftransaction = fmanager.beginTransaction();
        ftransaction.add(R.id.framelayout, new Firstfragment());
        ftransaction.commit();



        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tabPosition = tab.getPosition();

                if (tabPosition == 0) {

                    FragmentManager fmanager = getSupportFragmentManager();
                    FragmentTransaction ftransaction = fmanager.beginTransaction();
                    ftransaction.add(R.id.framelayout, new Firstfragment());
                    ftransaction.commit();

                }

                else if (tabPosition == 1) {

                    FragmentManager fmanager = getSupportFragmentManager();
                    FragmentTransaction ftransaction = fmanager.beginTransaction();
                    ftransaction.add(R.id.framelayout,new SecondFragment());
                    ftransaction.commit();

                }

                 else if (tabPosition == 2) {

                    FragmentManager fmanager = getSupportFragmentManager();
                    FragmentTransaction ftransaction = fmanager.beginTransaction();
                    ftransaction.add(R.id.framelayout,new SecondFragment());
                    ftransaction.commit();

                }


            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


     /*
      button1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              FragmentManager fmanager = getSupportFragmentManager();
              FragmentTransaction ftransaction = fmanager.beginTransaction();
              ftransaction.add(R.id.framelayout,new Firstfragment());
              ftransaction.commit();
          }
      });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fmanager = getSupportFragmentManager();
                FragmentTransaction ftransaction = fmanager.beginTransaction();
                ftransaction.add(R.id.framelayout,new SecondFragment());
                ftransaction.commit();
            }
        });

      */

    }
}