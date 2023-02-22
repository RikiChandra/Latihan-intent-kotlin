package com.example.myintentapp

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    var name: String? = "",
    var age: Int = 0,
    var email: String? = "",
    var city: String? = ""
) : Parcelable
