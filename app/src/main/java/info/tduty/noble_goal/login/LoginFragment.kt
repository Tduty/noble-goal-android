package info.tduty.noble_goal.login

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import info.tduty.noble_goal.R

/**
 * Created by Evgeniy Mezentsev on 13.05.2020.
 */
class LoginFragment : Fragment(R.layout.fragment_login) {

    companion object {
        private const val TELEGRAM_PAGE_ID = "noble_goal_bot"
        const val TELEGRAM_APP_NAME = "org.telegram.messenger"
        const val TELEGRAM_URI = "tg://resolve?domain=$TELEGRAM_PAGE_ID"
    }

    val viewModel by viewModels<LoginViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListeners()
        setupObservers()
    }

    private fun setupListeners() {

    }

    private fun setupObservers() {

    }

    private fun openTelegram() {
        if (isAppAvailable(requireActivity().applicationContext)) {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(TELEGRAM_URI))
            requireActivity().startActivity(Intent.createChooser(intent, "Share with"))
        } else {
            Toast.makeText(requireActivity(), "Telegram not Installed", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isAppAvailable(context: Context): Boolean {
        return try {
            context.packageManager.getPackageInfo(TELEGRAM_APP_NAME, PackageManager.GET_ACTIVITIES)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }
}