package github.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.ExecutionException;

import github.vatsal.gradle.builditbigger.JokeLoadTask;

/**
 * Created by
 * --Vatsal Bajpai on
 * --02/09/16 at
 * --11:13 AM
 */
public class JokeLoadTaskTest extends AndroidTestCase {

    private static final String TAG = JokeLoadTaskTest.class.getSimpleName();

    public void testFetchesNonEmptyString() {
        JokeLoadTask jokeLoadTask = new JokeLoadTask();
        jokeLoadTask.execute();
        try {
            String joke = jokeLoadTask.get();
            Log.d(TAG, "Joke text: " + joke);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException | ExecutionException e) {
            Log.e(TAG, Log.getStackTraceString(e));
        }
    }
}
