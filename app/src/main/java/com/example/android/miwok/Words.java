package com.example.android.miwok;

/**
 * Created by Asus on 10/26/2017.
 */

public class Words {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Words(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
