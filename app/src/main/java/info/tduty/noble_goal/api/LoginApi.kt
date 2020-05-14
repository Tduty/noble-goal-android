package info.tduty.noble_goal.api

import info.tduty.noble_goal.data.LoginResponse
import info.tduty.noble_goal.data.MockLoginRequest
import info.tduty.noble_goal.data.TelegramLoginRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


/**
 * Created by Evgeniy Mezentsev on 14.05.2020.
 */
interface LoginApi {

    @POST("telegram")
    fun getNewsList(@Body body: TelegramLoginRequest): Call<LoginResponse>

    @POST("mock")
    fun getNewsList(@Body body: MockLoginRequest): Call<LoginResponse>
}
