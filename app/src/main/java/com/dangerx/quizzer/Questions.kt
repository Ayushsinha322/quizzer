package com.dangerx.quizzer

import android.media.Image

data class Questions(
    val id : Int,
    val questions: String,
    val image: Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    val correctAnswer: Int

)
