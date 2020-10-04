package com.hb.jetgithub.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class GithubRepositoryResponse(
    @SerializedName("owner") var owner: GithubUserResponse?,
    @PrimaryKey  @SerializedName("id") var id: Int?,
    @SerializedName("name") var name: String?,
    @SerializedName("description") var description: String?,
    @SerializedName("html_url") var htmlUrl: String?
)