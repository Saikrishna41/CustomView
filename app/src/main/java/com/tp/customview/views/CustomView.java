package com.tp.customview.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class CustomView extends View {
    private int SQUARE_SIZZE = 500;
    private Rect rectSquare;
    private Paint paintSquare;

    public CustomView(Context context) {
        super(context);
        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet set) {

        rectSquare = new Rect();
        paintSquare = new Paint(Paint.ANTI_ALIAS_FLAG);

        //pos or size of square can be changed using RECTF
        //AntiAlias - user friendly and less pixalated

    }

    @Override
    protected void onDraw(Canvas canvas) {

        //rect object is used to set position and sizze for our square
        //paint object is used to define color and styling for the rect object
        rectSquare.left = 10;
        rectSquare.top = 10;
        rectSquare.right = rectSquare.left + SQUARE_SIZZE;
        rectSquare.bottom = rectSquare.top + SQUARE_SIZZE;
        paintSquare.setColor(Color.GREEN);
        canvas.drawRect(rectSquare, paintSquare);
    }
}
