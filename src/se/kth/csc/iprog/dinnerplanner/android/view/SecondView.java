package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import android.view.View;
import android.widget.TextView;
public class SecondView {

	View view;

	public SecondView(View view) {

		// store in the class the reference to the Android View
		this.view = view;

		TextView example = (TextView) view.findViewById(R.id.example_text);
		example.setText("Hello world osv med mera");

		// Setup the rest of the view layout
	}

}
