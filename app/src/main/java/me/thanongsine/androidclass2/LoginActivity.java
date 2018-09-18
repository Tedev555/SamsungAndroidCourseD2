package me.thanongsine.androidclass2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText usernameEdt = findViewById(R.id.username_edit_text);
        final EditText passwordEdt = findViewById(R.id.password_edit_text);
        Button btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (usernameEdt.getText().toString().isEmpty()
                        || passwordEdt.getText().toString().isEmpty()) {

                    Toast.makeText(getApplicationContext(),
                            "Please enter User or Password",
                            Toast.LENGTH_SHORT)
                            .show();
                } else {
                    String myUser = "Ted555";
                    String myPass = "12345";

                    if (usernameEdt.getText().toString().equals(myUser)
                            && passwordEdt.getText().toString().equals(myPass)) {

                        Toast.makeText(getApplicationContext(),
                                "You have login now!",
                                Toast.LENGTH_SHORT)
                                .show();
                    } else {
                        Toast.makeText(getApplicationContext(),
                                "Your username or password is incorrect",
                                Toast.LENGTH_SHORT)
                                .show();
                    }
                }
            }
        });

    }
}
