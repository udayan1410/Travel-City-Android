package com.codecenter1430gmail.travelcityfinal;


        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.graphics.drawable.ColorDrawable;
        import android.media.Image;
        import android.net.Uri;
        import android.support.design.widget.FloatingActionButton;
        import android.support.v7.app.ActionBarActivity;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.support.v7.widget.Toolbar;
        import android.text.Html;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.bumptech.glide.Glide;
        import com.squareup.picasso.Picasso;

        import org.w3c.dom.Text;

        import java.util.ArrayList;

public class Main4Activity extends ActionBarActivity {
    ImageView img,next,prev;
    TextView heading,info;
    String rHeading,rInfo,rCoord;
    int maxSize;
    String rImg;
    FloatingActionButton actionButton;
    InfoSetter i1;
    Intent I;
    Locationsetter l1;

    private   ArrayList<String> mCommon = new ArrayList<>();
    private  ArrayList<String> mCommonImage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Redcolor)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);


        img = (ImageView)findViewById(R.id.fullimage);
        heading = (TextView)findViewById(R.id.heading);
        info = (TextView)findViewById(R.id.info);
        next = (ImageView)findViewById(R.id.next);
        prev = (ImageView)findViewById(R.id.prev);
        actionButton = (FloatingActionButton)findViewById(R.id.action_btn);

        rHeading = getIntent().getStringExtra("heading");
        rImg = getIntent().getStringExtra("image");

        InitAL();

        setData();
        //On click listener for next image
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        maxSize = mCommonImage.size();

                        if(mCommonImage.indexOf(rImg)!=maxSize-1)
                        {
                            rImg = mCommonImage.get((mCommonImage.indexOf(rImg)) + 1);
                            rHeading = mCommon.get(mCommon.indexOf(rHeading) + 1);
                        }
                        else {
                            rImg = mCommonImage.get(0);
                            rHeading = mCommon.get(0);
                        }
                setData();
            }
        });
        //On click listener for previous image
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        maxSize = mCommonImage.size();
                        if(mCommonImage.indexOf(rImg)!=0)
                        {
                            rImg = mCommonImage.get(mCommonImage.indexOf(rImg) - 1);
                            rHeading = mCommon.get(mCommon.indexOf(rHeading) - 1);
                        }
                        else {
                            rImg=mCommonImage.get(mCommonImage.size()-1);
                            rHeading=mCommon.get(mCommon.size()-1);
                        }
                setData();
            }
        });

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1 = new Locationsetter();
                rCoord = l1.getLoc(rHeading);

                I = new Intent(Intent.ACTION_VIEW, Uri.parse(rCoord));
                I.setPackage("com.google.android.apps.maps");
                startActivity(I);

            }
        });

    }
    void setData()
    {
        i1 = new InfoSetter();
        rInfo = i1.getInfo(rHeading);
        Picasso.with(this).load(rImg).placeholder(R.drawable.loading_large).into(img);

        heading.setText(rHeading);
        info.setText(rInfo);
    }
    void InitAL()
    {
        mCommonImage = getIntent().getStringArrayListExtra("imagelist");
        mCommon = getIntent().getStringArrayListExtra("namelist");
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
