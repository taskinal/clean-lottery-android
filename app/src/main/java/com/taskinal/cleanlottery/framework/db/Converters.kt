package com.taskinal.cleanlottery.framework.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * @project CleanLottery
 * @author alitaskin on 14.08.2021
 */
class Converters {

    @TypeConverter
    fun fromString(value: String) : ArrayList<String>{
        val listType = object : TypeToken<ArrayList<String>>() {}.type
        return Gson().fromJson(value, listType);
    }

    @TypeConverter
    fun fromArrayList(list: ArrayList<String>): String{
        val gson = Gson()
        return gson.toJson(list)
    }

}