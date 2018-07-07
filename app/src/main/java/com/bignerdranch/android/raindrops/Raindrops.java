package com.bignerdranch.android.raindrops;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class Raindrops extends View{
    private ArrayList<RainDrop> drops = new ArrayList<>();
    private int tick = 0;

    public Raindrops(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint rainColor = new Paint();
        rainColor.setARGB(180,0,0,180);
        rainColor.setStyle(Paint.Style.FILL_AND_STROKE);

        Body hangmanBody = new Body();
        Face hangmanFace = new Face();
        Rect rect = new Rect(hangmanBody.getLeft(), hangmanBody.getTop(),hangmanBody.getRight(),hangmanBody.getBottom());

        canvas.drawRect(rect ,rainColor);
        canvas.drawCircle(hangmanFace.getX(), hangmanFace.getY(),hangmanFace.getRadius(),hangmanFace.getFaceColor());


//        Rect rect2 = new Rect(10, 20, 30, 40);
//        canvas.drawRect(rect, rainColor);
//
//        RectF rectF = new RectF(40.5f, 20.5f, 60.5f, 40.5f);
//        canvas.drawRect(rectF, rainColor);

//
//        float rand = (float) Math.random() * canvas.getWidth();
//        tick++;
//
//        // add drop to the ArrayList
//        if (tick % 25 == 0) {
//            RainDrop rainDrop = new RainDrop(rand, 0, 10, rainColor);
//            drops.add(rainDrop);
//            System.out.println(drops.size());
//        }
//
//        // draw everything in the drops
//        for (RainDrop rainDrop : drops) {
//            rainDrop.setY(rainDrop.getY()+ 10);
//            canvas.drawCircle(rainDrop.getX(),rainDrop.getY(),rainDrop.getRadius(), rainDrop.getPaint());
//
    }
}
