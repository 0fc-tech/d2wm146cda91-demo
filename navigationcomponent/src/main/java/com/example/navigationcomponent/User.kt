package com.example.navigationcomponent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*
@Parcelize
data class User(
    val nom:String,
    val prenom:String,
    val dateNaissance : Date,
    val email:String
) : Parcelable
