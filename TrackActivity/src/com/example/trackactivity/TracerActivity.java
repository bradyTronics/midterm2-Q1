package com.example.trackactivity;

import com.example.trackactivity2.R;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.util.Log;

public class TracerActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.i("Tracer","On Create Executed");
	}

	@Override protected void onPause(){
		super.onPause();
		Log.i("Tracer","On Pause Executed");
	}

	@Override
	protected void onResume(){
		super.onResume();
		Log.i("Tracer","On Resume Executed");
	}

	@Override
	protected void onStop(){
		super.onStop();
		Log.i("Tracer","On Stop Executed");
	}

	@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.i("Tracer","On Destroy Executed");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState){
		super.onRestoreInstanceState(savedInstanceState);
		Log.i("Tracer","On Restore Instance State Executed");
	}
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.i("Tracer","On Save Instance State Executed");
	}
}
