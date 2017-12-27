package com.fontmaster.app.masterfontlibrary.edittext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created on 3/1/17.
 * @author Debdeep
 */
@SuppressLint("AppCompatCustomView")
public class Custom_EditText_RobotoLightItalic extends EditText {

    public Custom_EditText_RobotoLightItalic(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Custom_EditText_RobotoLightItalic(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Custom_EditText_RobotoLightItalic(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface dashboardtf = Typeface.createFromAsset(getContext().getAssets(),
                "fonts/RobotoLightItalic.ttf");
        setTypeface(dashboardtf);
    }
}
