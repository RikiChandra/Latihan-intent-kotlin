package com.example.myintentapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObjectActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvObjectReceived: TextView = findViewById(R.id.tv_object_received)

        val person = if(Build.VERSION.SDK_INT >= 33 ) {
            intent.getParcelableExtra(EXTRA_PERSON, Person::class.java)

        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_PERSON)
        }

        if (person != null) {
            val text = "Name: ${person.name.toString()}, Your Age: ${person.age}, Email: ${person.email}, City: ${person.city}"
            tvObjectReceived.text = text
        }


    }
}