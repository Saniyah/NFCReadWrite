package com.example.nfcreadwrite;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btag = (Button)findViewById(R.id.buttontag);
		btag.setOnClickListener(new OnClickListener(){
			// @Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this, TagDispatch.class));	
			}
		});
		
		Button bbeam = (Button)findViewById(R.id.buttonbeam);
		bbeam.setOnClickListener(new OnClickListener(){
			// @Override
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this, BeamData.class));	
			}
		});
	}
}
