package com.click4tab.gradientbutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GradientButton extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradient_button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_gradient_button, menu);
        return true;
    }
}
