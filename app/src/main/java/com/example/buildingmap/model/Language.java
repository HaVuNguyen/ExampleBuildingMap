package com.example.buildingmap.model;

public class Language {
    private String mLanguageCode;
    private int mImage;
    private int mNameLanguage;

    public Language(String languageCode, int image, int nameLanguage) {
        mLanguageCode = languageCode;
        mImage = image;
        mNameLanguage = nameLanguage;
    }

    public String getLanguageCode() {
        return mLanguageCode;
    }

    public void setLanguageCode(String languageCode) {
        mLanguageCode = languageCode;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public int getNameLanguage() {
        return mNameLanguage;
    }

    public void setNameLanguage(int nameLanguage) {
        mNameLanguage = nameLanguage;
    }
}
