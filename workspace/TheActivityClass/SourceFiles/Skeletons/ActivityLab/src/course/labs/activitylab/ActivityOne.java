package course.labs.activitylab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityOne extends BaseActivity {
	
	// String for LogCat documentation
	protected final static String TAG = "Lab-ActivityOne";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		_tag = TAG;
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one);
		// TODO: Assign the appropriate TextViews to the TextView variables
		// Hint: Access the TextView by calling Activity's findViewById()
		// textView1 = (TextView) findViewById(R.id.textView1);


		Button launchActivityTwoButton = (Button) findViewById(R.id.bLaunchActivityTwo); 
		launchActivityTwoButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO:
				// Launch Activity Two
				// Hint: use Context's startActivity() method
				
				// Create an intent stating which Activity you would like to start
				Intent intent = new Intent(ActivityOne.this, ActivityTwo.class);
				startActivity(intent);
				// Launch the Activity using the intent
			}
		});
		


		// TODO: Emit LogCat message

		// TODO:
		// Update the appropriate count variable
		// Update the user interface via the displayCounts() method
	}
}
