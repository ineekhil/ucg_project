package com.axiii.ugcproject
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.axiii.ugcproject.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Find the view after setContentView
        val myView = findViewById<View>(R.id.profile_picture)

        // Now you can safely call setOnApplyWindowInsetsListener
        myView?.setOnApplyWindowInsetsListener { view, insets ->
            // Handle window insets here
            insets
        }
    }
}