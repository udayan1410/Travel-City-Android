package com.codecenter1430gmail.travelcityfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


public class FullView extends AppCompatActivity {

    String city_name;
    AutoCompleteTextView textView;
    int category;
    RecyclerViewAdapter_Final adapter;
    ImageView back;
    public ArrayList<String> mCommon = new ArrayList<>();
    public ArrayList<String> mCommonLink = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);

        getSupportActionBar().hide();
        back = (ImageView)findViewById(R.id.back_btn);

        textView = (AutoCompleteTextView)findViewById(R.id.editText1);
        city_name = getIntent().getStringExtra("city_name");
        category = getIntent().getIntExtra("category", 0);




        switch (city_name) {

            case "pune":

                switch (category) {
                    case 1:
                        mCommonLink.add("https://i.imgur.com/oYTly5B.jpg");
                        mCommon.add("Dagdusheth Temple");

                        mCommonLink.add("https://i.imgur.com/seguaEY.jpg");
                        mCommon.add("LalMahal");

                        mCommonLink.add("https://i.imgur.com/bErsYtp.jpg");
                        mCommon.add("Agakhan Palace");

                        mCommonLink.add("https://i.imgur.com/I80KP5A.jpg");
                        mCommon.add("Sarasbaug");

                        mCommonLink.add("https://i.imgur.com/exzP2p9.jpg");
                        mCommon.add("Shaniwarwada");

                        mCommonLink.add("https://i.imgur.com/a0GEjnK.jpg");
                        mCommon.add("Sinhgad Fort");

                        mCommonLink.add("https://i.imgur.com/d4Vj2Z4.jpg");
                        mCommon.add("Lavasa");

                        mCommonLink.add("https://i.imgur.com/KQH7joe.jpg");
                        mCommon.add("Lonavla");

                        mCommonLink.add("https://i.imgur.com/iTU65PK.jpg");
                        mCommon.add("Blades Of Glory");

                        break;


                    case 2:
                        mCommonLink.add("https://i.imgur.com/LsiCM92.jpg");
                        mCommon.add("Kayani Bakery");

                        mCommonLink.add("https://i.imgur.com/TqF1L2c.jpg");
                        mCommon.add("Sujata Mastani");

                        mCommonLink.add("https://i.imgur.com/52SyhUw.jpg");
                        mCommon.add("Katakir");

                        mCommonLink.add("https://i.imgur.com/p1qRjvm.jpg");
                        mCommon.add("Chitale Bandhu");

                        mCommonLink.add("https://i.imgur.com/YqyO9sP.jpg");
                        mCommon.add("Vaishali");

                        mCommonLink.add("https://i.imgur.com/b2142Xc.jpg");
                        mCommon.add("German Bakery");

                        mCommonLink.add("https://i.imgur.com/7zhuIqa.jpg");
                        mCommon.add("Agent Jack");

                        mCommonLink.add("https://i.imgur.com/We4zwCv.jpg");
                        mCommon.add("Miami");

                        mCommonLink.add("https://i.imgur.com/h2P9gHV.jpg");
                        mCommon.add("Mix 36");

                        mCommonLink.add("https://i.imgur.com/CpTEKfP.jpg");
                        mCommon.add("Penthouze");


                        break;


                    case 3:
                        mCommonLink.add("https://i.imgur.com/apO2Ehw.jpg");
                        mCommon.add("Tulshi Baug");

                        mCommonLink.add("https://i.imgur.com/vaWM5WG.jpg");
                        mCommon.add("F-Street");

                        mCommonLink.add("https://i.imgur.com/YiccRwQ.jpg");
                        mCommon.add("FC Road");

                        mCommonLink.add("https://i.imgur.com/mVD8RhM.jpg");
                        mCommon.add("Hong Kong Lane");

                        mCommonLink.add("https://i.imgur.com/rpCJI57.jpg");
                        mCommon.add("Appa Balvant Chowk");

                        mCommonLink.add("https://i.imgur.com/H4413sP.jpg");
                        mCommon.add("Juna Bazar");

                        mCommonLink.add("https://i.imgur.com/6r7mf8G.jpg");
                        mCommon.add("Amanora");

                        mCommonLink.add("https://i.imgur.com/gFrAR0E.jpg");
                        mCommon.add("Seasons Mall");

                        mCommonLink.add("https://i.imgur.com/0wafa8I.jpg");
                        mCommon.add("Phoenix Mall");


                        break;


                    case 4:

                        mCommonLink.add("https://i.imgur.com/KHsQB36.jpg");
                        mCommon.add("Westin");

                        mCommonLink.add("https://i.imgur.com/pP3XNI0.jpg");
                        mCommon.add("JW Marriott");

                        mCommonLink.add("https://i.imgur.com/WeUusPe.jpg");
                        mCommon.add("Hyatt");

                        mCommonLink.add("https://i.imgur.com/kJAH6S3.jpg");
                        mCommon.add("Royal Orchid");

                        mCommonLink.add("https://i.imgur.com/J1Q62T7.jpg");
                        mCommon.add("Conrad");

                        mCommonLink.add("https://i.imgur.com/kJ0Y5E4.jpg");
                        mCommon.add("Novotel");

                        break;


                    case 5:
                        mCommonLink.add("https://i.imgur.com/YDVVy0z.jpg");
                        mCommon.add("Railway Station");

                        mCommonLink.add("https://i.imgur.com/a0Q60um.jpg");
                        mCommon.add("Airport");
                        break;

                }

                setData();
                break;


            case "mumbai":


                switch (category) {
                    case 1:
                        mCommonLink.add("https://i.imgur.com/cfeSI3D.jpg");
                        mCommon.add("Marine Drive");

                        mCommonLink.add("https://i.imgur.com/uZ8QKz2.jpg");
                        mCommon.add("Bandra-Worli SeaLink");

                        mCommonLink.add("https://i.imgur.com/iRYgelW.jpg");
                        mCommon.add("Gateway of India");

                        mCommonLink.add("https://i.imgur.com/8qi7LVl.jpg");
                        mCommon.add("Juhu Beach");

                        mCommonLink.add("https://i.imgur.com/DdHUqup.jpg");
                        mCommon.add("Haji Ali Dargah");

                        mCommonLink.add("https://i.imgur.com/MP8cbH5.jpg");
                        mCommon.add("Elephanta Caves");

                        mCommonLink.add("https://i.imgur.com/GItpEMH.jpg");
                        mCommon.add("Science Center");

                        mCommonLink.add("https://i.imgur.com/1UIScjt.jpg");
                        mCommon.add("Essel World");

                        mCommonLink.add("https://i.imgur.com/DTsQgLr.jpg");
                        mCommon.add("Wax Museum");

                        mCommonLink.add("https://i.imgur.com/QwullIi.jpg");
                        mCommon.add("Siddhivinayak");

                        break;


                    case 2:
                        mCommonLink.add("https://i.imgur.com/3YhtqbB.jpg");
                        mCommon.add("Ashok vadapav");

                        mCommonLink.add("https://i.imgur.com/2pFTyVt.jpg");
                        mCommon.add("Aswad");

                        mCommonLink.add("https://i.imgur.com/hN5Cnaw.jpg");
                        mCommon.add("Punjabi Grill");

                        mCommonLink.add("https://i.imgur.com/fselhuq.jpg");
                        mCommon.add("Cafe Mondegar");

                        mCommonLink.add("https://i.imgur.com/9ypFdVa.jpg");
                        mCommon.add("Estella");

                        mCommonLink.add("https://i.imgur.com/ZNigZnQ.jpg");
                        mCommon.add("Pizza by the bay");

                        mCommonLink.add("https://i.imgur.com/lLCdBmH.jpg");
                        mCommon.add("Sanchos");

                        mCommonLink.add("https://i.imgur.com/WN5gzPd.jpg");
                        mCommon.add("Tasting Room");

                        mCommonLink.add("https://i.imgur.com/pygwFg3.jpg");
                        mCommon.add("Aer");

                        break;


                    case 3:
                        mCommonLink.add("https://i.imgur.com/qksLZJr.jpg");
                        mCommon.add("Colaba Causeway");

                        mCommonLink.add("https://i.imgur.com/HERK4VJ.jpg");
                        mCommon.add("Mangaldas Market");

                        mCommonLink.add("https://i.imgur.com/HvHwSEg.jpg");
                        mCommon.add("Fashion Street");

                        mCommonLink.add("https://i.imgur.com/YQCTw5T.jpg");
                        mCommon.add("Chorbazar");

                        mCommonLink.add("https://i.imgur.com/I2BsXga.jpg");
                        mCommon.add("Crawford Market");

                        mCommonLink.add("https://i.imgur.com/nIudWQG.jpg");
                        mCommon.add("Manish Market");

                        mCommonLink.add("https://i.imgur.com/XUsjAG9.jpg");
                        mCommon.add("R City Mall");

                        mCommonLink.add("https://i.imgur.com/svdfeyp.jpg");
                        mCommon.add("Sea Woods Mall");

                        mCommonLink.add("https://i.imgur.com/kRtMbio.jpg");
                        mCommon.add("Inorbit Mall");

                        mCommonLink.add("https://i.imgur.com/6JHpArz.jpg");
                        mCommon.add("High Phoenix");

                        mCommonLink.add("https://i.imgur.com/WQWNVyr.jpg");
                        mCommon.add("Vivian Mall");
                        break;


                    case 4:
                        mCommonLink.add("https://i.imgur.com/sNDew1w.jpg");
                        mCommon.add("Taj");

                        mCommonLink.add("https://i.imgur.com/ZvjomKd.jpg");
                        mCommon.add("Oberoi");

                        mCommonLink.add("https://i.imgur.com/hMrGmrE.jpg");
                        mCommon.add("Trident");

                        mCommonLink.add("https://i.imgur.com/9cLt43A.jpg");
                        mCommon.add("Pride");

                        mCommonLink.add("https://i.imgur.com/uDlnBF9.jpg");
                        mCommon.add("Hyatt ");

                        mCommonLink.add("https://i.imgur.com/JqIUJye.jpg");
                        mCommon.add("Siesta");

                        mCommonLink.add("https://i.imgur.com/lIUlT8a.jpg");
                        mCommon.add("Atlas Plaza");

                        break;


                    case 5:


                        mCommonLink.add("https://i.imgur.com/HqSYsdY.jpg");
                        mCommon.add("Mumbai Airport");

                        mCommonLink.add("https://i.imgur.com/BUgXLHX.jpg");
                        mCommon.add("CST");

                        mCommonLink.add("https://i.imgur.com/KOmBzDQ.jpg");
                        mCommon.add("Mumbai Metro");

                        mCommonLink.add("https://i.imgur.com/V9zA0fW.jpg");
                        mCommon.add("Churchgate");

                        mCommonLink.add("https://i.imgur.com/hIdbC5q.jpg");
                        mCommon.add("Kalyan");

                        mCommonLink.add("https://i.imgur.com/sduJq6E.jpg");
                        mCommon.add("Thane");


                        break;
                }
                setData();
                break;


            case "delhi":


                switch (category) {
                    case 1:
                        mCommonLink.add("https://i.imgur.com/0SpiLRw.jpg");
                        mCommon.add("Akshardham");

                        mCommonLink.add("https://i.imgur.com/kX6lX11.jpg");
                        mCommon.add("Banglasahib Gurudwara");

                        mCommonLink.add("https://i.imgur.com/pt2UxYB.jpg");
                        mCommon.add("Humayun's Tomb");

                        mCommonLink.add("https://i.imgur.com/nCfQSWk.jpg");
                        mCommon.add("India Gate");

                        mCommonLink.add("https://i.imgur.com/BTxhaAM.jpg");
                        mCommon.add("Jama Masjid");

                        mCommonLink.add("https://i.imgur.com/9pgKA2D.jpg");
                        mCommon.add("Jantar Mantar");

                        mCommonLink.add("https://i.imgur.com/JVlDWqI.jpg");
                        mCommon.add("Lotus Temple");

                        mCommonLink.add("https://i.imgur.com/fXTAURt.jpg");
                        mCommon.add("RedFort");

                        mCommonLink.add("https://i.imgur.com/3t1CUUS.jpg");
                        mCommon.add("Safdarjung's Tomb");

                        mCommonLink.add("https://i.imgur.com/FA3FYmg.jpg");
                        mCommon.add("Science Center ");

                        mCommonLink.add("https://i.imgur.com/nQt5Cgy.jpg");
                        mCommon.add("Qutubminar");

                        mCommonLink.add("https://i.imgur.com/NlIl284.jpg");
                        mCommon.add("Rajghat");

                        mCommonLink.add("https://i.imgur.com/kXNoHWO.jpg");
                        mCommon.add("Rashtrapati Bhavan");

                        mCommonLink.add("https://i.imgur.com/Up9fYY8.jpg");
                        mCommon.add("National Rail Museum");




                        break;


                    case 2:

                        mCommonLink.add("https://i.imgur.com/qhM6qg6.jpg");
                        mCommon.add("Salim's Kebab");

                        mCommonLink.add("https://i.imgur.com/EflaWCM.jpg");
                        mCommon.add("Shree Balaji Chat");

                        mCommonLink.add("https://i.imgur.com/FJyjdMJ.jpg");
                        mCommon.add("Lalababu Chaat");

                        mCommonLink.add("https://i.imgur.com/X1gcYcL.jpg");
                        mCommon.add("Bishan Swaroop");

                        mCommonLink.add("https://i.imgur.com/a0Q7qNY.jpg");
                        mCommon.add("Bukhara");

                        mCommonLink.add("https://i.imgur.com/j5tRBVl.jpg");
                        mCommon.add("Chorbizzare");

                        mCommonLink.add("https://i.imgur.com/USdYNWr.jpg");
                        mCommon.add("Lord of drinks");

                        mCommonLink.add("https://i.imgur.com/Tez5MKD.jpg");
                        mCommon.add("The big Yellow door");

                        mCommonLink.add("https://i.imgur.com/WNV0IGP.jpg");
                        mCommon.add("Paranthe wali gali");

                        mCommonLink.add("https://i.imgur.com/fF7DClq.jpg");
                        mCommon.add("Punjabi Grill ");

                        mCommonLink.add("https://i.imgur.com/drhKWlt.jpg");
                        mCommon.add("Khandani Pakoda");

                        mCommonLink.add("https://i.imgur.com/oPO1LXc.jpg");
                        mCommon.add("Rose Cafe");

                        mCommonLink.add("https://i.imgur.com/28jf6p9.jpg");
                        mCommon.add("Beeryani");

                        mCommonLink.add("https://i.imgur.com/82fz8Mk.jpg");
                        mCommon.add("Summer house");

                        mCommonLink.add("https://i.imgur.com/wi2xMab.jpg");
                        mCommon.add("Thalaivar");


                        break;


                    case 3:
                        mCommonLink.add("https://i.imgur.com/Ue7sh8b.jpg");
                        mCommon.add("Ambience Mall");

                        mCommonLink.add("https://i.imgur.com/PaF9Jm7.jpg");
                        mCommon.add("Connaught Place");

                        mCommonLink.add("https://i.imgur.com/QkxJF7m.jpg");
                        mCommon.add("Chandani Chowk");

                        mCommonLink.add("https://i.imgur.com/XoMv9hr.jpg");
                        mCommon.add("Dilihaat");

                        mCommonLink.add("https://i.imgur.com/meMtsJI.jpg");
                        mCommon.add("DLF Promenade");

                        mCommonLink.add("https://i.imgur.com/MSFlVga.jpg");
                        mCommon.add("Janpath Market");

                        mCommonLink.add("https://i.imgur.com/OnXSYbW.jpg");
                        mCommon.add("Karol Bagh Market");

                        mCommonLink.add("https://i.imgur.com/ykS1eeO.jpg");
                        mCommon.add("Khan Market");

                        mCommonLink.add("https://i.imgur.com/fVEB1ou.jpg");
                        mCommon.add("Lajpat nagar Market");

                        mCommonLink.add("https://i.imgur.com/YZ5dYPI.jpg");
                        mCommon.add("Palika Bazar");

                        mCommonLink.add("https://i.imgur.com/rH24JvX.jpg");
                        mCommon.add("Sarojini Market");

                        mCommonLink.add("https://i.imgur.com/xqNR3t0.jpg");
                        mCommon.add("Select City Walk");
                        break;


                    case 4:

                        mCommonLink.add("https://i.imgur.com/QrD4YeD.jpg");
                        mCommon.add("Leroi");

                        mCommonLink.add("https://i.imgur.com/Wl4tnib.jpg");
                        mCommon.add("Toronto");

                        mCommonLink.add("https://i.imgur.com/a5OYtLy.jpg");
                        mCommon.add("ITC Maurya");

                        mCommonLink.add("https://i.imgur.com/H8fRtzU.jpg");
                        mCommon.add("JW Marriott ");

                        mCommonLink.add("https://i.imgur.com/dL5Ifx0.jpg");
                        mCommon.add("The Lodhi");

                        mCommonLink.add("https://i.imgur.com/PC5j7n6.jpg");
                        mCommon.add("Taj Mahal");
                        break;


                    case 5:
                        mCommonLink.add("https://i.imgur.com/0JBwCCk.jpg");
                        mCommon.add("Chandni Chowk Metro");

                        mCommonLink.add("https://i.imgur.com/rAMSAs0.jpg");
                        mCommon.add("Indira Gandhi Airport");

                        mCommonLink.add("https://i.imgur.com/tyPGmoy.jpg");
                        mCommon.add("New Delhi Station");

                        mCommonLink.add("https://i.imgur.com/PJRT3ye.jpg");
                        mCommon.add("Old Delhi Station");


                        break;
                }
                setData();
                break;


            case "blore":


                switch (category) {
                    case 1:
                        mCommonLink.add("https://i.imgur.com/l9U4ucc.jpg");
                        mCommon.add("Banglore Palace");

                        mCommonLink.add("https://i.imgur.com/LFb2u8x.jpg");
                        mCommon.add("Banerghatta Park");

                        mCommonLink.add("https://i.imgur.com/t9falF3.jpg");
                        mCommon.add("Cubbon Park");

                        mCommonLink.add("https://i.imgur.com/qnx33M5.jpg");
                        mCommon.add("Innovative Film City");

                        mCommonLink.add("https://i.imgur.com/QZP0Tsl.jpg");
                        mCommon.add("Kaiwara Temple");

                        mCommonLink.add("https://i.imgur.com/FEtKMTr.jpg");
                        mCommon.add("Lal Bagh Botanicals");

                        mCommonLink.add("https://i.imgur.com/0E5heUg.jpg");
                        mCommon.add("Nandi Hills");

                        mCommonLink.add("https://i.imgur.com/pj0j5jr.jpg");
                        mCommon.add("National Gallery of Art");

                        mCommonLink.add("https://i.imgur.com/lJ59Qdx.jpg");
                        mCommon.add("Shivsamudra Falls");

                        mCommonLink.add("https://i.imgur.com/Pip5s96.jpg");
                        mCommon.add("St. Mary Basilica");

                        mCommonLink.add("https://i.imgur.com/gIQ9E5T.jpg");
                        mCommon.add("Tipusultan Fort");

                        mCommonLink.add("https://i.imgur.com/iNh3m0u.jpg");
                        mCommon.add("Vidhan Soudha");

                        break;


                    case 2:

                        mCommonLink.add("https://i.imgur.com/RECq4vz.jpg");
                        mCommon.add("Puchkas");

                        mCommonLink.add("https://i.imgur.com/0zktr70.jpg");
                        mCommon.add("Punjab Pleasures");

                        mCommonLink.add("https://i.imgur.com/z7blvdX.jpg");
                        mCommon.add("Shahi Darbar");

                        mCommonLink.add("https://i.imgur.com/INAL5bi.jpg");
                        mCommon.add("Central Tiffin Room");

                        mCommonLink.add("https://i.imgur.com/mPn2LyI.jpg");
                        mCommon.add("Dakshin ");

                        mCommonLink.add("https://i.imgur.com/Qyek204.jpg");
                        mCommon.add("Karavalli");

                        mCommonLink.add("https://i.imgur.com/eNoaLKO.jpg");
                        mCommon.add("Koshy's Bar and Restro");

                        mCommonLink.add("https://i.imgur.com/dOVmcmw.jpg");
                        mCommon.add("Mavalli Tiffin Rooms");

                        mCommonLink.add("https://i.imgur.com/chRc24W.jpg");
                        mCommon.add("Sri Sairam's Chaat");

                        mCommonLink.add("https://i.imgur.com/QOB5QdX.jpg");
                        mCommon.add("VW Puram Food Street ");
                        break;


                    case 3:
                        mCommonLink.add("https://i.imgur.com/cIW8q1T.jpg");
                        mCommon.add("Basavana Gudi");

                        mCommonLink.add("https://i.imgur.com/K4tWui9.jpg");
                        mCommon.add("Brigade Road");

                        mCommonLink.add("https://i.imgur.com/Aa1lcvj.jpg");
                        mCommon.add("Chick Pet");

                        mCommonLink.add("https://i.imgur.com/Gtsuxjj.jpg");
                        mCommon.add("Commercial Street");

                        mCommonLink.add("https://i.imgur.com/wBmdedv.jpg");
                        mCommon.add("Forum Mall");

                        mCommonLink.add("https://i.imgur.com/tiWYjzo.jpg");
                        mCommon.add("Gandhi Bazar");

                        mCommonLink.add("https://i.imgur.com/OLjFSA8.jpg");
                        mCommon.add("Jaynagar 4th Block");

                        mCommonLink.add("https://i.imgur.com/CtchAO8.jpg");
                        mCommon.add("Malleshwar Market");

                        mCommonLink.add("https://i.imgur.com/l0j5PG0.jpg");
                        mCommon.add("Mantri Square");

                        mCommonLink.add("https://i.imgur.com/MdyFZZq.jpg");
                        mCommon.add("UB City");

                        mCommonLink.add("https://i.imgur.com/zzZ5gzW.jpg");
                        mCommon.add("Garud Mall");

                        break;


                    case 4:

                        mCommonLink.add("https://i.imgur.com/ZJ2bYEV.jpg");
                        mCommon.add("Golden Residency");

                        mCommonLink.add("https://i.imgur.com/XYHjcX6.jpg");
                        mCommon.add("HM Suites");

                        mCommonLink.add("https://i.imgur.com/KcCRqDi.jpg");
                        mCommon.add("ITC Windsor");

                        mCommonLink.add("https://i.imgur.com/YXgKaql.jpg");
                        mCommon.add("Lalit Ashok");

                        mCommonLink.add("https://i.imgur.com/4piVmZV.jpg");
                        mCommon.add("LeeLa Palace");

                        mCommonLink.add("https://i.imgur.com/bJFg6w1.jpg");
                        mCommon.add("Mint Propus");

                        mCommonLink.add("https://i.imgur.com/r7yNni1.jpg");
                        mCommon.add("The Oberoi");

                        mCommonLink.add("https://i.imgur.com/ENl76Jc.jpg");
                        mCommon.add("Signature Inn");

                        mCommonLink.add("https://i.imgur.com/KFlJPDq.jpg");
                        mCommon.add("Treebo Silver Star");

                        mCommonLink.add("https://i.imgur.com/CyR98aJ.jpg");
                        mCommon.add("Zuri White Field");

                        mCommonLink.add("https://i.imgur.com/evQsap8.jpg");
                        mCommon.add("ITC Gardenia");
                        break;


                    case 5:

                        mCommonLink.add("https://i.imgur.com/tfkvBzX.jpg");
                        mCommon.add("Banglore Airport");

                        mCommonLink.add("https://i.imgur.com/RBEZGwi.jpg");
                        mCommon.add("Banglore Railway Station");

                        mCommonLink.add("https://i.imgur.com/zFMF4MO.jpg");
                        mCommon.add("Banglore Metro");

                        mCommonLink.add("https://i.imgur.com/2o36X3q.jpg");
                        mCommon.add("Yeshvantpur");


                        break;

                }
                setData();
                break;


            case "kolkata":

                switch (category) {
                    case 1:
                        mCommonLink.add("https://i.imgur.com/02cRghn.jpg");
                        mCommon.add("Belur Math");

                        mCommonLink.add("https://i.imgur.com/GQoPjBE.jpg");
                        mCommon.add("Botanical Gardens");

                        mCommonLink.add("https://i.imgur.com/LTgGjTt.jpg");
                        mCommon.add("Fort William");

                        mCommonLink.add("https://i.imgur.com/coy8I8V.jpg");
                        mCommon.add("Alipore Zoo");

                        mCommonLink.add("https://i.imgur.com/FCM66gT.jpg");
                        mCommon.add("Birla Planetarium ");

                        mCommonLink.add("https://i.imgur.com/cyxKVCt.jpg");
                        mCommon.add("Esplanade");

                        mCommonLink.add("https://i.imgur.com/Qu3m1xe.jpg");
                        mCommon.add("Howrah Bridge");

                        mCommonLink.add("https://i.imgur.com/SGs01tj.jpg");
                        mCommon.add("Indian Museum");

                        mCommonLink.add("https://i.imgur.com/upyfkWp.jpg");
                        mCommon.add("St. Paul's");

                        mCommonLink.add("https://i.imgur.com/qR0A3cN.jpg");
                        mCommon.add("Victoria Meomrial");

                        break;


                    case 2:
                        mCommonLink.add("https://i.imgur.com/0UnqV7i.jpg");
                        mCommon.add("Ganguram Sweets");

                        mCommonLink.add("https://i.imgur.com/KUAN7Wo.jpg");
                        mCommon.add("Oh! Calcutta");

                        mCommonLink.add("https://i.imgur.com/EAL4rlS.jpg");
                        mCommon.add("6 Ballygunge Place");

                        mCommonLink.add("https://i.imgur.com/0ZhUp90.jpg");
                        mCommon.add("Bohemian");

                        mCommonLink.add("https://i.imgur.com/Z39r2PA.jpg");
                        mCommon.add("Jiyo Piyo");

                        mCommonLink.add("https://i.imgur.com/hGg49aa.jpg");
                        mCommon.add("Kew Pie's Kitchen");

                        mCommonLink.add("https://i.imgur.com/rQLxzPh.jpg");
                        mCommon.add("Ganguram");

                        mCommonLink.add("https://i.imgur.com/vjV9qId.jpg");
                        mCommon.add("The Bhoj Company");


                        break;


                    case 3:
                        mCommonLink.add("https://i.imgur.com/rfrjYRe.jpg");
                        mCommon.add("College Street");

                        mCommonLink.add("https://i.imgur.com/ffKrfbI.jpg");
                        mCommon.add("Bura Bazar");

                        mCommonLink.add("https://i.imgur.com/r9y0wfV.jpg");
                        mCommon.add("Phool Bazaar");

                        mCommonLink.add("https://i.imgur.com/KGHwfqn.jpg");
                        mCommon.add("Gariahat");

                        mCommonLink.add("https://i.imgur.com/I4j4v1Y.jpg");
                        mCommon.add("Hatibagan");

                        mCommonLink.add("https://i.imgur.com/9NP6CLS.jpg");
                        mCommon.add("New Market");

                        mCommonLink.add("https://i.imgur.com/84KZRNA.jpg");
                        mCommon.add("South City Mall");
                        break;


                    case 4:
                        mCommonLink.add("https://i.imgur.com/oSDEgfo.jpg");
                        mCommon.add("De Sovrani");

                        mCommonLink.add("https://i.imgur.com/6j7wdKp.jpg");
                        mCommon.add("Novotel ");

                        mCommonLink.add("https://i.imgur.com/n3eGcxj.jpg");
                        mCommon.add("Park Prime");

                        mCommonLink.add("https://i.imgur.com/bSJtuBO.jpg");
                        mCommon.add("Pipal Tree");

                        mCommonLink.add("https://i.imgur.com/LSGCMhk.jpg");
                        mCommon.add("The Lalit Great Eastern");

                        break;


                    case 5:

                        mCommonLink.add("https://i.imgur.com/o0Spu7S.jpg");
                        mCommon.add("Kolkata Airport");

                        mCommonLink.add("https://i.imgur.com/CuwIxIY.jpg");
                        mCommon.add("Howrah Station");

                        mCommonLink.add("https://i.imgur.com/VhFv5sf.jpg");
                        mCommon.add("Kolkata Metro");

                        break;
                }
                setData();
                break;


            case "chennai":


                switch (category) {
                    case 1:
                        mCommonLink.add("https://i.imgur.com/VFzxEmM.jpg");
                        mCommon.add("Arignaranna Zoo");

                        mCommonLink.add("https://i.imgur.com/ArlgVMK.jpg");
                        mCommon.add("Birla Planetarium");

                        mCommonLink.add("https://i.imgur.com/Gu7rptK.jpg");
                        mCommon.add("Elliot Beach");

                        mCommonLink.add("https://i.imgur.com/SvLxVHH.jpg");
                        mCommon.add("Fort St George");

                        mCommonLink.add("https://i.imgur.com/HFhoCXa.jpg");
                        mCommon.add("Kapaleeswarar Temple");

                        mCommonLink.add("https://i.imgur.com/6mFUqCN.jpg");
                        mCommon.add("Marina Beach");

                        mCommonLink.add("https://i.imgur.com/QcZsjW5.jpg");
                        mCommon.add("MGM dizzee world");

                        mCommonLink.add("https://i.imgur.com/Yo3gOSm.jpg");
                        mCommon.add("National Art Gallery");

                        mCommonLink.add("https://i.imgur.com/Lrncc8M.jpg");
                        mCommon.add("Santhome Church");

                        mCommonLink.add("https://i.imgur.com/hSikx6N.jpg");
                        mCommon.add("Thousands Light Mosque");

                        break;


                    case 2:
                        mCommonLink.add("https://i.imgur.com/2pEZgi0.jpg");
                        mCommon.add("Anna Laxmi");

                        mCommonLink.add("https://i.imgur.com/MWSUjz5.jpg");
                        mCommon.add("Barbeque Nation");

                        mCommonLink.add("https://i.imgur.com/Npvi32p.jpg");
                        mCommon.add("Benjarong");

                        mCommonLink.add("https://i.imgur.com/oFWcysE.jpg");
                        mCommon.add("Bombay Lassi");

                        mCommonLink.add("https://i.imgur.com/L6lb9Sw.jpg");
                        mCommon.add("Dakshin");

                        mCommonLink.add("https://i.imgur.com/qSkjTzB.jpg");
                        mCommon.add("Italia at the parkpod");

                        mCommonLink.add("https://i.imgur.com/qIBAlza.jpg");
                        mCommon.add("Madras Pavillion");

                        mCommonLink.add("https://i.imgur.com/ntIX14U.jpg");
                        mCommon.add("Murugan Idli Shop");

                        mCommonLink.add("https://i.imgur.com/isud2pu.jpg");
                        mCommon.add("Panasian");

                        mCommonLink.add("https://i.imgur.com/klhTXvJ.jpg");
                        mCommon.add("Southern Spice");

                        mCommonLink.add("https://i.imgur.com/TYYHKlg.jpg");
                        mCommon.add("Thalapakattu Biryani");

                        break;


                    case 3:
                        mCommonLink.add("https://i.imgur.com/tZIZDQQ.jpg");
                        mCommon.add("Abirami Mall");

                        mCommonLink.add("https://i.imgur.com/H22dSiA.jpg");
                        mCommon.add("Express Avenue");

                        mCommonLink.add("https://i.imgur.com/fx64jLs.jpg");
                        mCommon.add("Nungam Bakkam");

                        mCommonLink.add("https://i.imgur.com/aKJ7jdJ.jpg");
                        mCommon.add("Parrys Corner");

                        mCommonLink.add("https://i.imgur.com/4TIhxCe.jpg");
                        mCommon.add("Phoenix Mall ");

                        mCommonLink.add("https://i.imgur.com/P41xBlh.jpg");
                        mCommon.add("Pondi Bazaar");

                        mCommonLink.add("https://i.imgur.com/gUmXsNG.jpg");
                        mCommon.add("Ritchie Street");

                        mCommonLink.add("https://i.imgur.com/d5iT5bT.jpg");
                        mCommon.add("Snow Carpet");

                        mCommonLink.add("https://i.imgur.com/biGNd9r.jpg");
                        mCommon.add("Spencer Plaza");

                        mCommonLink.add("https://i.imgur.com/oOM4bb7.jpg");
                        mCommon.add("T Nagar");


                        break;


                    case 4:
                        mCommonLink.add("https://i.imgur.com/uplgvwT.jpg");
                        mCommon.add("Belstead");

                        mCommonLink.add("https://i.imgur.com/0A9jxOO.jpg");
                        mCommon.add("ITC Grand Chola");

                        mCommonLink.add("https://i.imgur.com/QWnrDT0.jpg");
                        mCommon.add("Pandian");

                        mCommonLink.add("https://i.imgur.com/uLF8KcO.jpg");
                        mCommon.add("Park Hyatt");

                        mCommonLink.add("https://i.imgur.com/pHbKimx.jpg");
                        mCommon.add("Radison");

                        mCommonLink.add("https://i.imgur.com/cz3nQcJ.jpg");
                        mCommon.add("Royal Agency");

                        mCommonLink.add("https://i.imgur.com/k1B9wiV.jpg");
                        mCommon.add("Savera");

                        mCommonLink.add("https://i.imgur.com/9YHjy2a.jpg");
                        mCommon.add("Leela Palace");

                        mCommonLink.add("https://i.imgur.com/PWobEoq.jpg");
                        mCommon.add("Park Chennai");
                        break;


                    case 5:
                        mCommonLink.add("https://i.imgur.com/vBLZWL8.jpg");
                        mCommon.add("Chennai Airport");

                        mCommonLink.add("https://i.imgur.com/HYVyvDR.jpg");
                        mCommon.add("Central Railway Station");

                        mCommonLink.add("https://i.imgur.com/4VYhh60.jpg");
                        mCommon.add("Egmore");

                        mCommonLink.add("https://i.imgur.com/lzMlaXO.jpg");
                        mCommon.add("Chennai Metro");

                        break;
                }
                setData();
                break;

            case "hyderabad": {
                switch (category) {
                    case 1:
                        mCommonLink.add("https://i.imgur.com/SumgjTr.jpg");
                        mCommon.add("Charminar");

                        mCommonLink.add("https://i.imgur.com/pvTpUGw.jpg");
                        mCommon.add("Ramoji Film City");

                        mCommonLink.add("https://i.imgur.com/qOvLKfw.jpg");
                        mCommon.add("Hussain Sagar");

                        mCommonLink.add("https://i.imgur.com/EEqHghH.jpg");
                        mCommon.add("Salar Jung Museum");

                        mCommonLink.add("https://i.imgur.com/HkwxpZh.jpg");
                        mCommon.add("Birla Mandir");

                        mCommonLink.add("https://i.imgur.com/AAE59Vx.jpg");
                        mCommon.add("Nehru Zoological Park");

                        mCommonLink.add("https://i.imgur.com/e72LQ2j.jpg");
                        mCommon.add("Golconda Fort");

                        mCommonLink.add("https://i.imgur.com/zw1WsA6.jpg");
                        mCommon.add("Lumbini Park");

                        mCommonLink.add("https://i.imgur.com/mZIDfua.jpg");
                        mCommon.add("Snow World");

                        mCommonLink.add("https://i.imgur.com/Xqikdav.jpg");
                        mCommon.add("NTR Garden");
                        break;


                    case 2:

                        mCommonLink.add("https://i.imgur.com/hxLDsdV.jpg");
                        mCommon.add("Paradise Biryani");

                        mCommonLink.add("https://i.imgur.com/3kthYGj.jpg");
                        mCommon.add("Chutneys");

                        mCommonLink.add("https://i.imgur.com/49DQYFb.jpg");
                        mCommon.add("Jash e Audh");

                        mCommonLink.add("https://i.imgur.com/uc9ADDE.jpg");
                        mCommon.add("Ohm");

                        mCommonLink.add("https://i.imgur.com/p1AyNvX.jpg");
                        mCommon.add("Dakshin  ");

                        mCommonLink.add("https://i.imgur.com/NmDRMWq.jpg");
                        mCommon.add("Minerva Coffee Shop");

                        mCommonLink.add("https://i.imgur.com/uGbLvcb.jpg");
                        mCommon.add("Guffa");

                        mCommonLink.add("https://i.imgur.com/1OvCHB6.jpg");
                        mCommon.add("Olive Bistro");

                        mCommonLink.add("https://i.imgur.com/z0H48WD.jpg");
                        mCommon.add("Sahib Sindh Sultan");

                        break;


                    case 3:

                        mCommonLink.add("https://i.imgur.com/6RwFKpF.jpg");
                        mCommon.add("Begum Bazar");

                        mCommonLink.add("https://i.imgur.com/YxeNhdo.jpg");
                        mCommon.add("KOTI");

                        mCommonLink.add("https://i.imgur.com/LZAFvaq.jpg");
                        mCommon.add("Nampally");

                        mCommonLink.add("https://i.imgur.com/iK8ja18.jpg");
                        mCommon.add("Tobacco Bazar");

                        mCommonLink.add("https://i.imgur.com/J0MmFAT.jpg");
                        mCommon.add("Laad Bazar");

                        mCommonLink.add("https://i.imgur.com/CsQtBwy.jpg");
                        mCommon.add("Forum Sujana Mall");

                        mCommonLink.add("https://i.imgur.com/vsE9zGd.jpg");
                        mCommon.add("Hyderabad Central");

                        mCommonLink.add("https://i.imgur.com/HhOYY8I.jpg");
                        mCommon.add("Perfume Market");

                        break;


                    case 4:

                        mCommonLink.add("https://i.imgur.com/dLkhMXI.jpg");
                        mCommon.add("ITC Kakatiya");

                        mCommonLink.add("https://i.imgur.com/5NjEKsO.jpg");
                        mCommon.add("Trident ");

                         mCommonLink.add("https://i.imgur.com/VPIu32c.jpg");
                        mCommon.add("Westin ");

                        mCommonLink.add("https://i.imgur.com/dpAXJOL.jpg");
                        mCommon.add("Taj Banjara");

                        mCommonLink.add("https://i.imgur.com/DZ4QD0J.jpg");
                        mCommon.add("Vivanta Taj");

                        mCommonLink.add("https://i.imgur.com/o3DnQK7.jpg");
                        mCommon.add("Sheraton");

                        mCommonLink.add("https://i.imgur.com/Ae2cmVW.jpg");
                        mCommon.add("The Park");

                        break;


                    case 5:

                        mCommonLink.add("https://i.imgur.com/KqQgbFw.jpg");
                        mCommon.add("Secunderabad");

                        mCommonLink.add("https://i.imgur.com/qmSUy06.jpg");
                        mCommon.add("Hyderabad Metro");

                        mCommonLink.add("https://i.imgur.com/5IsrLjF.jpg");
                        mCommon.add("Rajiv Gandhi Airport");

                        mCommonLink.add("https://i.imgur.com/GV5Dkeb.jpg");
                        mCommon.add("Hyderabad Railway Station");
                        break;

                }
                setData();
                break;
            }

            case "jaipur": {
                switch (category) {
                    case 1:
                        mCommonLink.add("https://i.imgur.com/IDpNlDG.jpg");
                        mCommon.add("Hawa Mahal");

                        mCommonLink.add("https://i.imgur.com/0BYjGm9.jpg");
                        mCommon.add("Jaigarh Fort");

                        mCommonLink.add("https://i.imgur.com/rr9KXqn.jpg");
                        mCommon.add("Amber Fort");

                        mCommonLink.add("https://i.imgur.com/nocwezg.jpg ");
                        mCommon.add("Jal Mahal");

                        mCommonLink.add("https://i.imgur.com/JXclQAo.jpg");
                        mCommon.add("Jantar Mantar");

                        mCommonLink.add("https://i.imgur.com/K5M0xFH.jpg");
                        mCommon.add("Nahargarh Fort");

                        mCommonLink.add("https://i.imgur.com/qqjJQSs.jpg");
                        mCommon.add("Albert Hall Musuem");

                        mCommonLink.add("https://i.imgur.com/SbhK0yS.jpg");
                        mCommon.add("RajMandir");

                        mCommonLink.add("https://i.imgur.com/c5OcdlG.jpg");
                        mCommon.add("City Palace");

                        mCommonLink.add("https://i.imgur.com/EfP11AX.jpg");
                        mCommon.add("Monkey Temple");

                        mCommonLink.add("https://i.imgur.com/BPGXu1S.jpg");
                        mCommon.add("Sisodiya Garden");




                    break;

                    case 2:

                        mCommonLink.add("https://i.imgur.com/bQ53n2F.jpg");
                        mCommon.add("1135 AD");

                        mCommonLink.add("https://i.imgur.com/Ds4ZX7J.jpg");
                        mCommon.add("Suvarna Mahal");

                        mCommonLink.add("https://i.imgur.com/deAGLDC.jpg");
                        mCommon.add("Peacock Rooftop");

                        mCommonLink.add("https://i.imgur.com/VHPSAt4.jpg");
                        mCommon.add("Laksmi Misthan");

                        mCommonLink.add("https://i.imgur.com/eylpCRb.jpg");
                        mCommon.add("Sanjay's Omlette");

                        mCommonLink.add("https://i.imgur.com/VTnMuKp.jpg");
                        mCommon.add("Dragon House");

                        mCommonLink.add("https://i.imgur.com/ejr3oUs.jpg");
                        mCommon.add("Okra");

                        mCommonLink.add("https://i.imgur.com/vYrHBbc.jpg");
                        mCommon.add("Peshwari");

                        break;


                    case 3:

                        mCommonLink.add("https://i.imgur.com/MFhUusK.jpg");
                        mCommon.add("World Trade Park");

                        mCommonLink.add("https://i.imgur.com/C4UhOE3.jpg");
                        mCommon.add("Pink Square Mall");

                        mCommonLink.add("https://i.imgur.com/CTiM6bo.jpg");
                        mCommon.add("Nehru Bazar");

                        mCommonLink.add("https://i.imgur.com/9iXXG04.jpg");
                        mCommon.add("Kishan Poli Bazar");

                        mCommonLink.add("https://i.imgur.com/AxV1AX1.jpg");
                        mCommon.add("Johari Bazar");

                        mCommonLink.add("https://i.imgur.com/nPLTKSe.jpg");
                        mCommon.add("Tripoli Bazar");

                        mCommonLink.add("https://i.imgur.com/Clzusgu.jpg");
                        mCommon.add("Bapu Bazar");

                        mCommonLink.add("https://i.imgur.com/iU93x5y.jpg");
                        mCommon.add("Mirza Ismael Road");

                        mCommonLink.add("https://i.imgur.com/11hSOXw.jpg");
                        mCommon.add("Sireh Deori Bazar");



                        break;


                    case 4:

                        mCommonLink.add("https://i.imgur.com/jKQyEUs.jpg");
                        mCommon.add("ITC RajPutana");

                        mCommonLink.add("https://i.imgur.com/b5EdHL5.jpg");
                        mCommon.add("Lalit");

                        mCommonLink.add("https://i.imgur.com/BEKJHIb.jpg");
                        mCommon.add("Oberoi Raj Vilas");

                        mCommonLink.add("https://i.imgur.com/DhJxblz.jpg");
                        mCommon.add("Ramada");

                        mCommonLink.add("https://i.imgur.com/jUtNN2Z.jpg");
                        mCommon.add("Ram Baugh Palace");

                        mCommonLink.add("https://i.imgur.com/IoMgowT.jpg");
                        mCommon.add("Trident  ");

                        mCommonLink.add("https://i.imgur.com/vr1qKRZ.jpg");
                        mCommon.add("Holiday Inn");


                        mCommonLink.add("https://i.imgur.com/7zlGNFp.jpg");
                        mCommon.add("Radison Blu");


                        break;


                    case 5:

                        mCommonLink.add("https://i.imgur.com/tv4cc45.jpg");
                        mCommon.add("Jaipur Airport");

                        mCommonLink.add("https://i.imgur.com/HHGIk1H.jpg");
                        mCommon.add("Jaipur Railway Station");

                        mCommonLink.add("https://i.imgur.com/tX2Gvjr.jpg");
                        mCommon.add("Jaipur Metro");

                        break;

                }
                setData();
                break;
            }

            case "goa": {
                switch (category) {
                    case 1:
                        mCommonLink.add("https://i.imgur.com/9GySYiG.jpg");
                        mCommon.add("Arambol Beach");

                        mCommonLink.add("https://i.imgur.com/GXcebrj.jpg");
                        mCommon.add("Baga Beach");

                        mCommonLink.add("https://i.imgur.com/0glmufP.jpg");
                        mCommon.add("Dudhsagar Waterfalls");

                        mCommonLink.add("https://i.imgur.com/AKhCa9D.jpg");
                        mCommon.add("St. Cajetan Church");

                        mCommonLink.add("https://i.imgur.com/iljvTUx.jpg");
                        mCommon.add("Bom Jesus Church");

                        mCommonLink.add("https://i.imgur.com/X7WPHPa.jpg");
                        mCommon.add("Calangute Beach");

                        mCommonLink.add("https://i.imgur.com/hsDn3Zp.jpg");
                        mCommon.add("Casino Cruise");

                        mCommonLink.add("https://i.imgur.com/gGQM4al.jpg");
                        mCommon.add("Fort Aguada");

                        mCommonLink.add("https://i.imgur.com/s1D8p4X.jpg");
                        mCommon.add("Grand Island");

                        mCommonLink.add("https://i.imgur.com/KuHY7Wz.jpg");
                        mCommon.add("Vagator Beach");




                        break;

                    case 2:

                        mCommonLink.add("https://i.imgur.com/500Ry6u.jpg");
                        mCommon.add("Ciao Bella");

                        mCommonLink.add("https://i.imgur.com/45Vqdcp.jpg");
                        mCommon.add("Crab");

                        mCommonLink.add("https://i.imgur.com/Gpb5EIs.jpg");
                        mCommon.add("Fish N Feni");

                        mCommonLink.add("https://i.imgur.com/cBSH22L.jpg");
                        mCommon.add("Ambot Tik");

                        mCommonLink.add("https://i.imgur.com/0CfJHZP.jpg");
                        mCommon.add("Bebinga");

                        mCommonLink.add("https://i.imgur.com/EoDDD2P.jpg");
                        mCommon.add("Noronha's Corner");

                        mCommonLink.add("https://i.imgur.com/ck0MjMv.jpg");
                        mCommon.add("Peep's Kitchen");


                        break;


                    case 3:

                        mCommonLink.add("https://i.imgur.com/MsScLrM.jpg");
                        mCommon.add("Anjuna Flea Market");

                        mCommonLink.add("https://i.imgur.com/7yPNS9E.jpg");
                        mCommon.add("Bombay Bazaar");

                        mCommonLink.add("https://i.imgur.com/AW0KBW4.jpg");
                        mCommon.add("Calungute Market");

                        mCommonLink.add("https://i.imgur.com/pQTYsx6.jpg");
                        mCommon.add("Mall de Goa");

                        mCommonLink.add("https://i.imgur.com/0IyghKZ.jpg");
                        mCommon.add("Mackie's Night Bazar");

                        mCommonLink.add("https://i.imgur.com/1e70q39.jpg");
                        mCommon.add("Mapusa Fish Market");

                        mCommonLink.add("https://i.imgur.com/t7CsWmM.jpg");
                        mCommon.add("Panjim Market");




                        break;


                    case 4:

                        mCommonLink.add("https://i.imgur.com/FVJjErI.jpg");
                        mCommon.add("Silver Sand");

                        mCommonLink.add("https://i.imgur.com/EsMhqag.jpg");
                        mCommon.add("Horizon");

                        mCommonLink.add("https://i.imgur.com/bmy8959.jpg");
                        mCommon.add("Neptune Point Beach");

                        mCommonLink.add("https://i.imgur.com/F86zikc.jpg");
                        mCommon.add("Yo yo Goa");

                        mCommonLink.add("https://i.imgur.com/RbSTRTz.jpg");
                        mCommon.add("The banyan Soul");

                        mCommonLink.add("https://i.imgur.com/OfcfoCr.jpg");
                        mCommon.add("Treebo");

                        mCommonLink.add("https://i.imgur.com/sJYWlwi.jpg");
                        mCommon.add("Bonanza");

                        break;


                    case 5:


                        mCommonLink.add("https://i.imgur.com/awFd7Up.jpg");
                        mCommon.add("Dabolim Airport");

                        mCommonLink.add("https://i.imgur.com/7vPqcl7.jpg");
                        mCommon.add("Goa Railway Station");

                        break;

                }
                setData();
                break;
            }
            case "kochi": {
                switch (category) {
                    case 1:
                        mCommonLink.add("https://i.imgur.com/1U7WSQz.jpg");
                        mCommon.add("Cherai Beach");

                        mCommonLink.add("https://i.imgur.com/D9i9o2f.jpg");
                        mCommon.add("Chottanikara temple");

                        mCommonLink.add("https://i.imgur.com/o8TIvqU.jpg");
                        mCommon.add("Santa Cruz Basilica");

                        mCommonLink.add("https://i.imgur.com/3WSH0vN.jpg");
                        mCommon.add("Mattan Cherry Palace");

                        mCommonLink.add("https://i.imgur.com/9QJ7dQe.jpg");
                        mCommon.add("Ernakulam Temple");

                        mCommonLink.add("https://i.imgur.com/dHKV3tD.jpg");
                        mCommon.add("Hill Palace");

                        mCommonLink.add("https://i.imgur.com/5nQL6OD.jpg");
                        mCommon.add("Indo Portuguese Museum");

                        mCommonLink.add("https://i.imgur.com/VShUFvv.jpg");
                        mCommon.add("Kerala Kathakali");

                        mCommonLink.add("https://i.imgur.com/vhd3GWO.jpg");
                        mCommon.add("Kodanad Elephant Training Centre");


                        mCommonLink.add("https://i.imgur.com/y22ZGCK.jpg");
                        mCommon.add("Paradesi Synagogue");

                        mCommonLink.add("https://i.imgur.com/FW5yG2D.jpg");
                        mCommon.add("Veeranpuzha Beach");


                        break;

                    case 2:

                        mCommonLink.add("https://i.imgur.com/6SpElJq.jpg");
                        mCommon.add("Arcanova");

                        mCommonLink.add("https://i.imgur.com/fv20vmO.jpg");
                        mCommon.add("Dal Roti");

                        mCommonLink.add("https://i.imgur.com/wQLk2NQ.jpg");
                        mCommon.add("GingerHouse");

                        mCommonLink.add("https://i.imgur.com/6WXDN6V.jpg");
                        mCommon.add("Kashi Art Cafe");

                        mCommonLink.add("https://i.imgur.com/Hux2Xj2.jpg");
                        mCommon.add("Kethal's Chicken");

                        mCommonLink.add("https://i.imgur.com/S6sdczL.jpg");
                        mCommon.add("Malabar Junction");

                        mCommonLink.add("https://i.imgur.com/d7FYcBS.jpg");
                        mCommon.add("Rahmathullah Hotel");

                        mCommonLink.add("https://i.imgur.com/Bo1AuFD.jpg");
                        mCommon.add("The Rice Boat Vivanta");

                        break;


                    case 3:

                        mCommonLink.add("https://i.imgur.com/M0zw1KA.jpg");
                        mCommon.add("Bazar Road");

                        mCommonLink.add("https://i.imgur.com/bsbHkiY.jpg");
                        mCommon.add("Broadway");

                        mCommonLink.add("https://i.imgur.com/mtawohG.jpg");
                        mCommon.add("Jew Town");

                        mCommonLink.add("https://i.imgur.com/HFkZKaq.png");
                        mCommon.add("Lulu Mall");

                        mCommonLink.add("https://i.imgur.com/TYS6eKn.jpg");
                        mCommon.add("Marine Drive ");

                        mCommonLink.add("https://i.imgur.com/rDIvmhz.jpg");
                        mCommon.add("MG road");

                        mCommonLink.add("https://i.imgur.com/nCO1Sd2.jpg");
                        mCommon.add("Oberon Mall");




                        break;


                    case 4:

                        mCommonLink.add("https://i.imgur.com/3GK6Wuq.jpg");
                        mCommon.add("Brunton BoatYard");

                        mCommonLink.add("https://i.imgur.com/nAf2U3A.jpg");
                        mCommon.add("Casino Hotel");

                        mCommonLink.add("https://i.imgur.com/9PIJcvD.jpg");
                        mCommon.add("Hotel Aishwarya");

                        mCommonLink.add("https://i.imgur.com/T03UbEu.jpg");
                        mCommon.add("Crowne Plaza");

                        mCommonLink.add("https://i.imgur.com/NEtCH3k.jpg");
                        mCommon.add("Mermaid Hotel");

                        mCommonLink.add("https://i.imgur.com/KSM3L9o.jpg");
                        mCommon.add("Milenium Continental");

                        mCommonLink.add("https://i.imgur.com/MF7wklp.jpg");
                        mCommon.add("Ramada Resort");

                        mCommonLink.add("https://i.imgur.com/TGRiVww.jpg");
                        mCommon.add("Sonneta Residency");

                        mCommonLink.add("https://i.imgur.com/sJYWlwi.jpg");
                        mCommon.add("Vivanta By Taj");

                        break;


                    case 5:


                        mCommonLink.add("https://i.imgur.com/2L3aOrd.jpg");
                        mCommon.add("Cochin International Airport");

                        mCommonLink.add("https://i.imgur.com/7vPqcl7.jpg");
                        mCommon.add("Ernakullam Junction");

                        break;

                }
                setData();
                break;
            }

        }


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, mCommon);


       textView.setAdapter(adapter);
        textView.setThreshold(1);


        textView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = (TextView)view;
                Intent i = new Intent(FullView.this,Main4Activity.class);
                i.putExtra("heading",tv.getText().toString());
                i.putExtra("image",mCommonLink.get(mCommon.indexOf(tv.getText().toString())));
                i.putExtra("imagelist",mCommonLink);
                i.putExtra("namelist",mCommon);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    public void setData() {


        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.fullviewrecycler);
        recyclerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
               textView.clearFocus();
                return  false;
            }
        });
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter_Final(this, mCommon,mCommonLink);
        recyclerView.setAdapter(adapter);


    }


}




