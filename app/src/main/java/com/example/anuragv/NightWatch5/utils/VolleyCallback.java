package com.example.anuragv.NightWatch5.utils;
import org.json.JSONArray;
import org.json.JSONObject;


public interface VolleyCallback{
    void onSuccess(JSONObject string);
    void onSuccess1(JSONArray string);
    void customOnSuccess(JSONObject string);
}
