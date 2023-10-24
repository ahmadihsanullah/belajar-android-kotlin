package belajar.android.dasar

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cars(
     val name:String?,
     val tahun:String?,
):Parcelable