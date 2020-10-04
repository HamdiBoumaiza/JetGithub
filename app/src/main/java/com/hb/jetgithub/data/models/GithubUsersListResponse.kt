package com.hb.jetgithub.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class GithubUsersListResponse(
    @PrimaryKey @SerializedName("total_count") var totalCount: Long?,
    @SerializedName("incomplete_results") var incompleteResults: Boolean?,
    @SerializedName("items") var items: List<GithubUserResponse>?
)