package info.tduty.noble_goal.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import info.tduty.noble_goal.api.RetrofitService
import info.tduty.noble_goal.data.LoginResponse
import info.tduty.noble_goal.data.TelegramLoginRequest
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Evgeniy Mezentsev on 14.05.2020.
 */
object LoginRepository {

    private val loginApi = RetrofitService.loginApi()

    fun loginWithTelegram(liveData: MutableLiveData<LoginResponse>, token: String) {
        loginApi.getNewsList(TelegramLoginRequest(token)).enqueue(object : Callback<LoginResponse> {
            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                liveData.value = null
            }

            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                liveData.value = response.body()
            }
        })
    }
}
