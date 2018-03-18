package vladlen.daggerexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by vladlen on 09.03.18.
 */

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkUtils networkUtils;
    @Inject
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getComponent().injectMainActivity(this);
    }
}
