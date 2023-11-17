package com.example.gweiland_task.webservices;

import androidx.annotation.NonNull;

import com.bumptech.glide.manager.RequestTracker;
import com.example.gweiland_task.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

//    retrofit object
    private static Retrofit retrofit  = null;
//    gson builder
    private static Gson gson = new GsonBuilder().create();
//    logging interceptor
    private static HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY);

//    client builder
    private static OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)
        .addInterceptor(new Interceptor() {
            @NonNull
            @Override
            public Response intercept(@NonNull Chain chain) throws IOException {
//                Request chaining
                Request request = chain.request().newBuilder()
                        .addHeader("X-CMC_PRO_API_KEY", Constants.API_KEY)
                        .build();
                return chain.proceed(request);
            }
        });

    public static OkHttpClient okHttpClient = okHttpClientBuilder.build();

    public static <T> T createService(Class<T> serviceClass) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(Constants.BASE_API_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return retrofit.create(serviceClass);
    }

}
