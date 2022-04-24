package jp.techacademy.Hide.Yui.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {

    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say() {
        Log.d("kotlin test", this.name + "(" + this.age + ")" + "「ワンワン」")
    }

    override fun move() {
        Log.d("kotlin test", this.name + "(" + this.age + ")" + "は全力で走った")
    }
}

fun formatMyTag(): String {
    return "[$MY_TAG]"
}

const val MY_TAG = "kotlin test"