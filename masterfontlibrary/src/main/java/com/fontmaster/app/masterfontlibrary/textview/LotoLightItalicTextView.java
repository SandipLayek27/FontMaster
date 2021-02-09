package com.fontmaster.app.masterfontlibrary.textview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint({"AppCompatCustomView"})
public class LotoLightItalicTextView  extends TextView {
    public LotoLightItalicTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.init();
    }

    public LotoLightItalicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init();
    }

    public LotoLightItalicTextView(Context context) {
        super(context);
        this.init();
    }

    private void init() {
        Typeface dashboardtf = Typeface.createFromAsset(this.getContext().getAssets(), "fonts/lato_light_italic.ttf");
        this.setTypeface(dashboardtf);
    }
}
