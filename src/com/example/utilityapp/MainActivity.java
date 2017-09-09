package com.example.utilityapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        final EditText e1= (EditText) findViewById(R.id.editText1);
        Button b1= (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1= new Intent(Intent.ACTION_DIAL);
				i1.setData(Uri.parse("tel:"+e1.getText().toString()));
				startActivity(i1);
				
			}
		});
        
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivity(i2);
				
			}
		});
        

        b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i3 = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
				startActivity(i3);
				
			}
		});
        
        
        
        
        
    }
    
}
