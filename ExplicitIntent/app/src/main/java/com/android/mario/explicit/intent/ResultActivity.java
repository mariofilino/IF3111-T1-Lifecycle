package com.android.mario.explicit.intent;

/**
 * Created by Sakurai on 2/7/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

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

    @Override
    public void finish() {

        // Create new intent
        Intent intent = new Intent();

        // Read the data of the EditText field
        EditText text = (EditText) findViewById(R.id.returnValue);

        // Put the text from EditText
        intent.putExtra("value2", text.getText().toString());

        setResult(RESULT_OK, intent);

        super.finish();
    }
}
