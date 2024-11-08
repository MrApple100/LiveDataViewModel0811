package ru.mrapple100.livedataviewmodel0811

class Game(
    val name:String,
    val price: Int,
    val company:String
) {
    override fun toString(): String {
        return "Game(name='$name', price=$price, company='$company')"
    }
}