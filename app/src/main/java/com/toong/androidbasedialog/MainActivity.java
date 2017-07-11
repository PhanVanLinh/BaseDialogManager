package com.toong.androidbasedialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.toong.androidbasedialog.dialog.DialogManager;

public class MainActivity extends AppCompatActivity {
    DialogManager dialogManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialogManager = new DialogManager();

        findViewById(R.id.button_error).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogManager.showErrorDialog(getSupportFragmentManager(),
                        "Update data successfully. dajskldjal ajdlsajdl adjalsdj adjalsdj");
            }
        });

        findViewById(R.id.button_success).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogManager.showSuccessDialog(getSupportFragmentManager(),
                        "Update data successfully. dajskldjal ajdlsajdl adjalsdj adjalsdj");
            }
        });
    }
}
