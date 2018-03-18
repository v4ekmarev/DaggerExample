package vladlen.daggerexample.modules;

import dagger.Module;
import dagger.Provides;
import vladlen.daggerexample.DatabaseHelper;

/**
 * Created by vladlen on 09.03.18.
 */
@Module
public class DatabaseModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }
}
