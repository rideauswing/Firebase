package com.example.firebase;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mPdfURL;

    public Upload(){
        //empty constructor needed

    }
    public Upload(String name, String imageUrl, String PdfURL){
        if(name.trim().equals("")){
            name = "No name";
        }
        mName = name;
        mImageUrl = imageUrl;
        mPdfURL = PdfURL;
    }
    public String getmName(){
        return mName;
    }
    public void setmName(String name){
        mName = name;
    }
    public String getmImageUrl(){
        return mImageUrl;

    }
    public void setmImageUrl(String imageUrl){
        mImageUrl = imageUrl;
    }

    public String getmPdfURL(){return mPdfURL; }


}
