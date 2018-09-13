package pt.mercadobit.mypuppy.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import pt.mercadobit.mypuppy.R;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void openNewAccount(View view) {
        startActivity(new Intent(this,newAccountActivity.class));
    }

    public void makeLogin(View view) {

    }
}
