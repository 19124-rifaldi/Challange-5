package com.binar.challange5.room

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class UserModel(
    @PrimaryKey(autoGenerate = true) var id:Int?,
    @ColumnInfo(name = "email") var email : String?,
    @ColumnInfo(name = "username") var username : String?,
    @ColumnInfo(name = "password") var password : String?
):Parcelable
