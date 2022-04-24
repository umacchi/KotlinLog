package jp.techacademy.Hide.Yui.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // レイアウトを設定する
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)

        dog.move()

        val tanaka = Human("田中", 24, "野球")

        tanaka.say()
        tanaka.think()

        val yamada = Human("山田", 28, "サッカー")

        yamada.say()
        yamada.think()

        var str: String? = "kotlin"

        if (str?.length == null) {
            Log.d("kotlintest", "結果はnull")
        } else {
            Log.d("kotlintest", "lengthの結果は${str.length}")
        }


    }
}