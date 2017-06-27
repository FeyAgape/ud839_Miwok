package com.example.android.miwok;

/**
 * Created by FEY-AGAPE on 23/06/2017.
 */

public class Word {


    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    // Drawable resource ID
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId is drawable reference ID that corresponds to the Android version
     */
    //first constructor for the colors, numbers and family which takes on 2 string and 1 image
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }
    //second constructor for the phrase which only takes on 2 string no image

    public Word(String defaultTranslation, String miwokTranslation ) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the accompanying image.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}

