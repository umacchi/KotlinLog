package jp.techacademy.Hide.Yui.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {

    private lateinit var hobby: String

     constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は${name}です。 年は${age}歳です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は${hobby}について考える。")
    }
}