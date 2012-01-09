package com.jiahaoliuliu.android.versiondependency;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class VersionDependencyActivity extends Activity {
	
	private static boolean shinyNewAPIS = 
			   android.os.Build.VERSION.SDK_INT > 
			      android.os.Build.VERSION_CODES.ECLAIR_MR1;
			   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    	Intent startActivityIntent = null;
    	if (!shinyNewAPIS) {
    		startActivityIntent = new Intent(this, LegacyActivity.class);
    	} else {
    		startActivityIntent = new Intent(this, HCActivity.class);
    	}

    	startActivity(startActivityIntent);
    	finish();
    }
}