package com.codecenter1430gmail.travelcityfinal;

import android.support.v7.app.AppCompatActivity;
        import android.animation.ObjectAnimator;
        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.graphics.drawable.BitmapDrawable;
        import android.graphics.drawable.ColorDrawable;
        import android.media.Image;
        import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
        import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
        import android.support.v4.widget.NestedScrollView;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutCompat;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.ScrollView;
        import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import org.w3c.dom.Text;

        import java.util.ArrayList;



public class Main3Activity extends AppCompatActivity {


    TextView sPlaces,sFood,sShop,sHotel,sTransport;
    String city_name;
    ScrollView sv;
    AdView mAdView;
    ImageView welcomeimg;


    //Arraylists required
    public  ArrayList<String> mPlaces = new ArrayList<>();
    public  ArrayList<String> mPImageLink = new ArrayList<>();


    public ArrayList<String> mFood = new ArrayList<>();
    public  ArrayList<String> mFImageLink = new ArrayList<>();

    public ArrayList<String> mShop = new ArrayList<>();
    public  ArrayList<String> mSImageLink = new ArrayList<>();

    public ArrayList<String> mHotels = new ArrayList<>();
    public ArrayList<String>mHImageLink = new ArrayList<>();


    public ArrayList<String> mTransport = new ArrayList<>();
    public ArrayList<String> mTImageLink = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setTitle("TravelCity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);


        MobileAds.initialize(this, "ca-app-pub-1315104419551050/1819125896");
        this.mAdView = ((AdView)findViewById(R.id.adView));
        AdRequest adRequest = new AdRequest.Builder().build();
        this.mAdView.loadAd(adRequest);


        sv = (ScrollView)findViewById(R.id.sv);
        city_name = getIntent().getStringExtra("City");


        sPlaces = (TextView)findViewById(R.id.see_places);
        sFood = (TextView)findViewById(R.id.see_food);
        sShop = (TextView)findViewById(R.id.see_shop);
        sHotel = (TextView)findViewById(R.id.see_hotel);
        sTransport = (TextView)findViewById(R.id.see_transport);
        welcomeimg = (ImageView)findViewById(R.id.welcomeimg);

        sv.scrollTo(0,0);
        sv.smoothScrollTo(0,0);



        //City Name selection
        Adddata(city_name);



        sPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,FullView.class);
                i.putExtra("city_name",city_name);
                i.putExtra("category",1);
                startActivity(i);
            }
        });


        sFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,FullView.class);
                i.putExtra("city_name",city_name);
                i.putExtra("category",2);
                startActivity(i);
            }
        });

        sShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,FullView.class);
                i.putExtra("city_name",city_name);
                i.putExtra("category",3);
                startActivity(i);
            }
        });

        sHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,FullView.class);
                i.putExtra("city_name",city_name);
                i.putExtra("category",4);
                startActivity(i);
            }
        });

        sTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,FullView.class);
                i.putExtra("city_name",city_name);
                i.putExtra("category",5);
                startActivity(i);
            }
        });


    }

    //Adding data based on city
    void Adddata(String city)
    {

        switch(city)
        {
            case "pune":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.pune_edited,200,200));
                AddData2(1);
                break;

            case "mumbai":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.mumbai_edited,200,200));
                AddData2(2);
                break;

            case "delhi":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.delhi_edited,200,200));
                AddData2(3);
                break;

            case "blore":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.banglore_edited,200,200));
                AddData2(4);
                break;

            case "kolkata":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.kolkata_edited,200,200));
                AddData2(5);
                break;

            case "chennai":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.chennai_edited,200,200));
                AddData2(6);
                break;

            case "hyderabad":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.hyderabad_edited,200,200));
                AddData2(7);
                break;

            case "jaipur":
                welcomeimg.setImageBitmap(ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.jaipur_edited,200,200));
                AddData2(8);
                break;

            case "goa":
                welcomeimg.setImageResource(R.drawable.goafinal);//ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.goafinal,250,250));
                AddData2(9);
                break;

            case "kochi":
                welcomeimg.setImageResource(R.drawable.kochiedited);//ImageScaler.decodeSampledBitmapFromResource(getResources(),R.drawable.goafinal,250,250));
                AddData2(10);
                break;

        }

    }

    //Selecting only 4 things in
    void AddData2(int i)
    {
        switch(i)
        {
            case 1:

                //Code for setting place of the city


                mPImageLink.add("https://i.imgur.com/oYTly5B.jpg");
                mPlaces.add("Dagdusheth Temple");


                mPImageLink.add("https://i.imgur.com/seguaEY.jpg");
                mPlaces.add("LalMahal");


                mPImageLink.add("https://i.imgur.com/bErsYtp.jpg");
                mPlaces.add("Agakhan Palace");


                mPImageLink.add("https://i.imgur.com/I80KP5A.jpg");
                mPlaces.add("Sarasbaug");


                // Code for setting Food of the city


                mFImageLink.add("https://i.imgur.com/LsiCM92.jpg");
                mFood.add("Kayani Bakery");


                mFImageLink.add("https://i.imgur.com/TqF1L2c.jpg");
                mFood.add("Sujata Mastani");


                mFImageLink.add("https://i.imgur.com/5ojZhVb.jpg");
                mFood.add("Katakir");


                mFImageLink.add("https://i.imgur.com/p1qRjvm.jpg");
                mFood.add("Chitale Bandhu");


                // Code for setting shopping

                mSImageLink.add("https://i.imgur.com/apO2Ehw.jpg");
                mShop.add("Tulshi Baug");


                mSImageLink.add("https://i.imgur.com/vaWM5WG.jpg");
                mShop.add("F-Street");


                mSImageLink.add("https://i.imgur.com/YiccRwQ.jpg");
                mShop.add("FC Road");


                mSImageLink.add("https://i.imgur.com/0wafa8I.jpg");
                mShop.add("Phoenix Mall");

                //Code to set Hotels


                mHImageLink.add("https://i.imgur.com/KHsQB36.jpg");
                mHotels.add("Westin");


                mHImageLink.add("https://i.imgur.com/pP3XNI0.jpg");
                mHotels.add("JW Marriott");


                mHImageLink.add("https://i.imgur.com/WeUusPe.jpg");
                mHotels.add("Hyatt");


                mHImageLink.add("https://i.imgur.com/kJAH6S3.jpg");
                mHotels.add("Royal Orchid");


                //Code for setting transport


                mTImageLink.add("https://i.imgur.com/YDVVy0z.jpg");
                mTransport.add("Railway Station");


                mTImageLink.add("https://i.imgur.com/a0Q60um.jpg");
                mTransport.add("Airport");


                initRecyclerView();
                break;

            case 2:
                //Code for setting places

                mPImageLink.add("https://i.imgur.com/cfeSI3D.jpg");
                mPlaces.add("Marine Drive");


                mPImageLink.add("https://i.imgur.com/uZ8QKz2.jpg");
                mPlaces.add("Bandra-Worli SeaLink");


                mPImageLink.add("https://i.imgur.com/iRYgelW.jpg");
                mPlaces.add("Gateway of India");


                mPImageLink.add("https://i.imgur.com/8qi7LVl.jpg");
                mPlaces.add("Juhu Beach");

                //Code for food

                mFImageLink.add("https://i.imgur.com/3YhtqbB.jpg");
                mFood.add("Ashok vadapav");

                mFImageLink.add("https://i.imgur.com/2pFTyVt.jpg\"");
                mFood.add("Aswad");

                mFImageLink.add("https://i.imgur.com/hN5Cnaw.jpg");
                mFood.add("Punjabi Grill");

                mFImageLink.add("https://i.imgur.com/fselhuq.jpg");
                mFood.add("Cafe Mondegar");


                //Code for shopping

                mSImageLink.add("https://i.imgur.com/qksLZJr.jpg");
                mShop.add("Colaba Causeway");

                mSImageLink.add("https://i.imgur.com/HERK4VJ.jpg");
                mShop.add("Mangaldas Market");

                mSImageLink.add("https://i.imgur.com/HvHwSEg.jpg");
                mShop.add("Fashion Street");

                mSImageLink.add("https://i.imgur.com/YQCTw5T.jpg");
                mShop.add("Chorbazar");


                //Code to set Hotels

                mHImageLink.add("https://i.imgur.com/sNDew1w.jpg");
                mHotels.add("Taj");

                mHImageLink.add("https://i.imgur.com/ZvjomKd.jpg");
                mHotels.add("Oberoi");

                mHImageLink.add("https://i.imgur.com/hMrGmrE.jpg");
                mHotels.add("Trident");

                mHImageLink.add("https://i.imgur.com/9cLt43A.jpg");
                mHotels.add("Pride");


                //Code to set Transport

                mTImageLink.add("https://i.imgur.com/HqSYsdY.jpg");
                mTransport.add("Mumbai Airport");

                mTImageLink.add("https://i.imgur.com/BUgXLHX.jpg");
                mTransport.add("CST");

                mTImageLink.add("https://i.imgur.com/KOmBzDQ.jpg");
                mTransport.add("Mumbai Metro");

                mTImageLink.add("https://i.imgur.com/V9zA0fW.jpg");
                mTransport.add("Churchgate");

                initRecyclerView();
                break;

            case 3:
                //Code for setting places

                mPImageLink.add("https://i.imgur.com/0SpiLRw.jpg");
                mPlaces.add("Akshardham");


                mPImageLink.add("https://i.imgur.com/kX6lX11.jpg");
                mPlaces.add("Banglasahib Gurudwara");


                mPImageLink.add("https://i.imgur.com/pt2UxYB.jpg");
                mPlaces.add("Humayun's Tomb");


                mPImageLink.add("https://i.imgur.com/nCfQSWk.jpg");
                mPlaces.add("India Gate");


                //Code for setting food

                mFImageLink.add("https://i.imgur.com/qhM6qg6.jpg");
                mFood.add("Salim's Kebab");

                mFImageLink.add("https://i.imgur.com/EflaWCM.jpg");
                mFood.add("Shree Balaji Chat");

                mFImageLink.add("https://i.imgur.com/FJyjdMJ.jpg");
                mFood.add("Lalababu Chaat");

                mFImageLink.add("https://i.imgur.com/X1gcYcL.jpg");
                mFood.add("Bishan Swaroop");


                //Code for setting shopping

                mSImageLink.add("https://i.imgur.com/Ue7sh8b.jpg");
                mShop.add("Ambience Mall");

                mSImageLink.add("https://i.imgur.com/PaF9Jm7.jpg");
                mShop.add("Connaught Place");

                mSImageLink.add("https://i.imgur.com/QkxJF7m.jpg");
                mShop.add("Chandani Chowk");

                mSImageLink.add("https://i.imgur.com/XoMv9hr.jpg");
                mShop.add("Dilihaat");


                //Code for setting hotels

                mHImageLink.add("https://i.imgur.com/QrD4YeD.jpg");
                mHotels.add("Leroi");

                mHImageLink.add("https://i.imgur.com/H8fRtzU.jpg");
                mHotels.add("JW Marriott ");

                mHImageLink.add("https://i.imgur.com/a5OYtLy.jpg");
                mHotels.add("ITC Maurya");

                mHImageLink.add("https://i.imgur.com/PC5j7n6.jpg");
                mHotels.add("Taj Mahal");



                //Code for setting transport

                mTImageLink.add("https://i.imgur.com/0JBwCCk.jpg");
                mTransport.add("Chandni Chowk Metro");

                mTImageLink.add("https://i.imgur.com/rAMSAs0.jpg");
                mTransport.add("Indira Gandhi Airport");

                mTImageLink.add("https://i.imgur.com/tyPGmoy.jpg");
                mTransport.add("New Delhi Station");

                mTImageLink.add("https://i.imgur.com/PJRT3ye.jpg");
                mTransport.add("Old Delhi Station");

                initRecyclerView();
                break;


            case 4:
                //Places top visit in banglore

                mPImageLink.add("https://i.imgur.com/l9U4ucc.jpg");
                mPlaces.add("Banglore Palace");


                mPImageLink.add("https://i.imgur.com/LFb2u8x.jpg");
                mPlaces.add("Banerghatta Park");


                mPImageLink.add("https://i.imgur.com/t9falF3.jpg");
                mPlaces.add("Cubbon Park");


                mPImageLink.add("https://i.imgur.com/qnx33M5.jpg");
                mPlaces.add("Innovative Film City");

                // Food in banglore
                mFImageLink.add("https://i.imgur.com/RECq4vz.jpg");
                mFood.add("Puchkas");

                mFImageLink.add("https://i.imgur.com/0zktr70.jpg");
                mFood.add("Punjab Pleasures");

                mFImageLink.add("https://i.imgur.com/mPn2LyI.jpg");
                mFood.add("Dakshin ");

                mFImageLink.add("https://i.imgur.com/eNoaLKO.jpg");
                mFood.add("Koshy's Bar and Restro");



                //Code for setting shops
                mSImageLink.add("https://i.imgur.com/cIW8q1T.jpg");
                mShop.add("Basavana Gudi");

                mSImageLink.add("https://i.imgur.com/K4tWui9.jpg");
                mShop.add("Brigade Road");

                mSImageLink.add("https://i.imgur.com/Aa1lcvj.jpg");
                mShop.add("Chick Pet");

                mSImageLink.add("https://i.imgur.com/Gtsuxjj.jpg");
                mShop.add("Commercial Street");


                //Code for setting Hotels

                mHImageLink.add("https://i.imgur.com/ZJ2bYEV.jpg");
                mHotels.add("Golden Residency");

                mHImageLink.add("https://i.imgur.com/XYHjcX6.jpg");
                mHotels.add("HM Suites");

                mHImageLink.add("https://i.imgur.com/KcCRqDi.jpg");
                mHotels.add("ITC Windsor");

                mHImageLink.add("https://i.imgur.com/YXgKaql.jpg");
                mHotels.add("Lalit Ashok");


                //Code for setting transport

                mTImageLink.add("https://i.imgur.com/tfkvBzX.jpg");
                mTransport.add("Banglore Airport");

                mTImageLink.add("https://i.imgur.com/RBEZGwi.jpg");
                mTransport.add("Banglore Railway Station");

                mTImageLink.add("https://i.imgur.com/zFMF4MO.jpg");
                mTransport.add("Banglore Metro");

                mTImageLink.add("https://i.imgur.com/2o36X3q.jpg");
                mTransport.add("Yeshvantpur");

                initRecyclerView();
                break;


            case 5:
                //Code for setting places kolkata


                mPImageLink.add("https://i.imgur.com/02cRghn.jpg");
                mPlaces.add("Belur Math");

                mPImageLink.add("https://i.imgur.com/GQoPjBE.jpg");
                mPlaces.add("Fort William");


                mPImageLink.add("https://i.imgur.com/Qu3m1xe.jpg");
                mPlaces.add("Howrah Bridge");


                mPImageLink.add("https://i.imgur.com/coy8I8V.jpg");
                mPlaces.add("Alipore Zoo");


                //Code for setting food

                mFImageLink.add("https://i.imgur.com/0UnqV7i.jpg");
                mFood.add("Ganguram Sweets");

                mFImageLink.add("https://i.imgur.com/KUAN7Wo.jpg");
                mFood.add("Oh! Calcutta");

                mFImageLink.add("https://i.imgur.com/EAL4rlS.jpg");
                mFood.add("6 Ballygunge Place");

                mFImageLink.add("https://i.imgur.com/0ZhUp90.jpg");
                mFood.add("Bohemian");


                //Code for setting shops kolkata

                mSImageLink.add("https://i.imgur.com/rfrjYRe.jpg");
                mShop.add("College Street");

                mSImageLink.add("https://i.imgur.com/ffKrfbI.jpg");
                mShop.add("Bura Bazar");

                mSImageLink.add("https://i.imgur.com/r9y0wfV.jpg");
                mShop.add("Phool Bazaar");

                mSImageLink.add("https://i.imgur.com/KGHwfqn.jpg");
                mShop.add("Gariahat");



                //Hotels in kolkata

                mHImageLink.add("https://i.imgur.com/oSDEgfo.jpg");
                mHotels.add("De Sovrani");

                mHImageLink.add("https://i.imgur.com/6j7wdKp.jpg");
                mHotels.add("Novotel ");

                mHImageLink.add("https://i.imgur.com/n3eGcxj.jpg");
                mHotels.add("Park Prime");

                mHImageLink.add("https://i.imgur.com/bSJtuBO.jpg");
                mHotels.add("Pipal Tree");


                //Transport

                mTImageLink.add("https://i.imgur.com/o0Spu7S.jpg");
                mTransport.add("Kolkata Airport");

                mTImageLink.add("https://i.imgur.com/CuwIxIY.jpg");
                mTransport.add("Howrah Station");

                mTImageLink.add("https://i.imgur.com/VhFv5sf.jpg");
                mTransport.add("Kolkata Metro");

                initRecyclerView();
                break;

            case 6:
                //Code for setting places to visit in Chennai

                mPImageLink.add("https://i.imgur.com/VFzxEmM.jpg");
                mPlaces.add("Arignaranna Zoo");


                mPImageLink.add("https://i.imgur.com/ArlgVMK.jpg");
                mPlaces.add("Birla Planetarium");


                mPImageLink.add("https://i.imgur.com/Gu7rptK.jpg");
                mPlaces.add("Elliot Beach");


                mPImageLink.add("https://i.imgur.com/SvLxVHH.jpg");
                mPlaces.add("Fort St George");


                //Code for setting food
                mFImageLink.add("https://i.imgur.com/2pEZgi0.jpg");
                mFood.add("Anna Laxmi");

                mFImageLink.add("https://i.imgur.com/MWSUjz5.jpg");
                mFood.add("Barbeque Nation");

                mFImageLink.add("https://i.imgur.com/Npvi32p.jpg");
                mFood.add("Benjarong");

                mFImageLink.add("https://i.imgur.com/oFWcysE.jpg");
                mFood.add("Bombay Lassi");

                //Code for setting shops

                mSImageLink.add("https://i.imgur.com/tZIZDQQ.jpg");
                mShop.add("Abirami Mall");

                mSImageLink.add("https://i.imgur.com/H22dSiA.jpg");
                mShop.add("Express Avenue");

                mSImageLink.add("https://i.imgur.com/fx64jLs.jpg");
                mShop.add("Nungam Bakkam");

                mSImageLink.add("https://i.imgur.com/aKJ7jdJ.jpg");
                mShop.add("Parrys Corner");



                //Hotels

                mHImageLink.add("https://i.imgur.com/uplgvwT.jpg");
                mHotels.add("Belstead");

                mHImageLink.add("https://i.imgur.com/0A9jxOO.jpg");
                mHotels.add("ITC Grand Chola");

                mHImageLink.add("https://i.imgur.com/QWnrDT0.jpg");
                mHotels.add("Pandian");

                mHImageLink.add("https://i.imgur.com/uLF8KcO.jpg");
                mHotels.add("Park Hyatt");

                //Transport

                mTImageLink.add("https://i.imgur.com/vBLZWL8.jpg");
                mTransport.add("Chennai Airport");

                mTImageLink.add("https://i.imgur.com/HYVyvDR.jpg");
                mTransport.add("Central Railway Station");

                mTImageLink.add("https://i.imgur.com/4VYhh60.jpg");
                mTransport.add("Egmore");

                mTImageLink.add("https://i.imgur.com/lzMlaXO.jpg");
                mTransport.add("Chennai Metro");

                initRecyclerView();
                break;




            case 7:
                //Places in hyderabad


                mPImageLink.add("https://i.imgur.com/SumgjTr.jpg");
                mPlaces.add("Charminar");


                mPImageLink.add("https://i.imgur.com/pvTpUGw.jpg");
                mPlaces.add("Ramoji Film City");


                mPImageLink.add("https://i.imgur.com/qOvLKfw.jpg");
                mPlaces.add("Hussain Sagar");


                mPImageLink.add("https://i.imgur.com/EEqHghH.jpg");
                mPlaces.add("Salar Jung Museum");


                //Food in hyderabad

                mFImageLink.add("https://i.imgur.com/hxLDsdV.jpg");
                mFood.add("Paradise Biryani");

                mFImageLink.add("https://i.imgur.com/3kthYGj.jpg");
                mFood.add("Chutneys");

                mFImageLink.add("https://i.imgur.com/49DQYFb.jpg");
                mFood.add("Jash e Audh");

                mFImageLink.add("https://i.imgur.com/uc9ADDE.jpg");
                mFood.add("Ohm");

                //Shopping in hyderabad

                mSImageLink.add("https://i.imgur.com/6RwFKpF.jpg");
                mShop.add("Begum Bazar");

                mSImageLink.add("https://i.imgur.com/YxeNhdo.jpg");
                mShop.add("KOTI");

                mSImageLink.add("https://i.imgur.com/LZAFvaq.jpg");
                mShop.add("Nampally");

                mSImageLink.add("https://i.imgur.com/iK8ja18.jpg");
                mShop.add("Tobaco Bazar");



                //Hotels in hyderabad



                mHImageLink.add("https://i.imgur.com/dLkhMXI.jpg");
                mHotels.add("ITC Kakatiya");


                mHImageLink.add("https://i.imgur.com/5NjEKsO.jpg");
                mHotels.add("Trident ");

                mHImageLink.add("https://i.imgur.com/VPIu32c.jpg");
                mHotels.add("Westin ");

                mHImageLink.add("https://i.imgur.com/dpAXJOL.jpg");
                mHotels.add("Taj Banjara");

                //Transport in hyderabad


                mTImageLink.add("https://i.imgur.com/KqQgbFw.jpg");
                mTransport.add("Secunderabad");

                mTImageLink.add("https://i.imgur.com/qmSUy06.jpg");
                mTransport.add("Hyderabad Metro");

                mTImageLink.add("https://i.imgur.com/5IsrLjF.jpg");
                mTransport.add("Rajiv Gandhi Airport");

                initRecyclerView();
                break;


            case 8:
                //Places in jaipur


                mPImageLink.add("https://i.imgur.com/IDpNlDG.jpg");
                mPlaces.add("Hawa Mahal");


                mPImageLink.add("https://i.imgur.com/0BYjGm9.jpg");
                mPlaces.add("Jaigarh Fort");


                mPImageLink.add("https://i.imgur.com/rr9KXqn.jpg");
                mPlaces.add("Amber Fort");


                mPImageLink.add("https://i.imgur.com/nocwezg.jpg");
                mPlaces.add("Jal Mahal");


                //Food in hyderabad

                mFImageLink.add("https://i.imgur.com/eiy7kVr.jpg");
                mFood.add("1135 AD");

                mFImageLink.add("https://i.imgur.com/Ds4ZX7J.jpg");
                mFood.add("Suvarna Mahal");

                mFImageLink.add("https://i.imgur.com/deAGLDC.jpg");
                mFood.add("Peacock Rooftop");

                mFImageLink.add("https://i.imgur.com/VHPSAt4.jpg");
                mFood.add("Laksmi Misthan");

                //Shopping in jaipur

                mSImageLink.add("https://i.imgur.com/MFhUusK.jpg");
                mShop.add("World Trade Park");

                mSImageLink.add("https://i.imgur.com/C4UhOE3.jpg");
                mShop.add("Pink Square Mall");

                mSImageLink.add("https://i.imgur.com/CTiM6bo.jpg");
                mShop.add("Nehru Bazar");

                mSImageLink.add("https://i.imgur.com/9iXXG04.jpg");
                mShop.add("Kishan Poli Bazar");


                //Hotels in jaipur


                mHImageLink.add("https://i.imgur.com/7zlGNFp.jpg");
                mHotels.add("Radison Blu");

                mHImageLink.add("https://i.imgur.com/b5EdHL5.jpg");
                mHotels.add("Lalit");

                mHImageLink.add("https://i.imgur.com/BEKJHIb.jpg");
                mHotels.add("Oberoi Raj Vilas");

                mHImageLink.add("https://i.imgur.com/DhJxblz.jpg");
                mHotels.add("Ramada");

                //Transport in jaipur


                mTImageLink.add("https://i.imgur.com/tv4cc45.jpg");
                mTransport.add("Jaipur Airport");

                mTImageLink.add("https://i.imgur.com/HHGIk1H.jpg");
                mTransport.add("Jaipur Railway Station");

                mTImageLink.add("https://i.imgur.com/tX2Gvjr.jpg");
                mTransport.add("Jaipur Metro");

                initRecyclerView();
                break;


            case 9:

            //Places in goa

            mPImageLink.add("https://i.imgur.com/9GySYiG.jpg");
            mPlaces.add("Arambol Beach");


            mPImageLink.add("https://i.imgur.com/GXcebrj.jpg");
            mPlaces.add("Baga Beach");


            mPImageLink.add("https://i.imgur.com/0glmufP.jpg");
            mPlaces.add("Dudhsagar Waterfalls");


            mPImageLink.add("https://i.imgur.com/AKhCa9D.jpg");
            mPlaces.add("St. Cajetan Church");


            //Food in goa

            mFImageLink.add("https://i.imgur.com/500Ry6u.jpg");
            mFood.add("Ciao Bella");

            mFImageLink.add("https://i.imgur.com/45Vqdcp.jpg");
            mFood.add("Crab");

            mFImageLink.add("https://i.imgur.com/Gpb5EIs.jpg");
            mFood.add("Fish N Feni");

            mFImageLink.add("https://i.imgur.com/cBSH22L.jpg");
            mFood.add("Ambot Tik");

            //Shopping in goa

            mSImageLink.add("https://i.imgur.com/MsScLrM.jpg");
            mShop.add("Anjuna Flea Market");

            mSImageLink.add("https://i.imgur.com/7yPNS9E.jpg");
            mShop.add("Bombay Bazaar");

            mSImageLink.add("https://i.imgur.com/AW0KBW4.jpg");
            mShop.add("Calungute Market");

            mSImageLink.add("https://i.imgur.com/pQTYsx6.jpg");
            mShop.add("Mall de Goa");


            //Hotels in goa


            mHImageLink.add("https://i.imgur.com/FVJjErI.jpg");
            mHotels.add("Silver Sand");


            mHImageLink.add("https://i.imgur.com/EsMhqag.jpg");
            mHotels.add("Horizon");

            mHImageLink.add("https://i.imgur.com/RbSTRTz.jpg");
            mHotels.add("The banyan Soul");

            mHImageLink.add("https://i.imgur.com/OfcfoCr.jpg");
            mHotels.add("Treebo");

            //Transport in goa


            mTImageLink.add("https://i.imgur.com/awFd7Up.jpg");
            mTransport.add("Dabolim Airport");

            mTImageLink.add("https://i.imgur.com/7vPqcl7.jpg");
            mTransport.add("Goa Railway Station");

            initRecyclerView();
            break;

            case 10:

                //Places in Kochi

                mPImageLink.add("https://i.imgur.com/1U7WSQz.jpg");
                mPlaces.add("Cherai Beach");

                mPImageLink.add("https://i.imgur.com/D9i9o2f.jpg");
                mPlaces.add("Chottanikara temple");

                mPImageLink.add("https://i.imgur.com/o8TIvqU.jpg");
                mPlaces.add("Santa Cruz Basilica");

                mPImageLink.add("https://i.imgur.com/3WSH0vN.jpg");
                mPlaces.add("Mattan Cherry Palace");

                //Food in kochi

                mFImageLink.add("https://i.imgur.com/6SpElJq.jpg");
                mFood.add("Arcanova");

                mFImageLink.add("https://i.imgur.com/Bo1AuFD.jpg");
                mFood.add("The Rice Boat Vivanta");

                mFImageLink.add("https://i.imgur.com/S6sdczL.jpg");
                mFood.add("Malabar Junction");

                mFImageLink.add("https://i.imgur.com/6WXDN6V.jpg");
                mFood.add("Kashi Art Cafe");

                //Shopping in kochi

                mSImageLink.add("https://i.imgur.com/M0zw1KA.jpg");
                mShop.add("Bazar Road");

                mSImageLink.add("https://i.imgur.com/bsbHkiY.jpg");
                mShop.add("Broadway");

                mSImageLink.add("https://i.imgur.com/rDIvmhz.jpg");
                mShop.add("MG road");

                mSImageLink.add("https://i.imgur.com/nCO1Sd2.jpg");
                mShop.add("Oberon Mall");


                //Hotels in kochi


                mHImageLink.add("https://i.imgur.com/3GK6Wuq.jpg");
                mHotels.add("Brunton BoatYard");

                mHImageLink.add("https://i.imgur.com/nAf2U3A.jpg");
                mHotels.add("Casino Hotel");

                mHImageLink.add("https://i.imgur.com/9PIJcvD.jpg");
                mHotels.add("Hotel Aishwarya");

                mHImageLink.add("https://i.imgur.com/T03UbEu.jpg");
                mHotels.add("Crowne Plaza");

                //Transport in kochi


                mTImageLink.add("https://i.imgur.com/2L3aOrd.jpg");
                mTransport.add("Cochin International Airport");

                mTImageLink.add("https://i.imgur.com/7vPqcl7.jpg");
                mTransport.add("Ernakullam Junction");

                initRecyclerView();
                break;

        }

    }




    //Converting all drawable images to bitmap images
    private void initRecyclerView() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(layoutManager);
        Recycler_glide adapter = new Recycler_glide(this, mPlaces, mPImageLink);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.recycler2);
        recyclerView2.setLayoutManager(layoutManager2);
        Recycler_glide2 adapter2 = new Recycler_glide2(this, mFood, mFImageLink);
        recyclerView2.setAdapter(adapter2);

        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.recycler3);
        recyclerView3.setLayoutManager(layoutManager3);
        Recycler_glide3 adapter3 = new Recycler_glide3(this, mShop, mSImageLink);
        recyclerView3.setAdapter(adapter3);

        LinearLayoutManager layoutManager4 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView4 = (RecyclerView) findViewById(R.id.recycler4);
        recyclerView4.setLayoutManager(layoutManager4);
        Recycler_glide4 adapter4 = new Recycler_glide4(this, mHotels, mHImageLink);
        recyclerView4.setAdapter(adapter4);

        LinearLayoutManager layoutManager5 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView5 = (RecyclerView) findViewById(R.id.recycler5);
        recyclerView5.setLayoutManager(layoutManager5);
        Recycler_glide5 adapter5 = new Recycler_glide5(this, mTransport,mTImageLink);
        recyclerView5.setAdapter(adapter5);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
