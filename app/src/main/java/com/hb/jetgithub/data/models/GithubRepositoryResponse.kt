package com.hb.jetgithub.data.models

import com.google.gson.annotations.SerializedName

data class GithubRepositoryResponse(
    @SerializedName("owner") var owner: GithubUserResponse,
    @SerializedName("id") var id: Int,
    @SerializedName("name") var name: String,
    @SerializedName("description") var description: String,
    @SerializedName("html_url") var htmlUrl: String
)