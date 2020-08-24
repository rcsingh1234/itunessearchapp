package com.search.itunes.utilities

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

class Utility {

    companion object {
        @SuppressLint("SimpleDateFormat")
        fun convertDate(text: String, originalFormat: String, targetFormat: String): String {
            try {
                val original = SimpleDateFormat(originalFormat, Locale.US)
                val target = SimpleDateFormat(targetFormat)
                val date = original.parse(text)!!
                return target.format(date)

            } catch (e: Exception) {
                e.printStackTrace()
            }
            return ""
        }


    }
}