package info.tduty.noble_goal.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Evgeniy Mezentsev on 14.05.2020.
 */
data class TelegramLoginRequest(
    @SerializedName("token") val token: String
)
