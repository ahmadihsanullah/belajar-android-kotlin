package belajar.android.dasar.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import belajar.android.dasar.R

class fragmentActivity : AppCompatActivity() {
    private lateinit var btnFirstFragment: Button
    private lateinit var btnSecondFragment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, firstFragment)
            commit()
        }

        btnFirstFragment = findViewById(R.id.btnFirstFragment)
        btnSecondFragment = findViewById(R.id.btnSecondFragment)

        btnFirstFragment.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, firstFragment)
                addToBackStack(null)
                commit()
            }
        }

        btnSecondFragment.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}