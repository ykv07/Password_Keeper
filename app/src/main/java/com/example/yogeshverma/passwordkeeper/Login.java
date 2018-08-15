package com.example.yogeshverma.passwordkeeper;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

public class Login extends AppCompatActivity {

    private TextInputLayout tiletUsername, tiletPassowrd;

    private TextInputEditText etUserName, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserName = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        etUserName.addTextChangedListener(new GenericTextWatcher(etUserName));
        etPassword.addTextChangedListener(new GenericTextWatcher(etPassword));
    }

    private class GenericTextWatcher implements TextWatcher{

        private View view;

        public GenericTextWatcher(View view) {
            this.view = view;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            System.out.println("beforeTextChanged");
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            System.out.println("onTextChanged");
        }

        @Override
        public void afterTextChanged(Editable editable) {
            System.out.println("afterTextChanged");
        }
    }
}
