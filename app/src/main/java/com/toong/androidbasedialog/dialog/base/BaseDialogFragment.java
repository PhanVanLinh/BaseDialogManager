package com.toong.androidbasedialog.dialog.base;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.Window;

public class BaseDialogFragment extends DialogFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setWindowAnimations(android.R.style.Animation_Dialog);
        }
    }
}
