package info.tduty.noble_goal.utils

import android.view.View
import androidx.databinding.BindingAdapter

/**
 * Created by Evgeniy Mezentsev on 14.05.2020.
 */

@BindingAdapter("isGone")
fun bindIsGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) View.GONE else View.VISIBLE
}
