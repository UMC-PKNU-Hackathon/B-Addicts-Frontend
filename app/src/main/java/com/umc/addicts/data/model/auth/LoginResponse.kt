package com.umc.addicts.data.model.auth

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse (
    val address: String
)