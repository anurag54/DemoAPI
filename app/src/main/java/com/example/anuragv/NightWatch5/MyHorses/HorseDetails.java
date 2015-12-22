package com.example.anuragv.NightWatch5.MyHorses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;


import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.anuragv.NightWatch5.Dashboard.HorseMetrics;
import com.example.anuragv.NightWatch5.Login.UserData;
import com.example.anuragv.NightWatch5.R;
import com.example.anuragv.NightWatch5.MyHorses.*;

import com.example.anuragv.NightWatch5.MyHorses.Horse;
import com.example.anuragv.NightWatch5.utils.Const;
import com.example.anuragv.NightWatch5.utils.ImageRequestQueue;
import com.example.anuragv.NightWatch5.utils.VolleyCallback;
import com.example.anuragv.NightWatch5.utils.WebServices;


public class HorseDetails extends Activity {

    private String TAG = HorseDetails.class.getSimpleName();
    private TextView text;

    private String Token_type = "";
    private String Access_token = "";

    String head = "";
    UserData logd;
    Boolean b = true;
    ListView list;
    Horse h1;

//    String[] name = {};
//    Double[] edi1 = {};
//    String[] imageId = {};

    ArrayList<Horse> h2;

    CustomList adapter;

    private NetworkImageView mNetworkImageView;
    private ImageLoader mImageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_horse);

        text = (TextView) findViewById(R.id.txt);

        mNetworkImageView = (NetworkImageView) findViewById(R.id.img);

        list = (ListView) findViewById(R.id.list);

        h2 = new ArrayList < Horse > ();

        adapter = new CustomList(HorseDetails.this,h2);

        setAuthHeader();

        horseDetails();

        Intent i = new Intent("com.example.anuragv.NightWatch5.MyHorses.Horse");

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView <? > parent, View view,
                                    int position, long id) {
                Toast.makeText(HorseDetails.this, "You Clicked at ", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void setAuthHeader() {
        logd = getIntent().getParcelableExtra("User data");
        Log.i("TEST ", "TEST1" + logd);
        head = logd.getToken_type() + " " + logd.getAccess_token();
    }

    public void horseDetails() {

        Log.i("HEADER ", head);
        HashMap < String, String > headers = new HashMap < String, String > ();
        headers.put("Authorization", head);

        JSONArray temp1 = WebServices.makeJsonArrayReq(Const.URL_HORSE, Token_type, Access_token, this, head, new VolleyCallback() {
            @Override
            public void onSuccess1(JSONArray response) {
            Log.d("Result ", "result " + response.toString());

            try {
                // Parsing json array response
                // loop through each json object
            //     String[] imageId = {};

                for (int i = 0; i < response.length(); i++) {

                    JSONObject jsonobj = (JSONObject) response.get(i);


                    h1 = new Horse(jsonobj.getInt("id"),
                            jsonobj.getString("picture_url"),
                            jsonobj.getString("thumbnail_url"),
                            jsonobj.getString("registered_name"),
                            jsonobj.getString("birth_date"),
                            jsonobj.getInt("user_id"),
                            jsonobj.getString("nick_name"),
                            jsonobj.getString("sex"),
                            jsonobj.getString("breed"),
                            jsonobj.getDouble("edi_score"),
                            jsonobj.getString("protocol"),
                            jsonobj.getInt("priority"),
                            jsonobj.getString("devices"),
                            jsonobj.getString("active"));


                //    String registeredName = text.getText().toString();
                    Horse h1 = new Horse();
                    h2.add(h1);
                    adapter.notifyDataSetChanged();
              //      list.setAdapter(adapter);


                     openProfile1();


                    // String array for Horse name
//                                            String[] name =  {h1.getRegisteredName(),h1.getRegisteredName(), h1.getRegisteredName(), h1.getRegisteredName(),
//                                                    h1.getRegisteredName(),h1.getRegisteredName(), h1.getRegisteredName() };
//                                            Log.d("WEB","web"+name);


                    // Integer Array for EDI Score
//                                            Double[] edi1 = {h1.getEdiScore(),h1.getEdiScore(),h1.getEdiScore(),h1.getEdiScore(),h1.getEdiScore(),
//                                                    h1.getEdiScore(),h1.getEdiScore()};
//                                            Log.d("EDI","edi"+edi1);
//
//                    adapter = new CustomList(HorseDetails.this,horses);
//                    list.setAdapter(adapter);


                }
                Log.d("Result2", "result2" + logd);


            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

            @Override
            public void onSuccess(JSONObject string) {}



            @Override
            public void customOnSuccess(JSONObject string) {}


        });

    }


    private void openProfile1() {
        Intent intent = new Intent(HorseDetails.this, HorseMetrics.class);
        Log.i("TEST 2", " " + logd);
        intent.putExtra("Metrics", logd);
        intent.putExtra("registeredName",h1.getRegistered_name());
        startActivity(intent);
    }



}