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
			TextView textView = (TextView) findViewById(R.id.create);
			textView.setText("onCreate() calls: " + createCounter);
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
			TextView textView = (TextView) findViewById(R.id.start);
			textView.setText("onStart() calls: " + startCounter);
		}

	    // TODO: implement 5 missing lifecycle callback methods

		@Override
		public void onResume(){
			super.onResume();

			//Log cat print out
			Log.i(TAG, "onResume called");

			resumeCounter++;
			TextView textView = (TextView) findViewById(R.id.resume);
			textView.setText("onResume() calls: " + resumeCounter);
		}

		@Override
		public void onPause(){
			super.onPause();

			//Log cat print out
			Log.i(TAG, "onPause called");

			pauseCounter++;
			TextView textView = (TextView) findViewById(R.id.pause);
			textView.setText("onPause() calls: " + pauseCounter);
		}

		@Override
		public void onStop(){
			super.onStop();

			//Log cat print out
			Log.i(TAG, "onStop called");

			stopCounter++;
			TextView textView = (TextView) findViewById(R.id.stop);
			textView.setText("onStop() calls: " + stopCounter);
		}

		@Override
		public void onDestroy(){
			super.onDestroy();

			//Log cat print out
			Log.i(TAG, "onDestroy called");

			destroyCounter++;
			TextView textView = (TextView) findViewById(R.id.destroy);
			textView.setText("onDestroy() calls: " + destroyCounter);
		}

		@Override
		public void onRestart(){
			super.onRestart();

			//Log cat print out
			Log.i(TAG, "onRestart called");

			restartCounter++;
			TextView textView = (TextView) findViewById(R.id.restart);
			textView.setText("onRestart() calls: " + restartCounter);
		}

		@Override
		public void onSaveInstanceState(Bundle savedInstanceState){
			//TODO:  save state information with a collection of key-value pairs & save all  count variables
		}


		public void launchActivityTwo(View view) {
			startActivity(new Intent(this, ActivityTwo.class));
		}
		

}
