package info.tduty.noble_goal.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by Evgeniy Mezentsev on 14.05.2020.
 */
object RetrofitService {

    private const val HOST = "https://localhost:8080/"
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())

    fun loginApi(): LoginApi {
        return retrofit
            .baseUrl(HOST + "v1/register/")
            .build()
            .create(LoginApi::class.java)
    }
}