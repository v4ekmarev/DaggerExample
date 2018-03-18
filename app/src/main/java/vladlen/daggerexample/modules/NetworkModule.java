package vladlen.daggerexample.modules;

import dagger.Module;
import dagger.Provides;
import vladlen.daggerexample.NetworkUtils;

/**
 * Created by vladlen on 09.03.18.
 */
@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }


}
