package belajar.android.dasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahDataActivity : AppCompatActivity() {
    private lateinit var tvPenerima: TextView

    companion object {
        const val EXTRA_TEXT = "extra text"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data)

        tvPenerima = findViewById(R.id.tv_terima_data)

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "text yang dikirim $tvReceived"

        tvPenerima.text = text
    }
}