package com.rqmana.xsnake;

import android.os.Bundle;

import com.rqmana.xsnake.base.GameActivity;

public class SnakeGameActivity extends GameActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		
		//before activity is created : cold start
        //switch back to original Theme (App Theme)
        setTheme(R.style.AppTheme);

		switchFullscreen();
		setContentView(new SnakeGamePanel(this));
	}
}
