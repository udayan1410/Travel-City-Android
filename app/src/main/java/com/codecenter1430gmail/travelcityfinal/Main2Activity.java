package com.codecenter1430gmail.travelcityfinal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class Main2Activity
        extends ActionBarActivity
{
    Intent i;
    AdView mAdView;
    InterstitialAd interstitialAd;
    CardView cv_chennai,cv_delhi,cv_hyderabad,cv_jaipur,cv_kolkata,cv_mumbai,cv_pune,cv_blore,cv_goa,cv_kerala;
    RelativeLayout d_bg,h_bg,j_bg,k_bg,m_bg,p_bg,b_bg,c_bg,goa_bg,kerala_bg;
    ArrayAdapter<String> adapter;
    ArrayList<String> city = new ArrayList();

    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Redcolor)));
        getSupportActionBar().setTitle("Travel City");

        final AdRequest adRequest = new AdRequest.Builder().build();
        interstitialAd = new InterstitialAd(this);



        cv_pune = ((CardView)findViewById(R.id.pune));
        cv_mumbai = ((CardView)findViewById(R.id.mumbai));
        cv_blore = ((CardView)findViewById(R.id.blore));
        cv_delhi = ((CardView)findViewById(R.id.delhi));
        cv_kolkata = ((CardView)findViewById(R.id.kolkata));
        cv_chennai = ((CardView)findViewById(R.id.chennai));
        cv_hyderabad = ((CardView)findViewById(R.id.hyderabad));
        cv_goa = (CardView)findViewById(R.id.goa);
        cv_kerala = (CardView)findViewById(R.id.kerala);


        cv_jaipur = ((CardView)findViewById(R.id.jaipur));
        p_bg = ((RelativeLayout)findViewById(R.id.pune_bg));
        m_bg = ((RelativeLayout)findViewById(R.id.mumbai_bg));
        d_bg = ((RelativeLayout)findViewById(R.id.delhi_bg));
        b_bg = ((RelativeLayout)findViewById(R.id.blore_bg));
        k_bg = ((RelativeLayout)findViewById(R.id.kolkata_bg));
        c_bg = ((RelativeLayout)findViewById(R.id.chennai_bg));
        h_bg = ((RelativeLayout)findViewById(R.id.hyderabad_bg));
        j_bg = ((RelativeLayout)findViewById(R.id.jaipur_bg));
        goa_bg = (RelativeLayout)findViewById(R.id.goa_bg);
        kerala_bg = (RelativeLayout)findViewById(R.id.kerala_bg);



        p_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.pune_infosys, 200, 200)));
        m_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.mumbaifinal, 200, 200)));
        d_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.delhifinal, 200, 200)));
        b_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.banglorefinal, 200, 200)));
        k_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.kolkatafinal, 200, 200)));
        c_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.chennaifinal, 200, 200)));
        h_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.hyderabad_final, 200, 200)));
        j_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.jaipurfinal, 200, 200)));
        goa_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.goa_edited, 200, 200)));
        kerala_bg.setBackground(new BitmapDrawable(getResources(), ImageScaler.decodeSampledBitmapFromResource(getResources(), R.drawable.kochi_final, 200, 200)));

        MobileAds.initialize(this, "ca-app-pub-1315104419551050/1819125896");
        this.mAdView = ((AdView)findViewById(R.id.adView));



        interstitialAd.setAdUnitId("ca-app-pub-1315104419551050/2932722977");
        interstitialAd.loadAd(adRequest);

        mAdView.loadAd(adRequest);


        this.cv_pune.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {

                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "pune");
                if(interstitialAd.isLoaded())
                    interstitialAd.show();
                else
                    Main2Activity.this.startActivity(i);


                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Main2Activity.this.startActivity(i);
                        interstitialAd.loadAd(adRequest);
                    }
                });

            }
        });


        this.cv_mumbai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "mumbai");
                if(interstitialAd.isLoaded())
                    interstitialAd.show();
                else
                Main2Activity.this.startActivity(i);

                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Main2Activity.this.startActivity(i);
                        interstitialAd.loadAd(adRequest);
                    }
                });



            }
        });
        this.cv_blore.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "blore");
                if(interstitialAd.isLoaded())
                    interstitialAd.show();
                else
                    Main2Activity.this.startActivity(i);

                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Main2Activity.this.startActivity(i);
                        interstitialAd.loadAd(adRequest);
                    }
                });


            }
        });
        this.cv_delhi.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "delhi");
                interstitialAd.show();
                Main2Activity.this.startActivity(i);

                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Main2Activity.this.startActivity(i);
                        interstitialAd.loadAd(adRequest);
                    }
                });

            }
        });
        this.cv_kolkata.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "kolkata");interstitialAd.show();
                if(interstitialAd.isLoaded())
                    interstitialAd.show();
                else
                    Main2Activity.this.startActivity(i);
            }
        });
        this.cv_chennai.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "chennai");
                interstitialAd.show();
                Main2Activity.this.startActivity(i);

                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Main2Activity.this.startActivity(i);
                        interstitialAd.loadAd(adRequest);
                    }
                });

            }
        });
        this.cv_hyderabad.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "hyderabad");
                if(interstitialAd.isLoaded())
                    interstitialAd.show();
                else
                    Main2Activity.this.startActivity(i);
                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Main2Activity.this.startActivity(i);
                        interstitialAd.loadAd(adRequest);
                    }
                });

            }
        });


        this.cv_jaipur.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "jaipur");

                if(interstitialAd.isLoaded())
                    interstitialAd.show();
                else
                    Main2Activity.this.startActivity(i);

                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Main2Activity.this.startActivity(i);
                        interstitialAd.loadAd(adRequest);
                    }
                });
            }
        });

        cv_goa.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "goa");
                if(interstitialAd.isLoaded())
                    interstitialAd.show();
                else
                    Main2Activity.this.startActivity(i);

                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Main2Activity.this.startActivity(i);
                        interstitialAd.loadAd(adRequest);
                    }
                });

            }
        });

        cv_kerala.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("City", "kochi");
                if(interstitialAd.isLoaded())
                    interstitialAd.show();
                else
                    Main2Activity.this.startActivity(i);

                interstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        Main2Activity.this.startActivity(i);
                        interstitialAd.loadAd(adRequest);
                    }
                });
            }
        });

    }




}
