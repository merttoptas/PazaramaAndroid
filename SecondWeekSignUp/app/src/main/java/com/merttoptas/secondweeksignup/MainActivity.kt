package com.merttoptas.secondweeksignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var ivChangePasswordVisibility: ImageView
    private var isVisibilityOn = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        ivChangePasswordVisibility  = findViewById(R.id.ivShowPassword)

        ivChangePasswordVisibility.setOnClickListener {
            if (isVisibilityOn) {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                isVisibilityOn = false
            } else {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                isVisibilityOn = true
            }
        }
    }
}