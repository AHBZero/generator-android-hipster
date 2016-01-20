package <%= appPackage %>.environment;

import <%= appPackage %>.application.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

@Module
public class EnvironmentModule {

    private final App app;

    public EnvironmentModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Retrofit provideRestAdapter() {
        Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return restAdapter;
    }

}
