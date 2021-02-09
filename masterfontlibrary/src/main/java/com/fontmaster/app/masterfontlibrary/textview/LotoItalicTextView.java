package com.fontmaster.app.masterfontlibrary.textview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint({"AppCompatCustomView"})
public class LotoItalicTextView  extends TextView {
    public LotoItalicTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.init();
    }

    public LotoItalicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init();
    }

    public LotoItalicTextView(Context context) {
        super(context);
        this.init();
    }

    private void init() {
        Typeface dashboardtf = Typeface.createFromAsset(this.getContext().getAssets(), "fonts/lato_italic.ttf");
        this.setTypeface(dashboardtf);
    }
}
