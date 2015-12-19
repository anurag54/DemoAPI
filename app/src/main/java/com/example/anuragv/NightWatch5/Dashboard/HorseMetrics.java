package com.example.anuragv.NightWatch5.Dashboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.anuragv.NightWatch5.Login.UserData;
import com.example.anuragv.NightWatch5.MyHorses.Horse;
import com.example.anuragv.NightWatch5.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import com.example.anuragv.NightWatch5.Dashboard.HorseMetrics;
import com.example.anuragv.NightWatch5.Dashboard.*;
import com.example.anuragv.NightWatch5.utils.Const;
import com.example.anuragv.NightWatch5.utils.VolleyCallback;
import com.example.anuragv.NightWatch5.utils.WebServices;


public class HorseMetrics extends Activity {

    private String TAG2 = HorseMetrics.class.getSimpleName();
    private TextView textView;



//    private String username="kjtexas";
//    private String password="demoPass1";

    private String Token_type="";
    private String Access_token="";

    String head = "";
    Metrics m1;
    UserData logd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metrics_horse);

        setAuthHeader();

        horseMetrics();

        textView = (TextView) findViewById(R.id.text_heart_score);

        Intent i = new Intent("com.example.anuragv.NightWatch5.Dashboard.Metrics");

    }

    private void setAuthHeader(){
        logd = getIntent().getParcelableExtra("Metrics");
        Log.i("TEST ", "" + logd);
        head = logd.getToken_type() + " " + logd.getAccess_token();
    }


    public void horseMetrics() {

        Log.i("HEADER ", head);
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization",head);

        JSONArray temp2 = WebServices.makeJsonArrayReq(Const.URL_DASHBOARD, Token_type, Access_token, this, head,new VolleyCallback(){
            @Override
            public void onSuccess1(JSONArray response) {
                Log.d("Result3 ", "result3 "+response.toString());
                try {
                    // Parsing json array response
                    // loop through each json object
                    TextView textView;

                    for (int i = 0; i < response.length(); i++) {

                        JSONObject jsonobj = (JSONObject) response .get(i);

                        m1 = new Metrics(jsonobj.getInt("id"),
                                jsonobj.getInt("horseId"),
                                jsonobj.getDouble("ediScore"),
                                jsonobj.getInt("heartRate"),
                                jsonobj.getInt("respiratoryRate"),
                                jsonobj.getDouble("rise"),
                                jsonobj.getDouble("rolls"),
                                jsonobj.getDouble("falls"),
                                jsonobj.getDouble("lyingDown"),
                                jsonobj.getString("shakes"),
                                jsonobj.getString("geo"),
                                jsonobj.getString("collectionDateTime"));

                        int heartrate = m1.getHeartRate();
                       // textView.setText(heartrate);

                       }
                        Log.d("Result3","result3"+logd);


                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onSuccess(JSONObject string){}



            @Override
            public void customOnSuccess(JSONObject string){}


        });


 }


   }
