package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class User {

    // empty constructor needed by the Parceler library
    public User() {}
    public String name;
    public String screenName;
    public String profileImageUrl;
    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.profileImageUrl = jsonObject.getString("profile_image_url_https");
        user.screenName = jsonObject.getString("screen_name");
        return user;
    }
}
