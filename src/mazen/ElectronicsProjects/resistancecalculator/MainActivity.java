package mazen.ElectronicsProjects.resistancecalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Add reference to buttons
		Button btn4BandResistance = (Button) findViewById(R.id.bandResistor4);
		Button btn5BandResistance = (Button) findViewById(R.id.bandResistor5);
		Button btn6BandResistance = (Button) findViewById(R.id.bandResistor6);
		//Add listener for 4 Button
		btn4BandResistance.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent4 = new Intent(MainActivity.this,BandResistor4.class);
				startActivity(intent4);
			}
		});
		
		btn5BandResistance.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent5 = new Intent(MainActivity.this,BandResistor5.class);
				startActivity(intent5);
			}
		});
		
		btn6BandResistance.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent6 = new Intent(MainActivity.this,BandResistor6.class);		
				startActivity(intent6);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
