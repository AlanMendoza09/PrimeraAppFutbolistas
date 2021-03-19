package com.example.futbol

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Futbolistas(val picture:Int, val name:String, val description:String, val fraseFutbolista:String): Parcelable
