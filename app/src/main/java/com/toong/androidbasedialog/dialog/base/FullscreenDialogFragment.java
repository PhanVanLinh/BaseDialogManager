package com.toong.androidbasedialog.dialog.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager;
import com.toong.androidbasedialog.R;

public abstract class FullscreenDialogFragment extends BaseDialogFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE,
                R.style.FullScreenDialogTheme);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setLayout(getWith(), getHeight());
        }
    }

    protected int getWith() {
        return WindowManager.LayoutParams.MATCH_PARENT;
    }

    protected int getHeight() {
        return WindowManager.LayoutParams.MATCH_PARENT;
    }
}
