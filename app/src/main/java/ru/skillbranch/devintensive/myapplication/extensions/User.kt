package ru.skillbranch.devintensive.myapplication.extensions

import ru.skillbranch.devintensive.myapplication.models.User
import ru.skillbranch.devintensive.myapplication.models.UserView
import ru.skillbranch.devintensive.myapplication.utils.Utils

fun User.toUserView(): UserView {
    val fullName = "$firstName $lastName"
    val nickname = Utils.transliteration(fullName, "_")
    val initials = Utils.toInitials(firstName, lastName)
    val status = when {
        lastVisit == null -> "Еще ни разу не был"
        isOnline -> "online"
        else -> "Последний раз был ${lastVisit!!.humanizeDiff()}"
    }

    return UserView(
        id = id,
        fullName = fullName,
        nickName = nickname,
        initials = initials,
        avatar = avatar,
        status = status
    )
}