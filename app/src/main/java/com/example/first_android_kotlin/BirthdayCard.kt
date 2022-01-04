package com.example.first_android_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BirthdayCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)
        title = "Birthday Card"
    }
}