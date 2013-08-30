package nl.frankkie.bronymlpblindbagguide;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by FrankkieNL on 27-8-13.
 */
public class CreditsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
    }

    public void initUI(){
        setContentView(R.layout.activity_credits);
    }
}
