package com.example.anuragv.NightWatch5.MyHorses;

import android.os.Parcel;
import android.os.Parcelable;


public class Horse implements Parcelable {

    private int id;
    private String picture_url;
    private String thumbnail_url;
    private String registered_name;
    private String birth_date;
    private int user_id;
    private String nick_name;
    private String sex;
    private String breed;
    private double edi_score;
    private String protocol;
    private int priority;
    private String devices;
    private String active;


public Horse(){

}
    public Horse(int id,String picture_url,String thumbnail_url,String registered_name,String birth_date,int user_id,
                 String nick_name,String sex,String breed,double edi_score,String protocol,int priority,
                 String devices,String active){

        this.id = id;
        this.picture_url = picture_url;
        this.thumbnail_url = thumbnail_url;
        this.registered_name = registered_name;
        this.birth_date = birth_date;
        this.user_id = user_id;
        this.nick_name = nick_name;
        this.sex = sex;
        this.breed = breed;
        this.edi_score = edi_score;
        this.protocol = protocol;
        this.priority = priority;
        this.devices = devices;
        this.active = active;

    }

    public String getRegistered_name() {
        return registered_name;
    }

    public void setRegistered_name(String registered_name) {
        this.registered_name = registered_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
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

    public double getEdi_score() {
        return edi_score;
    }

    public void setEdi_score(double edi_score) {
        this.edi_score = edi_score;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDevices() {
        return devices;
    }

    public void setDevices(String devices) {
        this.devices = devices;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeInt(id);
        dest.writeString(picture_url);
        dest.writeString(thumbnail_url);
        dest.writeString(registered_name);
        dest.writeString(birth_date);
        dest.writeInt(user_id);
        dest.writeString(nick_name);
        dest.writeString(sex);
        dest.writeString(breed);
        dest.writeDouble(edi_score);
        dest.writeString(protocol);
        dest.writeInt(priority);
        dest.writeString(devices);
        dest.writeString(active);


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
        picture_url = in.readString();
        thumbnail_url = in.readString();
        registered_name = in.readString();
        birth_date = in.readString();
        user_id = in.readInt();
        nick_name = in.readString();
        sex = in.readString();
        breed = in.readString();
        edi_score = in.readDouble();
        protocol = in.readString();
        priority =in.readInt();
        devices = in.readString();
        active = in.readString();


    }
}
