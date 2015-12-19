package com.example.anuragv.NightWatch5.utils;


import android.app.Activity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.StringRequest;

import com.android.volley.toolbox.Volley;
import com.example.anuragv.NightWatch5.MyHorses.HorseDetails;
import com.example.anuragv.NightWatch5.R;
import com.example.anuragv.NightWatch5.app.AppController;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class WebServices {

    public static String TAG = WebServices.class.getSimpleName();

    public static String tag_json_obj = "jobj_req", tag_json_arry = "jarray_req", tag_string_req = "string_req";

    private TextView msgResponse;

    private NetworkImageView imgNetWorkView;

    private ImageView imageView;

    public static JSONObject responseactual;

    public static JSONArray responseactual1;





    /**
     * Making json object request
     */
    public static JSONObject makeJsonObjReq(String URL, String username, String password, Context context, final VolleyCallback callback) {

        Map<String, String> params = new HashMap<String, String>();
        params.put("username", username);
        params.put("password", password);
        //Log.d("test1","In method");
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.POST,
                URL, new JSONObject(params),
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("test1", "test 2" + response.toString());
                        callback.onSuccess(response);
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                Log.d("Pass", "pass" + error);

            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        requestQueue.add(jsonObjReq);

        return responseactual;
    }


    /**
     * Making json array request
     */
    public static JSONArray makeJsonArrayReq(String URL, String Token_type, String Access_token,Context context,final String head,final VolleyCallback callback) {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization",head);

        JsonArrayRequest jor = new JsonArrayRequest(Request.Method.GET,
                URL, new JSONObject(headers),
                new Response.Listener<JSONArray>(){
                    @Override
                    public void onResponse(JSONArray response) {
                    Log.d("User1", "user1 " + response);
                    callback.onSuccess1(response);
                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Pass1", "pass1" + error);
                        error.printStackTrace();
                    }
                }) {
                     @Override
                        public Map<String, String> getHeaders() throws AuthFailureError {
                            HashMap<String, String> headers = new HashMap<String, String>();
                            headers.put("Authorization",head);
                            return headers;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        requestQueue.add(jor);

        return responseactual1;
    }





        /**
         * Making string request
         * */
    private void makeStringReq() {

        StringRequest strReq = new StringRequest(Request.Method.GET,
                Const.URL_STRING_REQ, new Response.Listener < String > () {

            @Override
            public void onResponse(String response) {
                Log.d(TAG, response.toString());
                msgResponse.setText(response.toString());

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
            }
        });

        // Adding request to request queue
  //      AppController.getInstance().addToRequestQueue(strReq, tag_string_req);

    }


    private void makeImageRequest() {
        ImageLoader imageLoader = AppController.getInstance().getImageLoader();

        // If you are using NetworkImageView
        imgNetWorkView.setImageUrl(Const.URL_IMAGE, imageLoader);


        // If you are using normal ImageView
		/*imageLoader.get(Const.URL_IMAGE, new ImageListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				Log.e(TAG, "Image Load Error: " + error.getMessage());
			}

			@Override
			public void onResponse(ImageContainer response, boolean arg1) {
				if (response.getBitmap() != null) {
					// load image into imageview
					imageView.setImageBitmap(response.getBitmap());
				}
			}
		});*/

        // Loading image with placeholder and error image
        imageLoader.get(Const.URL_IMAGE, ImageLoader.getImageListener(
                imageView, R.drawable.ico_loading, R.drawable.ico_error));

        Cache cache = AppController.getInstance().getRequestQueue().getCache();
        Cache.Entry entry = cache.get(Const.URL_IMAGE);
        if (entry != null) {
            try {
                String data = new String(entry.data, "UTF-8");
                // handle data, like converting it to xml, json, bitmap etc.,
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } else {
            // cached response doesn't exists. Make a network call here
        }

    }


}