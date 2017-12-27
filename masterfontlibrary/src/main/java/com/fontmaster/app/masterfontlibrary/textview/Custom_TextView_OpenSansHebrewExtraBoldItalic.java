package com.fontmaster.app.masterfontlibrary.textview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created on 3/1/17.
 * @author Debdeep
 */
@SuppressLint("AppCompatCustomView")
public class Custom_TextView_OpenSansHebrewExtraBoldItalic extends TextView {

    public Custom_TextView_OpenSansHebrewExtraBoldItalic(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Custom_TextView_OpenSansHebrewExtraBoldItalic(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Custom_TextView_OpenSansHebrewExtraBoldItalic(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface dashboardtf = Typeface.createFromAsset(getContext().getAssets(),
                "fonts/OpenSansHebrewExtraBoldItalic.ttf");
        setTypeface(dashboardtf);
    }
}
