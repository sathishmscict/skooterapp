package com.skooterapp.layouts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class AEditText extends EditText {
    public AEditText(Context context) {
        super(context);
        init();
    }

    public AEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    protected void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "font/Ubuntu-Regular.ttf");
        setTypeface(tf);
    }

    @Override
    public boolean isInEditMode() {
        return true;
    }
}
