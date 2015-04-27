package com.vogella.android.lifecycle.activity;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.util.Log;

public class TracerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("Tracer","OnCreate()");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.e("Tracer", "OnPause");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.e("Tracer", "OnResume");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.e("Tracer", "OnStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.e("Tracer", "OnDestroy");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.e("Tracer", "onRestoreInstanceState");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.e( "Tracer", "onSaveInstanceState");
	}


	}


