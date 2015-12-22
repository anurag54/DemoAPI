package com.example.anuragv.NightWatch5.Dashboard;


import android.os.Parcel;
import android.os.Parcelable;

public class Bio implements Parcelable {

    private Integer id;
    private String type;
    private Integer heartRate;
    private String heartRateState;
    private Integer heartRateMin;
    private Integer heartRateMax;
    private Integer respiratoryRate;
    private String respiratoryRateState;
    private Integer respiratoryRateMin;
    private Integer respiratoryRateMax;
    private Integer temperature;
    private String temperatureState;
    private Integer temperatureMin;
    private Integer temperatureMax;
    private Integer horseId;
    private Integer collectionDateTime;

    /**
     * No args constructor for use in serialization
     *
     */
    public Bio() {
    }


    public Bio(Integer id, String type, Integer heartRate, String heartRateState, Integer heartRateMin, Integer heartRateMax, Integer respiratoryRate, String respiratoryRateState, Integer respiratoryRateMin, Integer respiratoryRateMax, Integer temperature, String temperatureState, Integer temperatureMin, Integer temperatureMax, Integer horseId, Integer collectionDateTime) {
        this.id = id;
        this.type = type;
        this.heartRate = heartRate;
        this.heartRateState = heartRateState;
        this.heartRateMin = heartRateMin;
        this.heartRateMax = heartRateMax;
        this.respiratoryRate = respiratoryRate;
        this.respiratoryRateState = respiratoryRateState;
        this.respiratoryRateMin = respiratoryRateMin;
        this.respiratoryRateMax = respiratoryRateMax;
        this.temperature = temperature;
        this.temperatureState = temperatureState;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        this.horseId = horseId;
        this.collectionDateTime = collectionDateTime;
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
     * The heartRate
     */
    public Integer getHeartRate() {
        return heartRate;
    }

    /**
     *
     * @param heartRate
     * The heart_rate
     */
    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    /**
     *
     * @return
     * The heartRateState
     */
    public String getHeartRateState() {
        return heartRateState;
    }

    /**
     *
     * @param heartRateState
     * The heart_rate_state
     */
    public void setHeartRateState(String heartRateState) {
        this.heartRateState = heartRateState;
    }

    /**
     *
     * @return
     * The heartRateMin
     */
    public Integer getHeartRateMin() {
        return heartRateMin;
    }

    /**
     *
     * @param heartRateMin
     * The heart_rate_min
     */
    public void setHeartRateMin(Integer heartRateMin) {
        this.heartRateMin = heartRateMin;
    }

    /**
     *
     * @return
     * The heartRateMax
     */
    public Integer getHeartRateMax() {
        return heartRateMax;
    }

    /**
     *
     * @param heartRateMax
     * The heart_rate_max
     */
    public void setHeartRateMax(Integer heartRateMax) {
        this.heartRateMax = heartRateMax;
    }

    /**
     *
     * @return
     * The respiratoryRate
     */
    public Integer getRespiratoryRate() {
        return respiratoryRate;
    }

    /**
     *
     * @param respiratoryRate
     * The respiratory_rate
     */
    public void setRespiratoryRate(Integer respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    /**
     *
     * @return
     * The respiratoryRateState
     */
    public String getRespiratoryRateState() {
        return respiratoryRateState;
    }

    /**
     *
     * @param respiratoryRateState
     * The respiratory_rate_state
     */
    public void setRespiratoryRateState(String respiratoryRateState) {
        this.respiratoryRateState = respiratoryRateState;
    }

    /**
     *
     * @return
     * The respiratoryRateMin
     */
    public Integer getRespiratoryRateMin() {
        return respiratoryRateMin;
    }

    /**
     *
     * @param respiratoryRateMin
     * The respiratory_rate_min
     */
    public void setRespiratoryRateMin(Integer respiratoryRateMin) {
        this.respiratoryRateMin = respiratoryRateMin;
    }

    /**
     *
     * @return
     * The respiratoryRateMax
     */
    public Integer getRespiratoryRateMax() {
        return respiratoryRateMax;
    }

    /**
     *
     * @param respiratoryRateMax
     * The respiratory_rate_max
     */
    public void setRespiratoryRateMax(Integer respiratoryRateMax) {
        this.respiratoryRateMax = respiratoryRateMax;
    }

    /**
     *
     * @return
     * The temperature
     */
    public Integer getTemperature() {
        return temperature;
    }

    /**
     *
     * @param temperature
     * The temperature
     */
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    /**
     *
     * @return
     * The temperatureState
     */
    public String getTemperatureState() {
        return temperatureState;
    }

    /**
     *
     * @param temperatureState
     * The temperature_state
     */
    public void setTemperatureState(String temperatureState) {
        this.temperatureState = temperatureState;
    }

    /**
     *
     * @return
     * The temperatureMin
     */
    public Integer getTemperatureMin() {
        return temperatureMin;
    }

    /**
     *
     * @param temperatureMin
     * The temperature_min
     */
    public void setTemperatureMin(Integer temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    /**
     *
     * @return
     * The temperatureMax
     */
    public Integer getTemperatureMax() {
        return temperatureMax;
    }

    /**
     *
     * @param temperatureMax
     * The temperature_max
     */
    public void setTemperatureMax(Integer temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    /**
     *
     * @return
     * The horseId
     */
    public Integer getHorseId() {
        return horseId;
    }

    /**
     *
     * @param horseId
     * The horse_id
     */
    public void setHorseId(Integer horseId) {
        this.horseId = horseId;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(type);
        dest.writeInt(heartRate);
        dest.writeString(heartRateState);
        dest.writeInt(heartRateMin);
        dest.writeInt(heartRateMax);
        dest.writeInt(respiratoryRate);
        dest.writeString(respiratoryRateState);
        dest.writeInt(respiratoryRateMin);
        dest.writeInt(respiratoryRateMax);
        dest.writeInt(temperature);
        dest.writeString(temperatureState);
        dest.writeInt(temperatureMin);
        dest.writeInt(temperatureMax);
        dest.writeInt(horseId);
        dest.writeInt(collectionDateTime);

    }
}