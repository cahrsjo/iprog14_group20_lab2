package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.view.ExampleView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default call to load previous state
    	super.onCreate(savedInstanceState);
    	ExampleView mainView = new ExampleView(findViewById(R.id.this_is_example_view_id));
    	// Set the view for the main activity screen
    	// it must come before any call to findViewById method
        setContentView(R.layout.activity_main);
        
        Button switchButton = (Button) findViewById(R.id.button1);
		
		switchButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				startActivity(intent);
			}
		});
    	// Creating the view class instance
    	


    }

}
