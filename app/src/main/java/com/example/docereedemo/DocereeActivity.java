package com.example.docereedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.doceree.androidadslibrary.ads.DocereeAdView;
import com.doceree.androidadslibrary.ads.DocereeMobileAds;
import com.doceree.androidadslibrary.networking.request.AdRequest;
import com.doceree.androidadslibrary.networking.request.Hcp;

public class DocereeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doceree);

        initComponents();
    }

    private  void initComponents(){
        doHcpLogin();
    }

    private void doHcpLogin() {

        final AdRequest adRequest = new AdRequest.AdRequestBuilder().build();
        DocereeAdView docereeAdView = findViewById(R.id.ad_view_banner);
        docereeAdView.loadAd(adRequest);

        Hcp hcp = new Hcp.HcpBuilder()
                .setFirstName("Nishi")
                .setLastName("Thakkar")
                .setSpecialization("Anesthesiology")
                .setCity("Ahmedabad")
                .setZipCode("380015")
                .setGender("FeMale")
                .setNpi("123456789")
                .setEmail("nishi.emedstore@gmail.com") // not mandatory
                .setMobile("9999999999") // not mandatory
                .build();
        DocereeMobileAds.getInstance().loginWith(hcp);
    }
}