package com.datnth63133206.testlogin.ui.login;

import android.widget.Toast;

import androidx.annotation.Nullable;

import com.datnth63133206.testlogin.MainActivity;

/**
 * Authentication result : success (user details) or error message.
 */
class LoginResult {
    @Nullable
    private LoggedInUserView success;
    @Nullable
    private Integer error;

    LoginResult(@Nullable Integer error) {
        this.error = error;
    }

    LoginResult(@Nullable LoggedInUserView success) {
        this.success = success;
    }

    @Nullable
    LoggedInUserView getSuccess() {
        Toast.makeText(this, "Login success!", Toast.LENGTH_SHORT).show();
        return success;
    }

    @Nullable
    Integer getError() {
        return error;
    }
}