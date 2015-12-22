
package com.example.anuragv.NightWatch5.Dashboard;


import android.os.Parcel;
import android.os.Parcelable;

public class Behavior implements Parcelable {

    private Integer id;
    private String type;
    private Integer collectionDateTime;
    private Double avgRiseFall;
    private String avgRiseFallState;
    private Integer avgRiseFallMin;
    private Integer avgRiseFallMax;
    private Double avgLying;
    private String avgLyingState;
    private Integer avgLyingMin;
    private Integer avgLyingMax;
    private Double avgRolls;
    private String avgRollsState;
    private Integer avgRollsMin;
    private Integer avgRollsMax;

    /**
     * No args constructor for use in serialization
     *
     */
    public Behavior() {
    }

    /**
     *
     * @param avgRollsMax
     * @param avgRiseFallState
     * @param type
     * @param avgLyingMin
     * @param avgRiseFallMin
     * @param avgRiseFallMax
     * @param id
     * @param avgLyingMax
     * @param avgLyingState
     * @param avgLying
     * @param avgRolls
     * @param avgRollsState
     * @param avgRiseFall
     * @param avgRollsMin
     * @param collectionDateTime
     */
    public Behavior(Integer id, String type, Integer collectionDateTime, Double avgRiseFall, String avgRiseFallState, Integer avgRiseFallMin, Integer avgRiseFallMax, Double avgLying, String avgLyingState, Integer avgLyingMin, Integer avgLyingMax, Double avgRolls, String avgRollsState, Integer avgRollsMin, Integer avgRollsMax) {
        this.id = id;
        this.type = type;
        this.collectionDateTime = collectionDateTime;
        this.avgRiseFall = avgRiseFall;
        this.avgRiseFallState = avgRiseFallState;
        this.avgRiseFallMin = avgRiseFallMin;
        this.avgRiseFallMax = avgRiseFallMax;
        this.avgLying = avgLying;
        this.avgLyingState = avgLyingState;
        this.avgLyingMin = avgLyingMin;
        this.avgLyingMax = avgLyingMax;
        this.avgRolls = avgRolls;
        this.avgRollsState = avgRollsState;
        this.avgRollsMin = avgRollsMin;
        this.avgRollsMax = avgRollsMax;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The collectionDateTime
     */
    public Integer getCollectionDateTime() {
        return collectionDateTime;
    }

    /**
     *
     * @param collectionDateTime
     * The collection_date_time
     */
    public void setCollectionDateTime(Integer collectionDateTime) {
        this.collectionDateTime = collectionDateTime;
    }

    /**
     *
     * @return
     * The avgRiseFall
     */
    public Double getAvgRiseFall() {
        return avgRiseFall;
    }

    /**
     *
     * @param avgRiseFall
     * The avg_rise_fall
     */
    public void setAvgRiseFall(Double avgRiseFall) {
        this.avgRiseFall = avgRiseFall;
    }

    /**
     *
     * @return
     * The avgRiseFallState
     */
    public String getAvgRiseFallState() {
        return avgRiseFallState;
    }

    /**
     *
     * @param avgRiseFallState
     * The avg_rise_fall_state
     */
    public void setAvgRiseFallState(String avgRiseFallState) {
        this.avgRiseFallState = avgRiseFallState;
    }

    /**
     *
     * @return
     * The avgRiseFallMin
     */
    public Integer getAvgRiseFallMin() {
        return avgRiseFallMin;
    }

    /**
     *
     * @param avgRiseFallMin
     * The avg_rise_fall_min
     */
    public void setAvgRiseFallMin(Integer avgRiseFallMin) {
        this.avgRiseFallMin = avgRiseFallMin;
    }

    /**
     *
     * @return
     * The avgRiseFallMax
     */
    public Integer getAvgRiseFallMax() {
        return avgRiseFallMax;
    }

    /**
     *
     * @param avgRiseFallMax
     * The avg_rise_fall_max
     */
    public void setAvgRiseFallMax(Integer avgRiseFallMax) {
        this.avgRiseFallMax = avgRiseFallMax;
    }

    /**
     *
     * @return
     * The avgLying
     */
    public Double getAvgLying() {
        return avgLying;
    }

    /**
     *
     * @param avgLying
     * The avg_lying
     */
    public void setAvgLying(Double avgLying) {
        this.avgLying = avgLying;
    }

    /**
     *
     * @return
     * The avgLyingState
     */
    public String getAvgLyingState() {
        return avgLyingState;
    }

    /**
     *
     * @param avgLyingState
     * The avg_lying_state
     */
    public void setAvgLyingState(String avgLyingState) {
        this.avgLyingState = avgLyingState;
    }

    /**
     *
     * @return
     * The avgLyingMin
     */
    public Integer getAvgLyingMin() {
        return avgLyingMin;
    }

    /**
     *
     * @param avgLyingMin
     * The avg_lying_min
     */
    public void setAvgLyingMin(Integer avgLyingMin) {
        this.avgLyingMin = avgLyingMin;
    }

    /**
     *
     * @return
     * The avgLyingMax
     */
    public Integer getAvgLyingMax() {
        return avgLyingMax;
    }

    /**
     *
     * @param avgLyingMax
     * The avg_lying_max
     */
    public void setAvgLyingMax(Integer avgLyingMax) {
        this.avgLyingMax = avgLyingMax;
    }

    /**
     *
     * @return
     * The avgRolls
     */
    public Double getAvgRolls() {
        return avgRolls;
    }

    /**
     *
     * @param avgRolls
     * The avg_rolls
     */
    public void setAvgRolls(Double avgRolls) {
        this.avgRolls = avgRolls;
    }

    /**
     *
     * @return
     * The avgRollsState
     */
    public String getAvgRollsState() {
        return avgRollsState;
    }

    /**
     *
     * @param avgRollsState
     * The avg_rolls_state
     */
    public void setAvgRollsState(String avgRollsState) {
        this.avgRollsState = avgRollsState;
    }

    /**
     *
     * @return
     * The avgRollsMin
     */
    public Integer getAvgRollsMin() {
        return avgRollsMin;
    }

    /**
     *
     * @param avgRollsMin
     * The avg_rolls_min
     */
    public void setAvgRollsMin(Integer avgRollsMin) {
        this.avgRollsMin = avgRollsMin;
    }

    /**
     *
     * @return
     * The avgRollsMax
     */
    public Integer getAvgRollsMax() {
        return avgRollsMax;
    }

    /**
     *
     * @param avgRollsMax
     * The avg_rolls_max
     */
    public void setAvgRollsMax(Integer avgRollsMax) {
        this.avgRollsMax = avgRollsMax;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(type);
        dest.writeInt(collectionDateTime);
        dest.writeDouble(avgRiseFall);
        dest.writeString(avgRiseFallState);
        dest.writeInt(avgRiseFallMin);
        dest.writeInt(avgRiseFallMax);
        dest.writeDouble(avgLying);
        dest.writeString(avgLyingState);
        dest.writeInt(avgLyingMin);
        dest.writeInt(avgLyingMax);
        dest.writeDouble(avgRolls);
        dest.writeString(avgRollsState);
        dest.writeInt(avgRollsMin);
        dest.writeInt(avgRollsMax);

    }
}