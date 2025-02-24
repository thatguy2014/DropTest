package com.zybooks.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /* BASELINE CODE FOR PHYSICS:
            private var height; // This will either be predefined or inputted by user (User input isn't hard)
            private var mass; // This comes from selected phone (DATABASE)
            private var dimensions[]; // 2 options: Either area variables, or dimensions (dimensions is easier)
            private var vel; // Velocity: v = sqrt(19.6*h)
            private var time; // This is for momentum stuff ; Time: t = sqrt(19.6*h)/deceleration
            private var decel; // This is either just defined constant (607) OR it's a database (if we can find)
            private var Force; // Force (technically pressure): mass * vel / (time * Area)
            // MAX PRESSURE: 356 Newtons of Pressure
            // If we have multiple areas (on face, corner, side) we can give more resolution
            // And the math is basically the same for all areas


         */
    }
}