package com.herewellstay.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.fragment.app.DialogFragment;

public class CustomDialog extends DialogFragment {
    private static final String TAG = CustomDialog.class.getSimpleName();

    android.app.Dialog dialog;
    private View view;
    private Context context;

    public CustomDialog() {

    }


    public void show() {
        dialog = new Dialog(context);
        dialog.setContentView(view);
        dialog.setCanceledOnTouchOutside(true);

        dialog.show();
    }

    public void dismiss() {
        if (dialog != null)
            dialog.dismiss();
        else
            Log.i(TAG, "dialog is null...");
    }

    public boolean isDismissed() {
        return dialog != null && !dialog.isShowing();
    }

    public void setContext(Context context) {
        this.context = context;
    }


    public void setCustomView(View view) {

        this.view = view;
    }
}
