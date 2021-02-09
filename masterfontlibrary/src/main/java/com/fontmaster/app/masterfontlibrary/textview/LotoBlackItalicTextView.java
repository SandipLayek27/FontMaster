package com.fontmaster.app.masterfontlibrary.textview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint({"AppCompatCustomView"})
public class LotoBlackItalicTextView  extends TextView {
    public LotoBlackItalicTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.init();
    }

    public LotoBlackItalicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init();
    }

    public LotoBlackItalicTextView(Context context) {
        super(context);
        this.init();
    }

    private void init() {
        Typeface dashboardtf = Typeface.createFromAsset(this.getContext().getAssets(), "fonts/lato_black_italic.ttf");
        this.setTypeface(dashboardtf);
    }
}
