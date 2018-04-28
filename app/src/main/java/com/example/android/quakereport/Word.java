package com.example.android.quakereport;

/**
 * Created by Ahmad on 06/02/2018.
 */

public class Word {

    private Double mMag;
    private String mLocation;
    private long mTime;
    private String mUrl;

    public Word(Double mag, String location, long time, String url) {
        mMag = mag;
        mLocation = location;
        mTime = time;
        mUrl = url;
    }

    public Double getmPower(){return mMag;}
    public String getmLocation(){return mLocation;}
    public long getmTimel(){return mTime;}
    public String getmUrl(){return mUrl;}

}
