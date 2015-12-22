package com.example.anuragv.NightWatch5.MyHorses;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.anuragv.NightWatch5.R;
import com.example.anuragv.NightWatch5.utils.ImageRequestQueue;

import java.util.ArrayList;


public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
//    private final String[] name;
//    private final String[] imageId;
//    private final Double[] edi1;
    Horse h1;
    ArrayList<Horse> h2;

    private NetworkImageView mNetworkImageView;
    private ImageLoader mImageLoader;
    final String url = "https://portal.nightwatch24.com/images/horse1.jpg";


    public CustomList(Activity context,
                      ArrayList<Horse> h2) {
        super(context, R.layout.list_single);
        this.context = context;
        this.h2 = h2;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView= inflater.inflate(R.layout.list_single, null, true);

        mImageLoader = ImageRequestQueue.getInstance(getContext()).getImageLoader();

        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        TextView txt4 = (TextView) rowView.findViewById(R.id.test);

//        txtTitle.setText(name[position]);
//        txt4.setText(""+edi1[position]);

//        txtTitle.setText(h2.get(position).getRegisteredName());
//
//        txt4.setText("" + h2.get(position).getEdiScore());

        mNetworkImageView = (NetworkImageView) rowView.findViewById(R.id.img);

        mNetworkImageView.setImageUrl(url, mImageLoader);

        Horse h = h2.get(position);

     //   txtTitle.setText(h.getRegisteredName());



        //Logic to change the drawable color
//        if((edi1[position]>0)&&(edi1[position]<=3))
//        {
//            txt4.setBackground(this.getContext().getApplicationContext().getDrawable(R.drawable.circle_green));
//            txt4.setTextColor(Color.GREEN);
//        }
//
//        else if((edi1[position]>3)&&(edi1[position]<=7))
//        {
//            txt4.setBackground(this.getContext().getApplicationContext().getDrawable(R.drawable.circle_yellow));
//            txt4.setTextColor(Color.YELLOW);
//        }
//
//        else {
//
//            txt4.setBackground(this.getContext().getApplicationContext().getDrawable(R.drawable.circle));
//            txt4.setTextColor(Color.RED);
//        }
//
//        imageView.setImageResource(imageId[position]);
//
//
//        // Alternate color for listView
        if(position%2==0){
            rowView.setBackgroundColor(Color.WHITE);
        }else{
            rowView.setBackgroundColor(Color.TRANSPARENT);
        }
       return rowView;


    }
}