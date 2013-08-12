package mazen.ElectronicsProjects.resistancecalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;

public class BandResistor5 extends Activity {
	
	Spinner spin1Band5;
	Spinner spin2Band5;
	Spinner spin3Band5;
	Spinner spinMultiply5;
	Spinner spin1Tolerance5;
	TextView txtResistance;
	TextView txtTolerance;
	
	int ColorArrayBand[] = {0,100,200,300,400,500,600,700,800,900};
	int ColorArrayBand2[] = {0,10,20,30,40,50,60,70,80,90};
	int ColorArrayBand3[] = {0,1,2,3,4,5,6,7,8,9};
	long ColorArrayMultiplier[] = {1,10,100,1000,10000,100000,1000000,10000000};
	double ColorArrayTolerance[] = {0.01,0.02,0.005,0.0025,0.001,0.0005,0.05,0.1};
	
	long TotalResistance = 0;
	double Tolerance = 0.0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_band_resistor5);
		// Show the Up button in the action bar.
		setupActionBar();
		
		spin1Band5 = (Spinner) findViewById(R.id.Spin1Band5);
		spin2Band5 = (Spinner) findViewById(R.id.Spin2Band5);
		spin3Band5 = (Spinner) findViewById(R.id.Spin3Band5);
		spinMultiply5 = (Spinner) findViewById(R.id.SpinMultiply5);
		spin1Tolerance5 = (Spinner) findViewById(R.id.spinTolerance5);
		
		txtResistance = (TextView) findViewById(R.id.txtVTotalResistance5);
		txtTolerance = (TextView) findViewById(R.id.txtVTolerance5);
		
		spin1Band5.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				
				update5BandResistance();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		spin1Tolerance5.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				
				update5BandResistance();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		spin2Band5.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				
				update5BandResistance();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		spinMultiply5.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				
				update5BandResistance();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void update5BandResistance(){
		String unity;
		TotalResistance = (ColorArrayBand[spin1Band5.getSelectedItemPosition()]+ColorArrayBand2[spin2Band5.getSelectedItemPosition()]+ColorArrayBand3[spin3Band5.getSelectedItemPosition()]) * ColorArrayMultiplier[spinMultiply5.getSelectedItemPosition()];
		Tolerance = TotalResistance * ColorArrayTolerance[spin1Tolerance5.getSelectedItemPosition()];
		if(TotalResistance>=1000000){
			TotalResistance/=1000000;
			unity = "M Ohm";
		}
		else if (TotalResistance>=1000){
			TotalResistance /= 1000;
			unity = "K Ohm";
		}
		else {
			unity = "Ohm";
		}
		txtTolerance.setText(String.valueOf(TotalResistance + Tolerance)+"/"+String.valueOf(TotalResistance - Tolerance));
		txtResistance.setText("R = "+String.valueOf(TotalResistance)+unity);		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.band_resistor5, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
