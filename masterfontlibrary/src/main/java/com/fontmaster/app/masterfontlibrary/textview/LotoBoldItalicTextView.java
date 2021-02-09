package com.fontmaster.app.masterfontlibrary.textview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint({"AppCompatCustomView"})
public class LotoBoldItalicTextView extends TextView {
    public LotoBoldItalicTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.init();
    }

    public LotoBoldItalicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init();
    }

    public LotoBoldItalicTextView(Context context) {
        super(context);
        this.init();
    }

    private void init() {
        Typeface dashboardtf = Typeface.createFromAsset(this.getContext().getAssets(), "fonts/lato_bold_ltalic.ttf");
        this.setTypeface(dashboardtf);
    }
}
