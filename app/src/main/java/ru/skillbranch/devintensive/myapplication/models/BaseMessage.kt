package ru.skillbranch.devintensive.myapplication.models

import java.util.*

class BaseMessage(val id: String,
                  val from: User?,
                  val chat: Chat,
                  val isIncoming: Boolean = false,
                  val date: Date = Date()
) {
}