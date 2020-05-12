package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Dashboard extends AppCompatActivity {

    private Button check_tableau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        //On récupère l'intent de la page principale
        Intent intent = getIntent();
        //On vérifie que l'intent n'est pas null par précaution
        if (intent != null) {
            //On définit les variables qui vont accueillir nos data
            String str = "";
            String pwd = "";

            //Si dans notre intent on a des extras du nom de login et password alors
            if ((intent.hasExtra("login")) && (intent.hasExtra("password"))){
                //On affecte leur contenus dans les variables créé à cet effet
                str = intent.getStringExtra("login");
                pwd = intent.getStringExtra("password");
            }

            //On initialise les valeurs sur les champs créé pour afin de les afficher
            TextView login = (TextView) findViewById(R.id.login_);
            login.setText(str);

            TextView passwd = (TextView) findViewById(R.id.password_);
            passwd.setText(pwd);
        }
    }
}


