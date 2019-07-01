package ru.skillbranch.devintensive.myapplication.models

import java.util.*

class UserView(val id : String,
               var firstName : String?,
               var lastName : String?,
               var avatar : String?,
               var rating : Int = 0,
               var respect : Int = 0,
               var lastVisit : Date? = Date(),
               var isOnline : Boolean = false) {

    companion object Factory {

    }
}