package com.hb.jetgithub.data.models

import com.google.gson.annotations.SerializedName

data class GithubUsersListResponse(
    @SerializedName("total_count") var totalCount: Long,
    @SerializedName("incomplete_results") var incompleteResults: Boolean,
    @SerializedName("items") var items: List<GithubUserResponse>
)