package info.tduty.noble_goal.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Evgeniy Mezentsev on 14.05.2020.
 */
data class LoginResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("string") val string: String,
    @SerializedName("userID") val userID: Int,
    @SerializedName("expiresAt") val expiresAt: String

)
