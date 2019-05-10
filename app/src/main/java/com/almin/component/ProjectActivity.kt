package com.almin.component

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.almin.usermodule.UserActivity
import kotlinx.android.synthetic.main.activity_main.*

class ProjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tv_app.setOnClickListener {
            startActivity(Intent(this, UserActivity::class.java))
        }

    }
}
