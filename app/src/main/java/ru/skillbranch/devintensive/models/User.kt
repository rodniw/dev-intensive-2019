package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

class User(
    val id: String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
) {

    constructor(id: String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    init {
        println("i'am alive")
    }

    class Builder() {
        private var id: String? = null
        private var firstName: String? = null
        private var lastName: String? = null
        private var avatar: String? = null
        private var rating: Int = 0
        private var respect: Int = 0
        private var lastVisit: Date? = null
        private var isOnline: Boolean = false

        fun id(value: String) {
            id = value
        }

        fun firstName(value: String) {
            firstName = value
        }

        fun lastName(value: String) {
            lastName = value
        }

        fun avatar(value: String) {
            avatar = value
        }

        fun rating(value: Int) {
            rating = value
        }

        fun respect(value: Int) {
            respect = value
        }

        fun lastVisit(value: Date) {
            lastVisit = value
        }

        fun isOnline(value: Boolean) {
            isOnline = value
        }

        fun build() = User(
            id ?: (++lastId).toString(),
            firstName,
            lastName,
            avatar,
            rating,
            respect,
            lastVisit,
            isOnline
        )
    }

    companion object Factory{
        private var lastId: Int = -1
        fun makeUser(fullName: String?): User {
            lastId++

            val (firstName, lastName) = Utils.parseFullName(fullName)

            return User(
                "$lastId",
                firstName,
                lastName
            )
        }
    }
}