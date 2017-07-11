package com.toong.androidbasedialog.dialog;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;

public class DialogManager {

    public void showSuccessDialog(FragmentManager fm, String message) {
        SuccessDialog successDialog = SuccessDialog.newInstance(message);
        successDialog.show(fm, null);
    }

    public void showErrorDialog(FragmentManager fm, String message) {
        ErrorDialog errorDialog = ErrorDialog.newInstance(message);
        errorDialog.show(fm, null);
    }

    public void dismiss(FragmentManager fm, String tag) {
        ((DialogFragment) fm.findFragmentByTag(tag)).dismiss();
    }
}
