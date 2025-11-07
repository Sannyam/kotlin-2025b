package com.appweek09.data

import java.util.UUID
import java.util.Date

data class Student (
    val name:String,
    val id : String = UUID.randomUUID().toString(),
    val department : String = "Computer Science",
    val grade: String = "2nd Year",
    val email: String = "",
    val addedDate: Date = Date()
    ) {
    override fun toString(): String = name

//    override fun toString(): String{
//        return name
//    }
}