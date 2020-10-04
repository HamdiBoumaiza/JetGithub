package com.hb.jetgithub.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GithubUsersListModel(
     var totalCount: Long,
     var incompleteResults: Boolean,
     var items: List<GithubUserModel>
) : Parcelable{
     constructor():this(0L,false, emptyList())
}