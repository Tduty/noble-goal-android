package info.tduty.noble_goal.login

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by Evgeniy Mezentsev on 14.05.2020.
 */
class LoginViewModelFactory(
    private val application: Application,
    private val token: String?
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return LoginViewModel() as T
    }
}