package sk.styk.martin.apkanalyzer.model.permissions

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
data class PermissionStatus(
    val packageName: String,
    val isGranted: Boolean = false,
) : Parcelable
