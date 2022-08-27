package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
// File for user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


// Display customized to show "Hello from (name)
        // Allow user to change label color with a tap using a button
        // 1. Add button for color change
        // Reference the button
        // 2. Set up Logic for when user clicks button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handles Button tap
            //Change text color
            Log.i("Joel", "Tapped on button")
            // Get a reference to the text view
            // Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
        }}}
// User can tap a button and change color of background
// 1. Add button for background
// 2. Set up logic for button
// 3. Change color of background when button is clicked
