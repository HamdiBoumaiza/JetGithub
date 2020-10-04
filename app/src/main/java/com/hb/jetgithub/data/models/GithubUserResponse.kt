package com.hb.jetgithub.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class GithubUserResponse(
    @PrimaryKey @SerializedName("id") var id: Long?,
    @SerializedName("login") var login: String?,
    @SerializedName("avatar_url") var avatarUrl: String?,
    @SerializedName("html_url") var htmlUrl: String?,
    @SerializedName("followers_url") var followersUrl: String?,
    @SerializedName("repos_url") var reposUrl: String?,
    @SerializedName("name") var name: String?,
    @SerializedName("company") var company: String?,
    @SerializedName("blog") var blog: String?,
    @SerializedName("location") var location: String?,
    @SerializedName("email") var email: String?,
    @SerializedName("bio") var bio: String?,
    @SerializedName("public_repos") var publicRepos: Int?,
    @SerializedName("public_gists") var publicGists: Int?,
    @SerializedName("followers") var followers: Int?,
    @SerializedName("following") var following: Int?,
)