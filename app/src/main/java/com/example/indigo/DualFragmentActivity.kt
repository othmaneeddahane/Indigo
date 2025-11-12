package com.example.indigo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DualFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dual_fragment)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.leftFragmentContainer, MainFragment())
                .replace(R.id.rightFragmentContainer, TicketFragment())
                .commit()
        }
    }
}
