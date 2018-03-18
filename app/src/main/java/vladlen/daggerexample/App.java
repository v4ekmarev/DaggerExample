package vladlen.daggerexample;

import android.app.Application;

import vladlen.daggerexample.app_component.AppComponent;
import vladlen.daggerexample.app_component.DaggerAppComponent;

/**
 * Created by vladlen on 18.03.18.
 */

public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }
}
