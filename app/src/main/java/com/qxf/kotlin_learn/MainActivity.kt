package com.qxf.kotlin_learn

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a:Int = 3
        val b = 4
        System.out.println("$a 和 $b 的和是：${a+b}")
        tv.text = "$a 和 $b 的和是：${a+b}"
    }
}
