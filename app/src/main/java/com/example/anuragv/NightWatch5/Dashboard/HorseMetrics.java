package com.example.anuragv.NightWatch5.Dashboard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.anuragv.NightWatch5.Login.UserData;
import com.example.anuragv.NightWatch5.MyHorses.Horse;
import com.example.anuragv.NightWatch5.MyHorses.HorseDetails;
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


public class HorseMetrics extends Activity{

    private String TAG2 = HorseMetrics.class.getSimpleName();
    private TextView textView,textView1,textView2,textView3,textView4,textView5,textView6;
    private ImageView imageView,btn_show;


    private String Token_type="";
    private String Access_token="";
    private String registeredName = "";

    String head = "";
    Metrics m1;
    UserData logd;
    Point p;
    Horse h1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metrics_horse);

        setAuthHeader();

        horseMetrics();

        textView = (TextView) findViewById(R.id.text_heart_score);
        textView1 = (TextView) findViewById(R.id.text_respiratory_score);
        textView2 = (TextView) findViewById(R.id.text_lying_down_score);
        textView3 = (TextView) findViewById(R.id.text_rolls_score);
        textView4 = (TextView) findViewById(R.id.text_risefall_score);
        textView5 = (TextView) findViewById(R.id.text_ediScore);
        textView6 = (TextView) findViewById(R.id.text_duke);

        imageView = (ImageView) findViewById(R.id.image_back_arrow);
        btn_show = (ImageView) findViewById(R.id.image_questionmark);

        Intent i = new Intent("com.example.anuragv.NightWatch5.Dashboard.Metrics");
        registeredName = getIntent().getStringExtra("registeredName");

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                //Open popup window
                if (p != null)
                    showPopup(HorseMetrics.this, p);
            }
        });



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


                    for (int i = 0; i < response.length(); i++) {

                        JSONObject jsonobj = (JSONObject) response .get(i);

                   //     m1 = new Metrics(jsonobj.getDouble("edi_score"),);

//                        int heartRate = m1.getHeartRate();
//                        textView.setText(Integer.toString(heartRate));
//
//                        int respiratoryRate = m1.getRespiratoryRate();
//                        textView1.setText(Integer.toString(respiratoryRate));
//
//                        double lyingDown = m1.getLyingDown();
//                        textView2.setText(Double.toString(lyingDown));
//
//                        double rolls = m1.getRolls();
//                        textView3.setText(Double.toString(rolls));
//
//                        double rise = m1.getRise();
//                        textView4.setText(Double.toString(rise));
//
                        double ediScore = m1.getEdiScore();
                        textView5.setText(Double.toString(ediScore));

//                        String registeredName = h1.getRegisteredName();
//                        textView6.setText(registeredName);

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

    //Layout for Back button

    public void onClick(View v) {
        super.finish();
        Intent intent1 = new Intent(HorseMetrics.this,HorseDetails.class);
        intent1.putExtra("Back btn",logd);
        startActivity(intent1);
        Log.d("Back","back");
    }



    public void onWindowFocusChanged(boolean hasFocus) {

        int[] location = new int[2];
        ImageView button = (ImageView) findViewById(R.id.image_questionmark);

        // Get the x, y location and store it in the location[] array
        // location[0] = x, location[1] = y.
        button.getLocationOnScreen(location);

        //Initialize the Point with x, and y positions
        p = new Point();
        p.x = location[0];
        p.y = location[1];
    }

    // The method that displays the popup.
    private void showPopup(final Activity context, Point p) {
        int popupWidth = 1400;
        int popupHeight = 700;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_layout, viewGroup);

        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);


        // Some offset to align the popup a bit to the right, and a bit down, relative to button's position.
        int OFFSET_X = 50;
        int OFFSET_Y = 90;

        // Clear the default translucent background
        popup.setBackgroundDrawable(new BitmapDrawable());

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.NO_GRAVITY, p.x + OFFSET_X, p.y + OFFSET_Y);

        // Getting a reference to Close button, and close the popup when clicked.
        Button close = (Button) layout.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                popup.dismiss();
            }
        });
    }



   }
