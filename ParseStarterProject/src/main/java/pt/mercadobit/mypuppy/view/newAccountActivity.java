package pt.mercadobit.mypuppy.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pt.mercadobit.mypuppy.R;

public class newAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
