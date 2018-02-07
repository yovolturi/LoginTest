package sdu.cs58.watanyu.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActiviry extends AppCompatActivity {

    //Explicit
    EditText  nameEditText,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activiry);

        //2.Initial view ผูกตัวเเฟร java ใฟ้รู้จักกับ element บน xml
        nameEditText = findViewById(R.id.txtName);
        usernameEditText = findViewById(R.id.txtUsername);
        passwordEditText = findViewById(R.id.txtPassword);
        loginButton = findViewById(R.id.btnLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameString =nameEditText.getText().toString().trim();
                Toast.makeText(getApplicationContext(), "hello "+nameString,Toast.LENGTH_SHORT) .show();

            }
        });


    }// end method onCreate
}//end class
