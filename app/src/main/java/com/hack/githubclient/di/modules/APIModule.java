package com.hack.githubclient.di.modules;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hack.githubclient.api.APIOAuth;
import com.hack.githubclient.api.Protocol;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class APIModule {

    @Provides
    @Singleton
    public HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(HttpLoggingInterceptor interceptor) {
        return new OkHttpClient.Builder()
                .addInterceptor(interceptor)
//                .connectTimeout(60 * 1000, TimeUnit.MILLISECONDS)
//                .readTimeout(60 * 1000, TimeUnit.MILLISECONDS)
                .build();
    }

    @Provides
    @Singleton
    public Gson provideGson() {
        return new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient okHttpClient, Gson gson) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Protocol.BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();
        return retrofit;
    }

    @Provides
    @Singleton
    protected APIOAuth provideAPIOAuth(Retrofit retrofit) {
        return retrofit.create(APIOAuth.class);
    }
}
