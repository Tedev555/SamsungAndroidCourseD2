package me.thanongsine.androidclass2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SampleViewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_views);

        final EditText fullNameEdt = findViewById(R.id.full_name_edt);
        final EditText ageEdt = findViewById(R.id.age_edt);
        final EditText phoneEdt = findViewById(R.id.phone_edt);
        final EditText passwordEdt = findViewById(R.id.password_edt);
        Button btnShowInfo = findViewById(R.id.btn_show_info);

        final TextView fullNameTV = findViewById(R.id.full_name_tv);
        final TextView ageTV = findViewById(R.id.age_tv);
        final TextView phoneTV = findViewById(R.id.phone_tv);
        final TextView passwordTV = findViewById(R.id.password_tv);

        btnShowInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (fullNameEdt.getText().toString().isEmpty()
                        || ageEdt.getText().toString() .isEmpty()
                        || phoneEdt.getText().toString().isEmpty()
                        || passwordEdt.getText().toString().isEmpty()) {

                    Toast.makeText(getApplicationContext(),
                            "Please enter form",
                            Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Log.e("SampleViewsLog",
                            "FullName: " +fullNameEdt.getText().toString());

                    fullNameTV.setText("FullName: " + fullNameEdt.getText().toString());
                    ageTV.setText("Age: " + ageEdt.getText().toString());
                    phoneTV.setText("Phone: " + phoneEdt.getText().toString());
                    passwordTV.setText("Password: " + passwordEdt.getText().toString());
                }

            }
        });



    }
}
