package com.example.anuragv.NightWatch5.Login;

import android.os.Parcel;
import android.os.Parcelable;

public class UserData implements Parcelable {


    private String username;
    private String roles;
    private String token_type;
    private String access_token;



    public UserData(String username, String roles, String token_type, String access_token
    ) {
        this.username = username;
        this.roles = roles;
        this.token_type = token_type;
        this.access_token = access_token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(roles);
        dest.writeString(token_type);
        dest.writeString(access_token);

    }

    public static final Parcelable.Creator CREATOR =
            new Parcelable.Creator() {
                public UserData createFromParcel(Parcel in) {
                    return new UserData(in);
                }

                public UserData[] newArray(int size) {
                    return new UserData[size];
                }
            };

    private UserData(Parcel in) {
        username = in.readString();
        roles = in.readString();
        token_type = in.readString();
        access_token = in.readString();

    }
}