package edu.temple.signupform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import static edu.temple.signupform.R.id.save;

public class FormActivity extends Activity {
    EditText name;
    EditText email;
    EditText password;
    EditText password2;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        password2 = findViewById(R.id.password2);
        save = findViewById(R.id.save);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(FormActivity.this, WelcomeActivity.class);
                startActivityIntent.putExtra(WelcomeActivity.Name, "username");
                if (TextUtils.isEmpty(name.getText()) || TextUtils.isEmpty(email.getText()) || TextUtils.isEmpty(password.getText()) || TextUtils.isEmpty(password2.getText())){
                    Toast.makeText(getApplication(), "Please enter all information", Toast.LENGTH_SHORT).show();
                }
                else if(!TextUtils.equals(password.getText(), password2.getText())){
                    Toast.makeText(getApplication(), "Password not match", Toast.LENGTH_SHORT).show();
                }
                else{
                startActivity(startActivityIntent);
                }
            }
        });




    }
}
