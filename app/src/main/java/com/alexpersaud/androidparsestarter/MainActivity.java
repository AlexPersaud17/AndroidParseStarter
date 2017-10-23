package com.alexpersaud.androidparsestarter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.parse.ParseAnalytics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        PLAYING AROUND WITH PARSE
//        ParseObject score = new ParseObject("Score");
//        score.put("username", "Alex");
//        score.put("score", 100);
//        score.saveInBackground(new SaveCallback() {
//            @Override
//            public void done(ParseException e) {
//                if(e == null){
//                    Log.i("SaveInBackground", "Success");
//                }else{
//                    Log.i("SaveInBackground", "Failed. Error: " + e.toString());
//                }
//            }
//        });
//
//        ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
//        query.getInBackground("lBnHLMukON", new GetCallback<ParseObject>() {
//            @Override
//            public void done(ParseObject object, ParseException e) {
//                if(e == null && object != null){
//                    object.put("score", 200);
//                    object.saveInBackground();
//
//                    Log.i("ObjectValue", object.getString("username"));
//                    Log.i("ObjectValue", Integer.toString(object.getInt("score")));
//                }
//            }
//        });
//
//
//        ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
//        query.whereEqualTo("username", "Alex");
//        query.setLimit(1);
//
//        query.findInBackground(new FindCallback<ParseObject>() {
//            @Override
//            public void done(List<ParseObject> objects, ParseException e) {
//                if(e == null){
//                    Log.i("FindInBackground", "Retrieved " + objects.size() + " objects.");
//                    if(objects.size() > 0){
//                        for (ParseObject object : objects){
//                            Log.i("FindInBackground", object.toString());                        }
//                    }
//                }
//            }
//        });
//
//
//        ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
//        query.whereGreaterThan("score", 200);
//        query.findInBackground(new FindCallback<ParseObject>() {
//            @Override
//            public void done(List<ParseObject> objects, ParseException e) {
//                if(e == null && objects != null){
//                    for(ParseObject object : objects){
//                        object.put("score", object.getInt("score") + 50);
//                        object.saveInBackground();
//                    }
//                }
//            }
//        });


//        USER AUTH
//        ParseUser user = new ParseUser();
//        user.setUsername("alexpersaud");
//        user.setPassword("password");
//
//        user.signUpInBackground(new SignUpCallback() {
//            @Override
//            public void done(ParseException e) {
//                if(e == null){
//                    Log.i("Sign Up", "Successful");
//                }else{
//                    Log.i("Sign Up", "Failed");
//                }
//            }
//        });
//
//        ParseUser.logInInBackground("alexpersaud", "wrong", new LogInCallback() {
//            @Override
//            public void done(ParseUser user, ParseException e) {
//                if(user != null){
//                    Log.i("Log In", "Successful");
//                }else{
//                    Log.i("Log In", "Failed" + e.toString());
//                }
//
//            }
//        });
//
//        ParseUser.logOut();
//
//        if(ParseUser.getCurrentUser() != null){
//            Log.i("Current User", "Username: " + ParseUser.getCurrentUser().getUsername());
//        }else{
//            Log.i("Current User", "User not logged in.");
//        }

        ParseAnalytics.trackAppOpenedInBackground(getIntent());
    }
}
