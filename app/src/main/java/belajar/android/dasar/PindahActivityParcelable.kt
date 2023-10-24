package belajar.android.dasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahActivityParcelable : AppCompatActivity() {
    private lateinit var tvPenerimaParcelable: TextView
    companion object {
        const val EXTRA_CARS = "extra cars"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_parcelable)

        tvPenerimaParcelable = findViewById(R.id.tv_penerima_parcelable)

        val cars = intent.getParcelableExtra<Cars>(EXTRA_CARS) as Cars
        val text = "Merek : ${cars.name.toString()} \n Tahun: ${cars.tahun}"

        tvPenerimaParcelable.text = text
    }
}