package info.tduty.noble_goal.login

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by Evgeniy Mezentsev on 13.05.2020.
 */
class LoginViewModel(
    private val application: Application,
    private val token: String?
) : ViewModel() {

    val isProcessLogin = !token.isNullOrBlank()
    val actionSignWithTelegram = MutableLiveData<Boolean>()

    fun openTelegram() {
        actionSignWithTelegram.value = true
    }

    fun login() {
        val t = token
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
