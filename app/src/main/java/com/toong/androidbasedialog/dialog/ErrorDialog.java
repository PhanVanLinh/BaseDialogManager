package com.toong.androidbasedialog.dialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.toong.androidbasedialog.R;
import com.toong.androidbasedialog.dialog.base.FullscreenDialogFragment;

public class ErrorDialog extends FullscreenDialogFragment {
    public static final String MESSAGE = "MESSAGE";

    public static ErrorDialog newInstance(String message) {
        Bundle args = new Bundle();
        args.putString(MESSAGE, message);
        ErrorDialog fragment = new ErrorDialog();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_error, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String message = getArguments().getString(MESSAGE, "");
        TextView tvMessage = view.findViewById(R.id.text_message);
        tvMessage.setText(message);
    }

    @Override
    protected int getHeight() {
        return WindowManager.LayoutParams.WRAP_CONTENT;
    }
}
