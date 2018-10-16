package com.example.samfield.procreate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button loginbutton;
    private Button registractionbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadLoginFrag();
        loginbutton = findViewById(R.id.loginbutton);
        registractionbutton = findViewById(R.id.reg_button);


        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginbutton.setBackgroundResource(R.drawable.buttonsolidradius);
                registractionbutton.setBackgroundResource(R.drawable.buttonroundedboarder);
                registractionbutton.setTextColor(getResources().getColor(R.color.colorPrimary));
                loginbutton.setTextColor(getResources().getColor(R.color.colorWhite));
                loadLoginFrag();
            }
        });
        registractionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registractionbutton.setBackgroundResource(R.drawable.buttonsolidradius);
                loginbutton.setBackgroundResource(R.drawable.buttonroundedboarder);
                loginbutton.setTextColor(getResources().getColor(R.color.colorPrimary));
                registractionbutton.setTextColor(getResources().getColor(R.color.colorWhite));


                loadRegistrationFrag();
            }
        });


    }
    public void loadLoginFrag(){
        LoginFragment loginFragment = new LoginFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.form_frag,loginFragment);
        ft.commit();
    }
    public void loadRegistrationFrag(){
        RegistrationFragment registrationFragment = new RegistrationFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.form_frag,registrationFragment);
        ft.commit();
    }
}
