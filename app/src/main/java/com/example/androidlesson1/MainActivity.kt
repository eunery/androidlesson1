package com.example.androidlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.textView)
        view.text = "Biba"

        val student = Student("Alesha", 2)
        print(student.name)
        print(student.toString())
    }
}

data class Student(val name: String, val course: Int){
    override fun toString(): String {
        return "${name + course}"
    }
}