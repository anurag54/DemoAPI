package com.example.anuragv.NightWatch5.Dashboard;

import android.os.Parcel;
import android.os.Parcelable;


public class Metrics implements Parcelable {

    private int id;
    private int horseId;
    private double ediScore;
    private int heartRate;
    private int respiratoryRate;
    private double rise;
    private double rolls;
    private double falls;
    private double lyingDown;
    private String shakes;
    private String geo;
    private String collectionDateTime;



    public Metrics(int id,int horseId,double ediScore,int heartRate,int respiratoryRate,double rise,
                   double rolls,double falls,double lyingDown,String shakes,String geo,String collectionDateTime){

        this.id = id;
        this.horseId = horseId;
        this.ediScore = ediScore;
        this.heartRate = heartRate;
        this.respiratoryRate = respiratoryRate;
        this.rise = rise;
        this.rolls = rolls;
        this.falls = falls;
        this.lyingDown = lyingDown;
        this.shakes = shakes;
        this.geo = geo;
        this.collectionDateTime = collectionDateTime;


    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHorseId() {
        return horseId;
    }

    public void setHorseId(int horseId) {
        this.horseId = horseId;
    }

    public double getEdiScore() {
        return ediScore;
    }

    public void setEdiScore(float ediScore) {
        this.ediScore = ediScore;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getRise() {
        return rise;
    }

    public void setRise(float rise) {
        this.rise = rise;
    }

    public double getRolls() {
        return rolls;
    }

    public void setRolls(float rolls) {
        this.rolls = rolls;
    }

    public double getFalls() {
        return falls;
    }

    public void setFalls(float falls) {
        this.falls = falls;
    }

    public double getLyingDown() {
        return lyingDown;
    }

    public void setLyingDown(float lyingDown) {
        this.lyingDown = lyingDown;
    }

    public String getShakes() {
        return shakes;
    }

    public void setShakes(String shakes) {
        this.shakes = shakes;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getCollectionDateTime() {
        return collectionDateTime;
    }

    public void setCollectionDateTime(String collectionDateTime) {
        this.collectionDateTime = collectionDateTime;
    }




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeInt(id);
        dest.writeInt(horseId);
        dest.writeDouble(ediScore);
        dest.writeInt(heartRate);
        dest.writeInt(respiratoryRate);
        dest.writeDouble(rise);
        dest.writeDouble(rolls);
        dest.writeDouble(falls);
        dest.writeDouble(lyingDown);
        dest.writeString(shakes);
        dest.writeString(geo);
        dest.writeString(collectionDateTime);


    }

    public static final Parcelable.Creator CREATOR =
            new Parcelable.Creator() {
                public Metrics createFromParcel(Parcel in) {
                    return new Metrics(in);
                }

                public Metrics[] newArray(int size) {
                    return new Metrics[size];
                }
            };

    private Metrics(Parcel in) {
        id = in.readInt();
        horseId = in.readInt();
        ediScore = in.readDouble();
        heartRate = in.readInt();
        respiratoryRate = in.readInt();
        rise = in.readDouble();
        rolls = in.readDouble();
        falls = in.readDouble();
        lyingDown = in.readDouble();
        shakes = in.readString();
        geo = in.readString();
        collectionDateTime = in.readString();


    }
}