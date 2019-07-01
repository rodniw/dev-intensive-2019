package ru.skillbranch.devintensive.myapplication

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.myapplication.models.User

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    
    @Test
    fun test_factory() {
        var user = User.makeUser("Gena Bukin")
        var user2 = User.makeUser("Lena Poleno")
        var user3 = User.makeUser("Tolik Poleno")
    }
}
