package com.example.anuragv.NightWatch5.Login;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.anuragv.NightWatch5.MyHorses.HorseDetails;
import com.example.anuragv.NightWatch5.R;

import com.example.anuragv.NightWatch5.utils.*;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class LoginActivity extends Activity {

    private String TAG = LoginActivity.class.getSimpleName();

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    private TextView txt1;

    private String username = "";
    private String password = "";


    UserData logd;


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        Intent i = new Intent("com.example.anuragv.NightWatch5.Login.UserData");

    }


     public void test() {
         username = editTextUsername.getText().toString();
         password = editTextPassword.getText().toString();
         Log.d("Webservice", "Test 1");
         JSONObject temp = WebServices.makeJsonObjReq(Const.URL_LOGIN, username, password, this, new VolleyCallback(){
             @Override
             public void onSuccess1(JSONArray string) {}


             @Override
             public void onSuccess(JSONObject string){
                 try {

                     // Parsing json array response
                     // loop through each json object

                     logd = new UserData(string.getString("username"),
                             string.getString("roles"),
                             string.getString("token_type"),
                             string.getString("access_token"));

                     Log.d("Result1","result"+logd);

                     openProfile();

                 } catch (Exception e1) {
                     e1.printStackTrace();
                 }

             }

             @Override
             public void customOnSuccess(JSONObject string){}


         });
           //Log.d("Webservice", "Test 3");

         Map<String, String> params = new HashMap<String, String>();
         params.put("username", username);
         params.put("password", password);


     }

    private void openProfile() {
        Intent i = new Intent(LoginActivity.this, HorseDetails.class);
        Log.i("Success1", "success1"+logd);
        i.putExtra("User data", logd);
        startActivity(i);
    }



    public void onClick(View v) {
        test();
        Log.d(TAG,"success");
    }


}
