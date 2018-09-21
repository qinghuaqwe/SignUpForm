package edu.temple.signupform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends Activity {
    public static String Name;
    TextView WelcomeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //WelcomeName = findViewById(R.id.WelcomeName);

        Intent intent = getIntent();
        //intent.getStringExtra("username");
        String username = intent.getStringExtra("username");
        WelcomeName.setText("Welcome," + username + ", to the SignUpForm App");






    }
}
