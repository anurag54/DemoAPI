package com.example.anuragv.NightWatch5.Dashboard;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Metrics implements Parcelable {

    private Double ediScore;
    private List<Bio> bio = new ArrayList<Bio>();
    private List<Behavior> behavior = new ArrayList<Behavior>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Metrics() {
    }

    /**
     *
     * @param ediScore
     * @param bio
     * @param behavior
     */
    public Metrics(Double ediScore, List<Bio> bio, List<Behavior> behavior) {
        this.ediScore = ediScore;
        this.bio = bio;
        this.behavior = behavior;
    }

    /**
     *
     * @return
     * The ediScore
     */
    public Double getEdiScore() {
        return ediScore;
    }

    /**
     *
     * @param ediScore
     * The edi_score
     */
    public void setEdiScore(Double ediScore) {
        this.ediScore = ediScore;
    }

    /**
     *
     * @return
     * The bio
     */
    public List<Bio> getBio() {
        return bio;
    }

    /**
     *
     * @param bio
     * The bio
     */
    public void setBio(List<Bio> bio) {
        this.bio = bio;
    }

    /**
     *
     * @return
     * The behavior
     */
    public List<Behavior> getBehavior() {
        return behavior;
    }

    /**
     *
     * @param behavior
     * The behavior
     */
    public void setBehavior(List<Behavior> behavior) {
        this.behavior = behavior;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(ediScore);
        dest.writeList(bio);
        dest.writeList(behavior);

    }
}


