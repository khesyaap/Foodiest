package com.khesya.idn.foodiest.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Recipes(
    var name : String?,
    var category : String?,
    var description : String?,
    var ingredients : String?,
    var instruction : String?,
    var pictures : String?,
    var number : String?,
    var calories : String?,
    var carbo : String?,
    var protein : String?,
): Parcelable
