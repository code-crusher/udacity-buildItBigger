package github.vatsal.gradle.builditbigger;

import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

import github.vatsal.gradle.builditbiggerbackend.jokerapi.Jokerapi;

/**
 * Created by
 * --Vatsal Bajpai on
 * --02/09/16 at
 * --12:30 AM
 */
public class JokeLoadTask extends AsyncTask<Void, Void, String> {

    private static Jokerapi myApiService = null;

    @Override
    protected String doInBackground(Void... voids) {

        if (myApiService == null) {  // Only do this once
            Jokerapi.Builder builder = new Jokerapi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("https://chrome-duality-427.appspot.com//_ah/api/");
            myApiService = builder.build();
        }

        try {
            return myApiService.tossMeJoke().execute().getData();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
