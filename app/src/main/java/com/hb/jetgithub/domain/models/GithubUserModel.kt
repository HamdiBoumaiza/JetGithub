package com.hb.jetgithub.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GithubUserModel(
    var id: Long,
    var login: String?,
    var avatarUrl: String?,
    var htmlUrl: String,
    var followersUrl: String,
    var reposUrl: String,
    var name: String,
    var company: String,
    var blog: String,
    var location: String,
    var email: String,
    var bio: String,
    var publicRepos: Int,
    var publicGists: Int,
    var followers: Int,
    var following: Int,
) : Parcelable {

    constructor() : this(
        0L, "", "", "", "", "",
        "", "", "", "", "",
        "", 0, 0, 0, 0
    )

}