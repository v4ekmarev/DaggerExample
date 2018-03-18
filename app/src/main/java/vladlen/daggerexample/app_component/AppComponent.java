package vladlen.daggerexample.app_component;

import dagger.Component;
import vladlen.daggerexample.MainActivity;
import vladlen.daggerexample.modules.DatabaseModule;
import vladlen.daggerexample.modules.NetworkModule;

/**
 * Created by vladlen on 18.03.18.
 */
@Component(modules = {DatabaseModule.class, NetworkModule.class})
public interface AppComponent {
    void injectMainActivity(MainActivity mainActivity);
}
