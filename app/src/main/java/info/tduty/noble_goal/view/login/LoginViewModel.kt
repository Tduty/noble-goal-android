package info.tduty.noble_goal.view.login

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import info.tduty.noble_goal.data.LoginResponse
import info.tduty.noble_goal.repository.LoginRepository

/**
 * Created by Evgeniy Mezentsev on 13.05.2020.
 */
class LoginViewModel(
    private val application: Application,
    private val token: String?
) : ViewModel() {

    val isProcessLogin = !token.isNullOrBlank()
    val actionSignWithTelegram = MutableLiveData<Boolean>()
    val loginWithTelegram = MutableLiveData<LoginResponse>()

    init {
        login()
    }

    fun openTelegram() {
        actionSignWithTelegram.value = true
    }

    fun login() {
        if (!token.isNullOrBlank()) {
            LoginRepository.loginWithTelegram(loginWithTelegram, token)
        }
    }
}

class LoginViewModelFactory(
    private val application: Application,
    private val token: String?
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(application, token) as T
    }
}
