package com.hb.jetgithub.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GithubRepositoryModel(
    var owner: GithubUserModel,
    var id: Int,
    var name: String,
    var description: String,
    var htmlUrl: String
) : Parcelable {
    constructor() : this(GithubUserModel(), 0, "", "", "")
}