package com.mela.melapasang

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {pasangFoto()}
    }

    fun pasangFoto() {
        val randomPr = java.util.Random().nextInt(5) + 1
        val randomLk = java.util.Random().nextInt(5) + 1
        val drawableResourcePr = when (randomPr) {
            1 -> R.drawable.pr1
            2 -> R.drawable.pr2
            3 -> R.drawable.pr3
            else -> R.drawable.pr4
        }
        val drawableResourceLk = when (randomLk) {
            1 -> R.drawable.lk1
            2 -> R.drawable.lk2
            3 -> R.drawable.lk3
            else -> R.drawable.lk4
        }
        image2.setImageResource(drawableResourcePr)
        image1.setImageResource(drawableResourceLk)
    }
}

