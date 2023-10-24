package belajar.android.dasar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnPindahActivity: Button
    private lateinit var btnPindahDataActivit: Button
    private lateinit var btnPindahActivityParcelable: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindahActivity = findViewById(R.id.pindahActivity)
        btnPindahDataActivit = findViewById(R.id.pindahActivityData)
        btnPindahActivityParcelable = findViewById(R.id.pindahActivityParcelable)

        btnPindahActivity.setOnClickListener(this)
        btnPindahDataActivit.setOnClickListener(this)
        btnPindahActivityParcelable.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.pindahActivity -> run {
                val intentBiasa = Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(intentBiasa)
            }
            R.id.pindahActivityData -> run {
                val intent = Intent(this@MainActivity, PindahDataActivity::class.java)
                intent.putExtra(PindahDataActivity.EXTRA_TEXT, "halo, ayo belajar kotlin")
                startActivity(intent)
            }
            R.id.pindahActivityParcelable->{
                val cars = Cars(
                    "Avanza",
                    "2018"
                )

                val intent = Intent(this@MainActivity, PindahActivityParcelable::class.java)
                intent.putExtra(PindahActivityParcelable.EXTRA_CARS, cars)
                startActivity(intent)
            }

        }
    }
}