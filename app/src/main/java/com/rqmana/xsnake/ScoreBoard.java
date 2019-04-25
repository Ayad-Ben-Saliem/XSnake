package com.rqmana.xsnake;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.rqmana.xsnake.base.AbstractGamePanel;
import com.rqmana.xsnake.base.actors.PositionedActor;


public class ScoreBoard extends PositionedActor {
	private int score;

	public ScoreBoard(AbstractGamePanel context) {
		super(context.getWidth() - 150, 30);
		this.score = 0;
	}

	@Override
	public void stylePaint(Paint p) {
		p.setTextSize(20);
	}
	
	public void earnPoints(int points) {
		score += points;
	}

	@Override
	public void draw(Canvas canvas) {
		canvas.drawText("Score: " + score, getX(), getY(), getPaint());
	}

}
