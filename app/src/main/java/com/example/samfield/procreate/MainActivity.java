package com.example.samfield.procreate;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginbutton;
    private Button regswitchbtn;
    private Button registrationbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadLoginFrag();
        loginbutton = findViewById(R.id.loginbutton);
        regswitchbtn = findViewById(R.id.reg_button);



        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginbutton.setBackgroundResource(R.drawable.buttonroundedboarder);
                regswitchbtn.setBackgroundResource(R.drawable.buttonsolidradius);
                regswitchbtn.setTextColor(getResources().getColor(R.color.colorWhite));
                loginbutton.setTextColor(getResources().getColor(R.color.colorPrimary));
                loadLoginFrag();
            }
        });
        regswitchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regswitchbtn.setBackgroundResource(R.drawable.buttonroundedboarder);
                loginbutton.setBackgroundResource(R.drawable.buttonsolidradius);
                loginbutton.setTextColor(getResources().getColor(R.color.colorWhite));
                regswitchbtn.setTextColor(getResources().getColor(R.color.colorPrimary));


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

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.super.onBackPressed();
                        Intent intent = new Intent(MainActivity.this, Splash.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("EXIT", true);
                        startActivity(intent);
                    }
                }).create().show();
    }
}
