package info.tduty.noble_goal.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Evgeniy Mezentsev on 14.05.2020.
 */
data class MockLoginRequest(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("phone") val phone: String
)
