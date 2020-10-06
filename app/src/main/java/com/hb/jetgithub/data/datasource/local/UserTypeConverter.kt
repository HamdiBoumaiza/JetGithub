package com.hb.jetgithub.data.datasource.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.hb.jetgithub.data.models.GithubUserResponse
import java.lang.reflect.Type
import javax.inject.Inject

class UserTypeConverter {

    @Inject
    lateinit var gson: Gson

    @TypeConverter
    fun storedStringToUser(data: String?): GithubUserResponse? {
        if (data == null) return null
        val listType: Type = object : TypeToken<List<GithubUserResponse?>?>() {}.getType()
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun userToStoredString(myObjects: GithubUserResponse?): String? {
        return gson.toJson(myObjects)
    }

    @TypeConverter
    fun storedStringToListUsers(data: String?): List<GithubUserResponse?>? {
        if (data == null) return emptyList()
        val listType: Type = object : TypeToken<List<GithubUserResponse?>?>() {}.getType()
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun listUsersToStoredString(myObjects: List<GithubUserResponse?>?): String? {
        return gson.toJson(myObjects)
    }
}