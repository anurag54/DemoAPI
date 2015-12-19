package com.example.anuragv.NightWatch5.MyHorses;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Horse implements Parcelable {

    private int id;
    private String pictureUrl;
    private String thumbnailUrl;
    private String registeredName;
    private double ediScore;
    private int userId;
    private String nickName;
    private int age;
    private String sex;
    private String breed;
    private double riskFactors;
    private String isActive;

    //  private ArrayList<Horse> horses;


public Horse(){

}
    public Horse(int id,String pictureUrl,String thumbnailUrl,String registeredName,double ediScore,int userId,String nickName,
                 int age,String sex,String breed,double riskFactors,String isActive){

        this.id = id;
        this.pictureUrl = pictureUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.registeredName = registeredName;
        this.ediScore = ediScore;
        this.userId = userId;
        this.nickName = nickName;
        this.age = age;
        this.sex = sex;
        this.breed = breed;
        this.riskFactors = riskFactors;
        this.isActive = isActive;
        //   this.horse = horse;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public double getEdiScore() {
        return ediScore;
    }

    public void setEdiScore(float ediScore) {
        this.ediScore = ediScore;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getRiskFactors() {
        return riskFactors;
    }

    public void setRiskFactors(float riskFactors) {
        this.riskFactors = riskFactors;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }





    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeInt(id);
        dest.writeString(pictureUrl);
        dest.writeString(thumbnailUrl);
        dest.writeDouble(ediScore);
        dest.writeInt(userId);
        dest.writeString(nickName);
        dest.writeInt(age);
        dest.writeString(sex);
        dest.writeString(breed);
        dest.writeDouble(riskFactors);
        dest.writeString(isActive);


    }

    public static final Parcelable.Creator CREATOR =
            new Parcelable.Creator() {
                public Horse createFromParcel(Parcel in) {
                    return new Horse(in);
                }

                public Horse[] newArray(int size) {
                    return new Horse[size];
                }
            };

    private Horse(Parcel in) {
        id = in.readInt();
        pictureUrl = in.readString();
        thumbnailUrl = in.readString();
        ediScore = in.readDouble();
        userId = in.readInt();
        nickName = in.readString();
        age = in.readInt();
        sex = in.readString();
        breed = in.readString();
        riskFactors = in.readDouble();
        isActive = in.readString();


    }
}
