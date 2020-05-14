package info.tduty.noble_goal

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import info.tduty.noble_goal.utils.getToken

/**
 * Created by Evgeniy Mezentsev on 12.05.2020.
 */
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        handleAppLink(intent?.data)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        handleAppLink(intent?.data)
    }

    private fun handleAppLink(data: Uri?) {
        if (data != null && data.isHierarchical) {
            val bundle = Bundle().apply { putString("token", data.toString().getToken()) }
            Navigation.findNavController(this, R.id.main_nav_fragment)
                .navigate(R.id.loginFragment, bundle)
        }
    }
}
