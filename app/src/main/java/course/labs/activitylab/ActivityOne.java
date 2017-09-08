package course.labs.activitylab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ActivityOne extends Activity {

		// string for logcat documentation
		private final static String TAG = "Lab-ActivityOne";

		// lifecycle counts
		//TODO: Create 7 counter variables, each corresponding to a different one of the lifecycle callback methods.
		private int createCounter = 0;
		private int startCounter = 0;
		private int resumeCounter = 0;
		private int pauseCounter = 0;
		private int stopCounter = 0;
		private int destroyCounter = 0;
		private int restartCounter = 0;


	//TODO:  increment the variables' values when their corresponding lifecycle methods get called.
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_one);
			
			//Log cat print out
			Log.i(TAG, "onCreate called");

			//TODO: update the appropriate count variable & update the view
			createCounter++;
			updateCounters();
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_one, menu);
			return true;
		}
		
		// lifecycle callback overrides
		
		@Override
		public void onStart(){
			super.onStart();
			
			//Log cat print out
			Log.i(TAG, "onStart called");
			
			//TODO:  update the appropriate count variable & update the view
			startCounter++;
			updateCounters();
		}

	    // TODO: implement 5 missing lifecycle callback methods

		@Override
		public void onResume(){
			super.onResume();

			//Log cat print out
			Log.i(TAG, "onResume called");

			resumeCounter++;
			updateCounters();
		}

		@Override
		public void onPause(){
			super.onPause();

			//Log cat print out
			Log.i(TAG, "onPause called");

			pauseCounter++;
			updateCounters();
		}

		@Override
		public void onStop(){
			super.onStop();

			//Log cat print out
			Log.i(TAG, "onStop called");

			stopCounter++;
			updateCounters();
		}

		@Override
		public void onDestroy(){
			super.onDestroy();

			//Log cat print out
			Log.i(TAG, "onDestroy called");

			destroyCounter++;
			updateCounters();
		}

		@Override
		public void onRestart(){
			super.onRestart();

			//Log cat print out
			Log.i(TAG, "onRestart called");

			restartCounter++;
			updateCounters();
		}

		@Override
		public void onSaveInstanceState(Bundle savedInstanceState){
			//TODO:  save state information with a collection of key-value pairs & save all  count variables

			super.onSaveInstanceState(savedInstanceState);
			Log.d(TAG, "onSaveInstanceState()");
			savedInstanceState.putInt("createCounter", createCounter);
			savedInstanceState.putInt("startCounter", startCounter);
			savedInstanceState.putInt("resumeCounter", resumeCounter);
			savedInstanceState.putInt("pauseCounter", pauseCounter);
			savedInstanceState.putInt("stopCounter", stopCounter);
			savedInstanceState.putInt("destroyCounter", destroyCounter);
			savedInstanceState.putInt("restartCounter", restartCounter);
		}

		// only called if activity killed
		// restore savedInstanceState here or in onCreate(Bundle)
		public void onRestoreInstanceState(Bundle savedInstanceState) {
			super.onRestoreInstanceState(savedInstanceState);
			Log.d(TAG, "onRestoreInstanceState()");
			// restore savedInstanceState here or in onCreate(Bundle)
			createCounter = savedInstanceState.getInt("createCounter");
			startCounter = savedInstanceState.getInt("startCounter");
			resumeCounter = savedInstanceState.getInt("resumeCounter");
			pauseCounter = savedInstanceState.getInt("pauseCounter");
			stopCounter = savedInstanceState.getInt("stopCounter");
			destroyCounter = savedInstanceState.getInt("destroyCounter");
			restartCounter = savedInstanceState.getInt("restardCounter");

			updateCounters();
		}

		private void updateCounters(){
			TextView createTextView = (TextView) findViewById(R.id.create);
			createTextView.setText("onCreate() calls: " + createCounter);

			TextView startTextView = (TextView) findViewById(R.id.start);
			startTextView.setText("onStart() calls: " + startCounter);

			TextView resumeTextView = (TextView) findViewById(R.id.resume);
			resumeTextView.setText("onResume() calls: " + resumeCounter);

			TextView pauseTextView = (TextView) findViewById(R.id.pause);
			pauseTextView.setText("onPause() calls: " + pauseCounter);

			TextView stopTextView = (TextView) findViewById(R.id.stop);
			stopTextView.setText("onStop() calls: " + stopCounter);

			TextView destroyTextView = (TextView) findViewById(R.id.destroy);
			destroyTextView.setText("onDestroy() calls: " + destroyCounter);

			TextView restartTextView = (TextView) findViewById(R.id.restart);
			restartTextView.setText("onRestart() calls: " + restartCounter);

		}

		public void launchActivityTwo(View view) {

			startActivity(new Intent(this, ActivityTwo.class));
		}
		

}
