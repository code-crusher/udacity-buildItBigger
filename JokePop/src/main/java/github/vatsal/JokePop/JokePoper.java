package github.vatsal.JokePop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by
 * --Vatsal Bajpai on
 * --01/09/16 at
 * --11:47 PM
 */
public class JokePoper extends AppCompatActivity {

    private static final String KEY_WALL_ITEM = "key_joke";

    // factory static method
    public static void startActvity(Activity activity, String joke) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_WALL_ITEM, joke);
        Intent intent = new Intent(activity, JokePoper.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_poper);
        this.setFinishOnTouchOutside(false);
        init();
    }

    private void init() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            String joke = bundle.getString(KEY_WALL_ITEM);
            if (joke != null)
                populateView(joke);
        }
    }

    private void populateView(String joke) {
        TextView tvJoke = (TextView) findViewById(R.id.tv_joke);
        tvJoke.setText(joke);
    }
}
