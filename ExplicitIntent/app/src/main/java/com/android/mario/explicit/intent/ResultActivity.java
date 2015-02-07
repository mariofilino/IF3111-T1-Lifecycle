package com.android.mario.explicit.intent;

/**
 * Created by Sakurai on 2/7/2015.
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);

        Bundle extras = getIntent().getExtras();

        String value1 = extras.getString("value1");
        TextView t = (TextView) findViewById(R.id.displayintentextra);
        t.setText(value1);
    }
}
